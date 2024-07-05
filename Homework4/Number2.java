package java_ss1.Homework4;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // a đảo ngược số
        System.out.println("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.println("Đảo ngược số a là " + reversedNumber(a));
        //b số đối xứng
        if (isReversedNumber(a) == true) {
            System.out.println(a +"là số đối xứng");
        }
        else {
            System.out.println( a+ "không phải là số đối xứng");
        }
        //c có phải số chính phương
        if (isReversedNumber(a)){
            System.out.println(a + " Là số chính phương");
        } else {
            System.out.println(a + " không là số chính phương");
        }
        //d có phải số nguyên tố
        if (isPrimeNum(a)) {
            System.out.println(a + " là số nguyên tố");
        }
        else {
            System.out.println(a +" không phải là số nguyên tố");
        }
        //e Tổng các chữ số lẻ
        System.out.println("Tổng các chữ số lẻ của " + a + " là : " + sumLe(a));
        //f Tổng các chữ số nguyên tố
        System.out.println("Tổng các chữ số nguyên tố của " + a + " là : " + sumNt(a));
        //g Tổng các số chính phương
        System.out.println("Tổng các chữ số chính phương của " + a + " là : " + sumsquare(a));
    }
    //a
    static int reversedNumber (int a){
        int b = 0;
        while (a!=0){
            int count = a %10;
            b = b * 10+ count;
            a/=10;
        }
        return b;
    }
    //b
    static boolean isReversedNumber (int b){
        return b == reversedNumber(b);

    }
    //c
    static boolean isSquareNum(int c){
        return Math.sqrt(c) % 1 == 0;
    }
    //d
    static boolean isPrimeNum(int d){
        if (d < 2) {
            return false;
        }
        else {
            return true;
        }
    }
    //e
    static int sumLe (int a){
        int sum = 0;
        while ((a != 0)) {
            int b = a % 10;
            if (b % 2 == 1) {
                sum += b;
            }
            a /=10;
        }
        return sum;
    }
    static int sumNt (int a) {
        int sum = 0;
        while ((a != 0)) {
            int b = a % 10;
            if (isPrimeNum(b)) {
                sum += b;
            }
            a /=10;
        }
        return sum;
    }
    static int sumsquare (int a) {
        int sum = 0;
        while ((a != 0)) {
            int b = a % 10;
            if (isSquareNum(b)) {
                sum += b;
            }
            a /=10;
        }
        return sum;
    }

}
