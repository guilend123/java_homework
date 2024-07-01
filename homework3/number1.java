package java_ss1.homework3;

import java.util.Scanner;

/**
 *in ra giá trị từ 1 đến n
 */
public class number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số n");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println(i);//"/t" cách từng ô
        }
    }
}
