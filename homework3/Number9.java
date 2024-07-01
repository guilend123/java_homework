package java_ss1.homework3;

import java.util.Scanner;

public class Number9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhâp n: ");
        int n = scanner.nextInt();
        int distance = 2;
        int count = 1;
        int a = 1;
        while (a <= n) {
            System.out.print(a + "  ");
            a = 2 * a + 1;
            count++;
            if (distance == count){
                System.out.println(-a + "  ");
                count=1;
            }
        }
    }
}

