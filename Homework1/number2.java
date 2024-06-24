package java_ss1.Homework1;

import java.util.Scanner;

public class number2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a ");
        int a = scanner.nextInt();
        System.out.println("Nhập số b ");
        int b = scanner.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuong = a / b;
        //xuất
        System.out.println("Tổng :" + tong);
        System.out.println("Hiệu :" + hieu);
        System.out.println("Tích :" + tich);
        System.out.println("Thương :" + thuong);
    }
}
