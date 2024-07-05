package java_ss1.Homework4;

import java.util.Scanner;

public class Number6 {
    static String hoTen;
    static int tuoi;
    static String gioiTinh;
    static double luongCoBan;
    static double diemTrungBinh;

    public static void main(String[] args) {
        nhapThongTin();
        xuatThongTin();
    }

    static void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập họ và tên");
        hoTen = scanner.nextLine();
        System.out.println("Nhập tuổi ");
        tuoi = scanner.nextInt();
        System.out.println("Nhập giới tính");
        gioiTinh = scanner.nextLine();
        System.out.println("Nhập lương cơ bản ");
        luongCoBan = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập điểm trung bình ");
        diemTrungBinh = Double.parseDouble(scanner.nextLine());
    }

    static void xuatThongTin() {
        System.out.println("Tên " + hoTen);
        System.out.println("Tuổi " + tuoi);
        System.out.println("Giới tính " + gioiTinh);
        System.out.println("lương cơ bản " + luongCoBan);
        System.out.println("Điểm trung bình " + diemTrungBinh);
    }
}
