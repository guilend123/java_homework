package java_ss1.Homework1;


import java.util.Scanner;

public class number1 {
    public static void main(String[] args) {
        // nhập năm sinh
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm sinh của bạn");
        int yearofBirth = scanner.nextInt();
        // xài java.time.year.now() lấy năm hiện tại
        int currentYear = java.time.Year.now().getValue();

        int age = currentYear - yearofBirth;

        System.out.println("tuổi của bạn là: " + age);


    }
}
