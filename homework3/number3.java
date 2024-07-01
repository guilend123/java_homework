package java_ss1.homework3;

import java.util.Scanner;

public class number3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số n");
        int n = scanner.nextInt();
        for (int i = 2; i <= n; i+=2) {
            if (i % 4 == 0) {
                System.out.println(-i);
            } else {
                System.out.println(i);
            }
        }
    }
}
