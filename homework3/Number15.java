package java_ss1.homework3;

import java.util.Scanner;

public class Number15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài của cạnh");
        int canh = scanner.nextInt();
        System.out.println("A");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh; j++){
                if (i==1 || i == canh || j == 1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("B");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh; j++){
                if (i==1 || i == canh || j == canh ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("C");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh; j++){
                if (i== canh || j == canh || j == 1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
