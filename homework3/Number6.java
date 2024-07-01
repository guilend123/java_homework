package java_ss1.homework3;

import java.util.Scanner;

public class Number6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int distance = 0;
        System.out.println("Nhập n");
        int n = scanner.nextInt();
        for (int i = 0;i < n; i +=2){
            if(count == distance){
                System.out.print(-i+" ");
                count++;
            }
            else {
                System.out.print(i +" ");
                distance++;
            }
        }
    }
}
