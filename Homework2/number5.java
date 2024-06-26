package java_ss1.Homework2;

import java.util.Scanner;

public class number5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phương trình bậc 1  ax + b = 0");
        System.out.println("Vui lòng nhập số a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("Vui lòng nhập số b: ");
        double b = Double.parseDouble(scanner.nextLine());
        if (a == 0){
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là :" + x);
        }
    }
}
