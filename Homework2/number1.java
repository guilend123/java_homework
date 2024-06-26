package java_ss1.Homework2;

public class number1 {
    public static void main(String[] args) {
        boolean a = true && false; //false
        boolean b = (3 > 100) || (25 % 5 == 0); //false || true = true
        boolean c = a && b;// true && false = false
        boolean d = !a || b;// true || true = true

        System.out.println("c = " + c);//false
        System.out.println("d = " + d);//true
    }
}
