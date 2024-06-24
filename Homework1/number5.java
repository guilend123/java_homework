package java_ss1.Homework1;

import java.util.Scanner;

public class number5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập bán kính
        System.out.println("Vui lòng nhập bán kính đường tròn: ");
        double r = scanner.nextDouble();

        double c = 2 * Math.PI * r;
        double a = Math.PI * Math.pow(r,2);

        System.out.println("chu vi đường tròn: " + c);
        System.out.println("diện tích đường tròn: " + a);
    }
}
