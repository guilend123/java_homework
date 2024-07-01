package java_ss1.homework3;

import java.util.Scanner;

public class number5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n");
        int n = scanner.nextInt();
        for (int i = 1; i <= 2*n; i+=2){
            System.out.println(i);
        }
    }
}
