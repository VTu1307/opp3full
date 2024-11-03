public class testMyComplex {
    public static void main(String[] args) {
        // Tạo các đối tượng số phức để kiểm tra
        MyComplex c1 = new MyComplex(3.0, 4.0);  // Số phức: 3 + 4i
        MyComplex c2 = new MyComplex(1.0, -1.0); // Số phức: 1 - 1i
        MyComplex c3 = new MyComplex(3.0, 4.0);  // Số phức: 3 + 4i (giống c1)
        MyComplex c4 = new MyComplex(0.0, 0.0);  // Số phức: 0 + 0i

        // Test phương thức toString()
        System.out.println("c1 = " + c1); // Kết quả mong muốn: (3.0+4.0i)
        System.out.println("c2 = " + c2); // Kết quả mong muốn: (1.0-1.0i)

        // Test phương thức isReal() và isImaginary()
        System.out.println("c1 là số thực? " + c1.isReal());    // Kết quả mong muốn: false
        System.out.println("c1 là số ảo? " + c1.isImaginary()); // Kết quả mong muốn: false
        System.out.println("c4 là số thực? " + c4.isReal());    // Kết quả mong muốn: true
        System.out.println("c4 là số ảo? " + c4.isImaginary()); // Kết quả mong muốn: true

        // Test phương thức equals()
        System.out.println("c1 và c2 bằng nhau? " + c1.equals(c2)); // Kết quả mong muốn: false
        System.out.println("c1 và c3 bằng nhau? " + c1.equals(c3)); // Kết quả mong muốn: true

        // Test phương thức magnitude() và argument()
        System.out.println("Độ lớn của c1: " + c1.magnitude());  // Kết quả mong muốn: 5.0
        System.out.println("Góc của c1 (radians): " + c1.argument()); // Góc theo radian

        // Test phép toán cộng add()
        System.out.println("c1 + c2 = " + c1.addNew(c2)); // Kết quả mong muốn: (4.0+3.0i)

        // Test phép toán trừ subtract()
        System.out.println("c1 - c2 = " + c1.subtractNew(c2)); // Kết quả mong muốn: (2.0+5.0i)

        // Test phép toán nhân multiply()
        MyComplex c5 = c1.multiply(c2); // Nhân hai số phức
        System.out.println("c1 * c2 = " + c5); // Kết quả mong muốn: (7.0+1.0i)

        // Test phép toán chia divide()
        MyComplex c6 = c1.divide(c2); // Chia hai số phức
        System.out.println("c1 / c2 = " + c6); // Kết quả mong muốn: (-0.5+3.5i)

        // Test phép liên hợp conjugate()
        System.out.println("Liên hợp của c1: " + c1.conjugate()); // Kết quả mong muốn: (3.0-4.0i)
    }
}
