package java_ss1.Homework4;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui lòng nhập n: ");
        int n = scanner.nextInt();

        //a Tính S = 1 + 2 + 3... +n
        System.out.println("Tổng của S = 1 + 2 + 3... +n là: " + suma(n));
        //b Tính S = 1^2 + 2^2 + 3^2... +n^2
        System.out.println("Tổng của S = 1^2 + 2^2 + 3^2... +n^2 là: " + sumb(n));
        //c Tính S = 1 + 1/2 + 1/3... +1/n
        System.out.println("Tổng của S = 1 + 1/2 + 1/3... +1/n là: " + sumc(n));
        //d Tính S = 1 * 2 * 3... *n
        System.out.println("Tổng của S = S = 1 * 2 * 3... *n là: " + sumd(n));
        //e Tính S = 1! + 2! + 3!... +n!
        System.out.println("Tổng của S = 1! + 2! + 3!... +n! là: " + sume(n));
    }
    static int suma (int a){
        int sum  = 0;
        for (int i = 1; i < a; i++){
            sum+=i;
        }
        return sum;
    }
    static int sumb (int a){
        int sum  = 0;
        for (int i = 1; i < a; i++){
            sum+=i * i;
        }
        return sum;
    }
    static double sumc (int a){
        double sum  = 0;
        for (int i = 1; i < a; i++){
            sum += 1.0/i;
        }
        return sum;
    }
    static int sumd (int a){
        int sum  = 1;
        for (int i = 1; i < a; i++){
            sum *=i;
        }
        return sum;
    }
    static int sume (int a){
        int sum  = 0;
        int fac = 1;
        for (int i = 1; i < a; i++){
            fac *= i;
            sum +=fac;
        }
        return sum;
    }
}
