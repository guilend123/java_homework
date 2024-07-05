package java_ss1.homework3;

import java.util.Scanner;

public class Number12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int t = 1;
        System.out.println("Vui lòng nhập n: ");
        int n = scanner.nextInt();
        while (n > 0){
            int b = n %10;
            sum += b;
            t *=b;
            n /=10;
        }
        System.out.println("Tổng các chữ số trong n là" + sum);
        System.out.println("Tích các chữ số trong n là: " + t);
    }
}
