package java_ss1.homework3;

import java.util.Scanner;

public class Number11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n");
        int n = scanner.nextInt();
        double sum = 0.0;
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            int z = 2 * i - 1;
            for (int j = 1; j <= z; j++) {
                if (j == z) {
                    sum += 1.0 / (fac * z);
                    fac = 1;
                } else {
                    fac *= j;
                }
            }

        }
        System.out.println("Tổng là: " + sum);
    }
}
