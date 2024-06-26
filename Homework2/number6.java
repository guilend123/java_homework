package java_ss1.Homework2;

import java.util.Scanner;

public class number6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Phương trình bậc 2 có dạng ax2 + bx + c = 0");
        System.out.println("Nhập giá trị của a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập giá trị của b: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập giá trị của c: ");
        double c = Double.parseDouble(scanner.nextLine());

        if (a == 0) {
            if (b == 0){
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                }else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiệm của phương trình là :" + x);
            }
        } else {
            double delta = Math.pow(b,2) - 4 * a * c;
            if (delta < 0){
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Nghiệm duy nhất của phương trình là :" + x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2*a);
                double x2 = (-b + Math.sqrt(delta)) / (2*a);

                System.out.println("Nghiệm của phương trình là x1 = " + x1 + "và nghiệm thứ 2 của phương trình là x2 = " + x2);
            }

        }

    }
}
