package java_ss1.Homework2;

import java.util.Scanner;

public class number9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ký tự: ");
        char character = scanner.next().charAt(0);

        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')){

            if (character >= 'a' && character <= 'z'){
                character -=32;
            }else {
                character +=32;
            }
            System.out.println("Ký tự sau khi đổi " + character);
        } else {
            System.out.println("Chữ bạn đã nhập không phải một ký tự");
        }


    }
}
