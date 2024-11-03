public class testMyTime {
    public static void main(String[] args) {
        MyTime Time1 = new MyTime(14,10,12);
        System.out.println(Time1.toString());
        MyTime Time2 = new MyTime(14,11, 5);
        Time2.nextSecond();
        Time2.nextMinute();
        Time2.nextHour();
        System.out.println(Time2.toString());
        Time2.previousSecond();
        System.out.println(Time2.toString());
        Time2.setHour(23);
        Time2.setMinute(59);
        Time2.setSecond(59);
        Time2.nextSecond();

    }
}
