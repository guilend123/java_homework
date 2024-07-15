package java_ss1.Homework7;

import java.util.Scanner;

public class Number2 {
    static String[] hoTen = new String[5];
    static int[] tuoi = new int[5];
    static String[] gioiTinh = new String[5];
    static double[] mucLuong = new double[5];
    static double[] diemTrungBinh = new double[5];
    static int soLuongNhanVien = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chose;
        do {
            nhapThongTin(soLuongNhanVien);
            soLuongNhanVien++;
            System.out.println("Nhấn yes để tiếp tục, No để dừng lại ");
            chose = scanner.nextLine();
        } while (chose.equalsIgnoreCase("Yes") || chose.equalsIgnoreCase("y"));

        for (int i = 0; i < soLuongNhanVien; i++) {
            System.out.println("Thông tin nhân viên thứ " + (i + 1) );
            xuatThongTin1(i);
        }
    }

    static void nhapThongTin(int index) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên");
        hoTen[index] = scanner.nextLine();
        System.out.println("Nhập vào tuổi");
        tuoi[index] = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính");
        gioiTinh[index] = scanner.nextLine();
        System.out.println("Nhập vào mức lương");
        mucLuong[index] = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào điểm trung bình");
        diemTrungBinh[index] = Double.parseDouble(scanner.nextLine());
    }

    static void xuatThongTin1(int index) {
        System.out.println("Họ và tên: " + hoTen[index]);
        System.out.println("Tuổi nhân viên: " + tuoi[index]);
        System.out.println("Giới tính: " + gioiTinh[index]);
        System.out.println("Mức lương: " + mucLuong[index]);
        System.out.println("điểm trung bình: " + diemTrungBinh[index]);
    }
}
