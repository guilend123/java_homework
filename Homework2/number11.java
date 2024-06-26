package java_ss1.Homework2;

import java.util.Scanner;

public class number11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ngày : ");
        int day = scanner.nextInt();

        System.out.println("Nhập tháng: ");
        int month = scanner.nextInt();

        System.out.println("Nhập năm: ");
        int year = scanner.nextInt();
        boolean leapyear =(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        //xét ngày hợp lệ hay không
        if (day < 1 || day > 31) {
            System.out.println("Ngày không hợp lệ");
            return;
        }
        if (month < 1 || month > 12) {
            System.out.println("Tháng không hợp lệ");
            return;
        }

        if (month == 2) {
            if (leapyear) {
                if (day > 29) {
                    System.out.println("ngày không hợp lệ");
                    return;
                }

            } else {
                if (day > 28) {
                    System.out.println("ngày không hợp lệ");
                    return;
                }
            }

        } else if (day == 31) {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("ngày không hợp lệ");
                return;
            }
        }
        System.out.println("Ngày hợp lệ");
        int nextDay = day;
        int nextMonth = month;
        int nextyear = year;
        int preDay = day;
        int preMonth = month;
        int preYear = year;

        nextDay++;
        preDay--;

        if(nextDay> 31 ||(month == 2 && nextDay > (leapyear? 29 :28))
                || ((month == 4 || month == 6 || month == 9 || month == 11) && nextDay > 30)) {
            nextDay = 1;
            nextMonth++;
        }
        if (nextMonth > 12){
            nextMonth =1;
            nextyear++;
        }
        System.out.printf("ngày tiếp theo ngày đã nhập  là %d/%d/%d", nextDay,nextMonth,nextyear);
        System.out.println();
        if (preDay < 1) {
            preMonth--;
            if(preMonth == 4 || preMonth == 6 || preMonth == 9 || preMonth == 11){
                preDay = 30;
            } else if (preMonth == 2) {
                preDay = leapyear? 29: 28;
            }else {
                preDay = 31;
            }

        }
        if (preMonth < 1){
            preYear--;
            preMonth = 12;
        }
        System.out.printf("ngày trước ngày đã nhập  là %d/%d/%d", preDay,preMonth,preYear);
    }
}
