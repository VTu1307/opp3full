public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTH = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };
    public static final String[] DAY = {
            "Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday"
    };
    public static final int[] DAYS_IN_MONTHS = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return false;
        }
        int daysInMonth = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            daysInMonth = 29;
        }
        return day >= 1 && day <= daysInMonth;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int y = (month < 3) ? year - 1 : year;
        int m = (month < 3) ? month + 12 : month;
        int d = day;
        int h = (d + (13 * (m + 1)) / 5 + y + (y / 4) - (y / 100) + (y / 400)) % 7;
        return (h + 5) % 7;
    }

    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Ngày không hợp lệ");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (isValidDate(year, this.month, this.day)) {
            this.year = year;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (isValidDate(this.year, month, this.day)) {
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (isValidDate(this.year, this.month, day)) {
            this.day = day;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d %s %04d", day, MONTH[month - 1], year);
    }

    public MyDate nextDay() {
        if (isValidDate(year, month, day + 1)) {
            day++;
        } else if (isValidDate(year, month + 1, 1)) {
            day = 1;
            month++;
        } else {
            day = 1;
            month = 1;
            year++;
        }
        return this;
    }

    public MyDate nextMonth() {
        if (isValidDate(year, month + 1, day)) {
            month++;
        } else if (isValidDate(year + 1, 1, day)) {
            month = 1;
            year++;
        } else {
            day = Math.min(day, DAYS_IN_MONTHS[0]);
        }
        return this;
    }

    public MyDate nextYear() {
        if (isValidDate(year + 1, month, day)) {
            year++;
        } else {
            day = 28;
        }
        return this;
    }

    public MyDate previousDay() {
        if (isValidDate(year, month, day - 1)) {
            day--;
        } else if (month > 1) {
            month--;
            day = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) {
                day = 29;
            }
        } else {
            year--;
            month = 12;
            day = 31;
        }
        return this;
    }

    public MyDate previousMonth() {
        if (isValidDate(year, month - 1, day)) {
            month--;
        } else if (year > 1) {
            month = 12;
            year--;
        } else {
            day = Math.min(day, DAYS_IN_MONTHS[0]);
        }
        return this;
    }

    public MyDate previousYear() {
        if (isValidDate(year - 1, month, day)) {
            year--;
        } else {
            day = 28;
        }
        return this;
    }
}
