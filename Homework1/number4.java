package java_ss1.Homework1;

import java.util.Scanner;

public class number4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập điểm
        System.out.println("Nhập điểm môn toán: ");
        double diemtoan = scanner.nextDouble();
        System.out.println("Nhập điểm môn Lý: ");
        double diemLy = scanner.nextDouble();
        System.out.println("Nhập điểm môn Hóa: ");
        double diemHoa = scanner.nextDouble();
        //Nhập hệ số
        System.out.println("Nhập hệ số môn toán: ");
        double heSoToan = scanner.nextDouble();
        System.out.println("Nhập hệ số môn lý: ");
        double heSoLy = scanner.nextDouble();
        System.out.println("Nhập hệ số môn hóa: ");
        double heSoHoa = scanner.nextDouble();
        //Tính
        double diemTb = (diemtoan * heSoToan + diemLy * heSoLy + diemHoa * heSoHoa)/ (heSoHoa + heSoToan + heSoLy);
        //In
        System.out.println("Điểm trung bình: " + diemTb);


    }
}
