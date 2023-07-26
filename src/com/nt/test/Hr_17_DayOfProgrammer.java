package com.nt.test;
public class Hr_17_DayOfProgrammer {

    static String dayOfProgrammer(int year) {
        int day = 0;
        int month = 0;

        if (year == 1918) {
            // Special case: Transition year from Julian to Gregorian calendar
            day = 26;
            month = 9;
        } else if (year < 1918) {
            // Julian calendar
            if (year % 4 == 0) {
                day = 12;
                month = 9;
            } else {
                day = 13;
                month = 9;
            }
        } else {
            // Gregorian calendar
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                day = 12;
                month = 9;
            } else {
                day = 13;
                month = 9;
            }
        }

        return String.format("%02d.%02d.%04d", day, month, year);
    }

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(2017)); // Output: 13.09.2017
        System.out.println(dayOfProgrammer(2016)); // Output: 12.09.2016
        System.out.println(dayOfProgrammer(1800)); // Output: 12.09.1800
    }
}
