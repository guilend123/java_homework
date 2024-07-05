package java_ss1.Homework4;

import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập số lượng phần tử fibonanci");
        int n = scanner.nextInt();
        System.out.println("Các giá trị của dãy fibonanci là: ");
        print(n);
    }
    static void print(int n){
        int f1 = 0;
        int f2 = 1;
        int fn = 1;
        for (int i = 1; i<= n; i++){
            System.out.print(fn + "\t");
            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
        }
    }
}
