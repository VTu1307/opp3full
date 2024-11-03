public class TestMyDate {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(2012, 2, 28);
        System.out.println(d1);              // Thứ Ba ngày 28 tháng 2 năm 2012 System.out.println(d1.nextDay()); // Thứ Tư ngày 29 tháng 2 năm

        System.out.println
                (d1.nextDay()); // Thứ Năm ngày 1 tháng 3 năm 2012 System.out.println(d1.nextMonth()); // Chủ Nhật ngày 1 tháng 4 năm 2012
        System.out.println(d1.nextYear());   // Thứ Hai ngày 1 tháng 4 năm 2013

        MyDate d2 = new MyDate(2012, 1, 2);
        System.out.println(d2);                  // Thứ Hai ngày 2 tháng 1 năm 2012
        System.out.println(d2.previousDay());    // Chủ Nhật ngày 1 tháng 1 năm 2012
        System.out.println(d2.previousDay());    // Thứ Bảy, ngày 31 tháng 12 năm 2011
        System.out.println(d2.previousMonth()); // Thứ Tư , ngày 30 tháng

        System.out.println(d2.previousYear());   // Thứ Ba, ngày 30 tháng 11 năm 2010
        MyDate d3 = new MyDate(2012, 2, 29);
        System.out.println(d3.previousYear());   // Thứ Hai, ngày 28 tháng 2 năm 2011

// MyDate d4 = new MyDate(2099, 11, 31); // Năm, tháng hoặc ngày không hợp lệ!
// MyDate d5 = new MyDate(2011, 2, 29);   // Năm, tháng hoặc ngày không hợp lệ!
    }
}
