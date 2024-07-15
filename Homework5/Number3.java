package java_ss1.Homework5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi a: ");
        String a = scanner.nextLine();
        System.out.println("Nhập vào chuỗi b: ");
        String b = scanner.nextLine();
        int compare = a.compareTo(b);
        if (compare < 0) {
            System.out.println("a<b");
        }
        else if (compare > 0) {
            System.out.println(" a > b");
        }
        else {
            System.out.println("a = b");
        }
    }
}
