package java_ss1.Homework1;

import java.util.Scanner;

public class number6 {
    public static void main(String[] args) {
        //Nhập biển số xe
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biển số xe của bạn");
        int n = scanner.nextInt();
        //tính số tổng biển số xe
        int sum = n % 10; // chia lấy dư
        n = n/10;
        sum += n % 10;
        n = n/10;
        sum += n % 10;
        n = n/10;
        sum += n % 10;
        n = n/10;
        sum += n;
        System.out.println("Tổng biển số của bạn là: " + sum);

    }
}
