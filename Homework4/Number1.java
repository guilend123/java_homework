package java_ss1.Homework4;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //a chuyển từ in hoa sang in thường
        System.out.println("Nhập 1 chữ cái: ");
        char a = scanner.next().charAt(0);

        System.out.println("Ký tự sau khi chuyển từ in hoa sang in thường: " + toLowCase(a) );
        //b phương trình bậc nhất ax + b = 0
        System.out.println("Phương trình bậc nhất");
        System.out.println("Nhập hệ số a");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập hệ số b");
        double c = Double.parseDouble(scanner.nextLine());
        System.out.println("kết quả phương trình là: ");
        Ptbn(b,c);
        //c Giải phương trình bậc 2 ax^2 + bx + c = 0
        System.out.println("Phương trình bậc 2");
        System.out.println("Nhập hệ số a");
        double d = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập hệ số b");
        double e = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập hệ số c");
        double f = Double.parseDouble(scanner.nextLine());
        System.out.println("kết quả phương trình là: ");
        Ptb2(d,e,f);
        //d Tìm số nhỏ nhất giữa 4 số nguyên
        System.out.println("Tìm số nhỏ nhất 4 số nguyên");
        System.out.println("Nhập số thứ nhất");
        int g = scanner.nextInt();
        System.out.println("Nhập số thứ hai");
        int h = scanner.nextInt();
        System.out.println("Nhập số thứ ba");
        int j = scanner.nextInt();
        System.out.println("Nhập số thứ bốn");
        int k = scanner.nextInt();
        System.out.println("Giá trị nhỏ nhất giữa 4 số là: " + Min4(g,h,j,k));

    }
    //a
    static char toLowCase(char a){
        if (a >= 'A' && a <= 'Z'){
            a+=32;
        }
        return a;
    }
    //b
    static  void Ptbn (double a, double b){
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
    //c
    static void Ptb2 (double a, double b ,double c){
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
    //d
    static int Min4(int a, int b, int c, int d){
        int min = Math.min(a, b);
        min = Math.min(min, c);
        min = Math.min(min, d);
        return min;

    }

}
