package java_ss1.Homework2;
import java.util.Scanner;

public class number3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui lòng nhập số a: ");
        int a = scanner.nextInt();

        System.out.println("vui lòng nhập số b: ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Giá trị của a và b khi đảo ngược là: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
