package java_ss1.Homework2;

import java.util.Scanner;

public class number8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng: ");
        int month = scanner.nextInt();

        System.out.println("Nhập năm: ");
        int year = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Số ngày trong tháng này có 31 ngày");
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("Số ngày trong tháng này có 29 ngày");
                } else {

                    System.out.println("Số ngày trong tháng này có 28 ngày");
                }
                break;
            default:
                System.out.println("số ngày trong tháng này có 30 ngày");
        }
    }
}
