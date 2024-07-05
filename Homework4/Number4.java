package java_ss1.Homework4;

import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập số a : ");
        int a = scanner.nextInt();
        System.out.println("Vui lòng nhập số b : ");
        int b = scanner.nextInt();
        System.out.println("Ước số chung lớn nhất của a và b là: " + big(a,b));
    }

    static int big(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        if (max % min == 0) {
            return min;
        }
        for (int i = min / 2; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
