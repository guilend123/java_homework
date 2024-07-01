package java_ss1.homework3;

import java.util.Scanner;

public class Number7 {
    public static void main(String[] args) {
        int f1 = 1;
        int f2 = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n");
        int n = scanner.nextInt();
        while (f1<=n){
            int fn = f1 + f2;
            f1 = f2;
            f2 = fn;
            System.out.println(f1 + " ");
        }
    }
}
