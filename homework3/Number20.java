package java_ss1.homework3;

import java.util.Scanner;

public class Number20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap so nguyen duong a: ");
        int a = scanner.nextInt();
        System.out.print("Hay nhap so nguyen duong b: ");
        int b = scanner.nextInt();
        System.out.print("Hay nhap so nguyen duong c: ");
        int c = scanner.nextInt();

        int sum = 0;
        int p = 1;

        for (int i = 1; i <= a; i++) {
            p = i * p;
        }
        sum = p + sum;
        p = 1;
        for (int i = 1; i <= b; i++) {
            p = i * p;
        }
        sum = p + sum;
        p = 1;
        for (int i = 1; i <= c; i++) {
            p = i * p;
        }
        sum = p + sum;
        System.out.print("Tong gia thua cac so a,b,c la: " + sum);
    }
}
