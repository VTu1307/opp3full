public class testMyPolynomial {
    public static void main(String[] args) {
        // Tạo hai đa thức
        MyPolynomial p1 = new MyPolynomial(1.0, -2.0, 1.0);  // 1.0x^2 - 2.0x + 1.0
        MyPolynomial p2 = new MyPolynomial(2.0, 0.0, 3.0);   // 2.0x^2 + 3.0

        // Hiển thị đa thức
        System.out.println("Đa thức p1: " + p1);
        System.out.println("Đa thức p2: " + p2);

        // Tính giá trị của đa thức tại x = 2
        double x = 2.0;
        System.out.println("Giá trị của p1 tại x = " + x + " là: " + p1.evaluate(x));

        // Cộng hai đa thức
        MyPolynomial sum = p1.add(p2);
        System.out.println("Tổng của p1 và p2: " + sum);

        // Nhân hai đa thức
        MyPolynomial product = p1.multiply(p2);
        System.out.println("Tích của p1 và p2: " + product);
    }
}
