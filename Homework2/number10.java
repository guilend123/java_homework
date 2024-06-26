package java_ss1.Homework2;

import java.util.Scanner;

public class number10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số x: ");
        int x = scanner.nextInt();

        double sqrt = Math.sqrt(x);

        if (sqrt % 1 == 0 ){
            System.out.println(x + "là số chính phương");
        }else {
            System.out.println(x +" không phải là số chính phương");
        }

    }
}
