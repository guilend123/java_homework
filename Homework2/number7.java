package java_ss1.Homework2;

import java.util.Scanner;

public class number7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thâm niên công tác: ");
        int tnct = scanner.nextInt();

        if(tnct < 12){
            double x = 1.92 * 650000;
            System.out.println("Lương của nhân viên là :" + x);
        } else if (tnct < 36){
            double x = 2.34 * 650000;
            System.out.println("Lương của nhân viên là :" + x);
        } else if (tnct < 60) {
            double x = 3 * 650000;
            System.out.println("Lương của nhân viên là :" + x);
        } else {
            double x = 4.5 * 650000;
            System.out.println("Lương của nhân viên là :" + x);
        }

    }
}
