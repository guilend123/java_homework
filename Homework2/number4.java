package java_ss1.Homework2;

import java.util.Scanner;

public class number4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui lòng nhập số a: ");
        int a = scanner.nextInt();

        System.out.println("Vui lòng nhập số b: ");
        int b = scanner.nextInt();

        int max = (a > b)? a : b;
        int min = (a < b)? a : b;
        System.out.println("Số lớn nhất là: " + max);
        System.out.println("số nhỏ nhất là : " + min);
    }
}
