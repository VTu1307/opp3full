public class MyPolynomial {
    private double[] coeffs;
    public MyPolynomial(double ... coeffs) {
        this.coeffs = coeffs;

    }
    public int getDegree() {
        return coeffs.length - 1;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = getDegree(); i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (sb.length() > 0 && coeffs[i] > 0) {
                    sb.append(" + ");
                }
                if (i > 1) {
                    sb.append(coeffs[i]).append("x^").append(i);
                } else if (i == 1) {
                    sb.append(coeffs[i]).append("x");
                } else {
                    sb.append(coeffs[i]);
                }
            }
        }
        return sb.toString();
    }
    public double evaluate(double x) {
        double result = 0;
        for (int i = getDegree(); i >= 0; i--) {
            result = result * x + coeffs[i];
        }
        return result;
    }
    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] resultCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            double a = (i <= this.getDegree()) ? this.coeffs[i] : 0;
            double b = (i <= right.getDegree()) ? right.coeffs[i] : 0;
            resultCoeffs[i] = a + b;
        }

        return new MyPolynomial(resultCoeffs);
    }
    public MyPolynomial multiply(MyPolynomial right) {
        int newDegree = this.getDegree() + right.getDegree();
        double[] resultCoeffs = new double[newDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                resultCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }

        return new MyPolynomial(resultCoeffs);
    }
}





