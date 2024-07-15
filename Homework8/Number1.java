package java_ss1.Homework8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Number1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.println("Vui lòng nhập n:");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Vui lòng nhập số n > 0 để tiếp tục");
            }
        } while (n <= 0);
        int[] arr = new int[n];
        inPutArray(arr);
        System.out.println("Các phần tử trong mảng");
        outPutArray(arr);
        System.out.println("Tách thành mảng có chứa số nguyên tố");
        int[] brr = arrayPrime(arr);
        outPutArray(brr);
        System.out.println("Các số nguyên dương trong mảng a " + Arrays.toString(arrayPlus(arr)));
        System.out.println("Các số khác số nguyên dương trong mảng a " + Arrays.toString(arrayMinius(arr)));
        //c sắp xếp các mảng giảm dần
        System.out.println("Săp xếp các mảng giảm dần");
        changeDown(arr);
        System.out.println("Mảng sau khi sắp xếp giảm dần " + Arrays.toString(arr) );
        System.out.println("Mảng sau khi sắp xếp đặc biệt " + Arrays.toString(change(arr)));
        // Đảo mảng đầu và cuối
        daoMang(arr);
        System.out.println("Mảng sau khi đảo là " + Arrays.toString(arr));
        // Kiểm tra xem mảng có đối xứng hay không
        if(isDoiXung(arr)){
            System.out.println(" Là Mảng đối xứng");

        }
        else {
            System.out.println("Mảng không đối xứng");
        }
        // đếm cặp đối xứng
        System.out.println("Các cặp đối xứng " + countDoiXung(arr));
    }

    static void inPutArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập từng phần tử của mảng ");
            arr[i] = scanner.nextInt();
        }
    }

    static void outPutArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }

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

    static int[] arrayPrime(int[] arr) {
        int countPrinme = 0;
        for (int i = 0; i < arr.length; i++) {// đếm số lượng số nguyên tố
            if (isPrime(arr[i])) {
                countPrinme++;
            }
        }
        int[] brr = new int[countPrinme];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                brr[index] = arr[i];
                index++;
            }
        }
        return brr;
    }

    static int[] arrayPlus(int[] arr) {
        int countPrinme = 0;
        for (int i = 0; i < arr.length; i++) {// đếm số lượng số nguyên tố
            if (arr[i] > 0) {
                countPrinme++;
            }
        }
        int[] brr = new int[countPrinme];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                brr[index] = arr[i];
                index++;
            }
        }
        return brr;
    }

    static int[] arrayMinius(int[] arr) {
        int countPrinme = 0;
        for (int i = 0; i < arr.length; i++) {// đếm số lượng số nguyên tố
            if (arr[i] <= 0) {
                countPrinme++;
            }
        }
        int[] brr = new int[countPrinme];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                brr[index] = arr[i];
                index++;
            }
        }
        return brr;
    }

    static void changeDown(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
            }
        }
    }

    static void changeUp(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
            }
        }
    }

    static int[] change(int[] arr) {
        int[] plus = arrayPlus(arr);
        changeDown(plus);
        int[] minius = arrayMinius(arr);
        changeUp(minius);
        int[] tong = new int[arr.length];
        for (int i = 1; i < plus.length; i++) {
            tong[i] = plus[i];
        }
        for (int i = 1; i < minius.length; i++) {
            tong[i + plus.length] = minius[i];
        }
        return tong;
    }

    static void daoMang(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
    static boolean isDoiXung (int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
    static int countDoiXung (int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]){
                count++;
            }
        }
        return count;
    }
}
