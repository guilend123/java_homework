package java_ss1.homework3;

import java.util.Scanner;

public class Number21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap n: ");
        int n = scanner.nextInt();
        String s = String.valueOf(n);

        boolean isDoiXung = true;
        //12021
        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                System.out.println(" n khong phai la so doi xung");
                isDoiXung = false;
                break;
            }
        }
        if (isDoiXung) {
            System.out.println(" n la so doi xung");
        }
    }
}
