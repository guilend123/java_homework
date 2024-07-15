package java_ss1.Homework7;

import java.util.Scanner;

public class Number1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //1 thao tác nhập xuất

        int n;
        do {
            System.out.println("Vui lòng nhập n");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Vui lòng nhập số n > 0");
            }
            System.out.println("Nhâp vào số lượng phần tử trong mảng");
        } while (n <= 0);
        int[] arr = new int[n];
        //Nhập mảng
        inputArray(arr);
        //xuất mảng
        outputArray(arr);
        //2 thao tách kiểm tra
        //Kiểm tra mảng toàn chẵn
        System.out.println("Kiểm tra mảng có toàn chẵn hay không");
        if (isEven(arr)) {
            System.out.println("Mảng toàn chẵn");
        } else {
            System.out.println("Mảng không toàn chẵn");
        }
        // Kiểm tra mảng có toàn là số nguyên tố hay không
        if (isallPrime(arr)) {
            System.out.println("Mảng toàn là số nguyên tố");
        } else {
            System.out.println("Mảng không toàn là số nguyên tố");
        }
        // Kiểm tra xem mảng có tăng dần hay không
        if (isUp(arr)) {
            System.out.println("Mảng tăng dần");
        } else {
            System.out.println("Mảng không tăng dần");
        }
    }

    static void inputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập từng phần tử trong mảng");
            arr[i] = scanner.nextInt();
        }
    }

    static void outputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }

    //Kiểm tra chẵn lẽ
    static boolean isEven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
    // Kiểm tra số nguyên tố

    static boolean isPrime(int num) {// tìm số nguyên tố trong mảng
        if (num < 1) {
            return false;

        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isallPrime(int[] arr) {
        for (int num : arr) {
            if (!isPrime(num)) {
                return false;
            }
        }
        return true;
    }

    // Kiểm tra mảng có tăng dần hay khong
    static boolean isUp(int[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
