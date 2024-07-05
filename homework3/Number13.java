package java_ss1.homework3;

import java.util.Scanner;

public class Number13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập a ");
        int a = scanner.nextInt();
        System.out.println("Vui lòng nhập b ");
        int b = scanner.nextInt();
        int uscln = 1;
        int bscnn = 1;
        for (int i = a; i>=1; i--){
            if (a % i == 0 && b % i == 0) {
                uscln = i;
            }
        }
        for (int i = a; true; i++){
            if (i % a == 0 && i % b == 0) {
                bscnn = i;
                break;
            }
        }
        System.out.println("ước số chung lớn nhất của a và b là: " + uscln);
        System.out.println("bội số chung nhỏ nhất của a và b là: " + bscnn);
    }
}
