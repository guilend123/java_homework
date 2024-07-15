package java_ss1.Homework4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Number7 {
    static String hoTen1;
    static int tuoi1;
    static String gioiTinh1 ;
    static double mucLuong1;
    static double diemTrungBinh1;

    static String hoTen2;
    static int tuoi2;
    static String gioiTinh2 ;
    static double mucLuong2;
    static double diemTrungBinh2;

    static String hoTen3;
    static int tuoi3;
    static String gioiTinh3 ;
    static double mucLuong3;
    static double diemTrungBinh3;

    static String hoTen4;
    static int tuoi4;
    static String gioiTinh4;
    static double mucLuong4;
    static double diemTrungBinh4;

    static String hoTen5;
    static int tuoi5;
    static String gioiTinh5;
    static double mucLuong5;
    static double diemTrungBinh5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập số lượng nhân viên");
            n = Integer.parseInt(scanner.nextLine());
            if (n < 0 || n > 5) {
                System.out.println("Số lượng nhân viên không hợp lệ vui lòng nhập lại");
            }
        }while (n < 0 || n > 5);
        switch (n){
            case 1:
                System.out.println("Nhập thông tin nhân viên số 1: ");
                nhapThongTin1();
                System.out.println("Xuất thông tin nhân viên số 1: ");
                xuatThongTin1();
                break;
            case 2:
                System.out.println("Nhập thông tin nhân viên số 1: ");
                nhapThongTin1();
                System.out.println("Nhập thông tin nhân viên số 2: ");
                nhapThongTin2();
                System.out.println("Xuất thông tin nhân viên số 1: ");
                xuatThongTin1();
                System.out.println("Xuất thông tin nhân viên số 2: ");
                xuatThongTin2();
                break;
            case 3:
                System.out.println("Nhập thông tin nhân viên số 1: ");
                nhapThongTin1();
                System.out.println("Nhập thông tin nhân viên số 2: ");
                nhapThongTin2();
                System.out.println("Nhập thông tin nhân viên số 3: ");
                nhapThongTin3();
                System.out.println("Xuất thông tin nhân viên số 1: ");
                xuatThongTin1();
                System.out.println("Xuất thông tin nhân viên số 2: ");
                xuatThongTin2();
                System.out.println("Xuất thông tin nhân viên số 3: ");
                xuatThongTin3();
                break;
            case 4:
                System.out.println("Nhập thông tin nhân viên số 1: ");
                nhapThongTin1();
                System.out.println("Nhập thông tin nhân viên số 2: ");
                nhapThongTin2();
                System.out.println("Nhập thông tin nhân viên số 3: ");
                nhapThongTin3();
                System.out.println("Nhập thông tin nhân viên số 4: ");
                nhapThongTin4();
                System.out.println("Xuất thông tin nhân viên số 1: ");
                xuatThongTin1();
                System.out.println("Xuất thông tin nhân viên số 2: ");
                xuatThongTin2();
                System.out.println("Xuất thông tin nhân viên số 3: ");
                xuatThongTin3();
                System.out.println("Xuất thông tin nhân viên số 4: ");
                xuatThongTin4();
                break;
            case 5:
                System.out.println("Nhập thông tin nhân viên số 1: ");
                nhapThongTin1();
                System.out.println("Nhập thông tin nhân viên số 2: ");
                nhapThongTin2();
                System.out.println("Nhập thông tin nhân viên số 3: ");
                nhapThongTin3();
                System.out.println("Nhập thông tin nhân viên số 4: ");
                nhapThongTin4();
                System.out.println("Nhập thông tin nhân viên số 5: ");
                nhapThongTin5();
                System.out.println("Xuất thông tin nhân viên số 1: ");
                xuatThongTin1();
                System.out.println("Xuất thông tin nhân viên số 2: ");
                xuatThongTin2();
                System.out.println("Xuất thông tin nhân viên số 3: ");
                xuatThongTin3();
                System.out.println("Xuất thông tin nhân viên số 4: ");
                xuatThongTin4();
                System.out.println("Xuất thông tin nhân viên số 5: ");
                xuatThongTin4();
                break;
        }
    }
    static void nhapThongTin1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên");
        hoTen1 = scanner.nextLine();
        System.out.println("Nhập vào tuổi");
        tuoi1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính");
        gioiTinh1 = scanner.nextLine();
        System.out.println("Nhập vào mức lương");
        mucLuong1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào điểm trung bình");
        diemTrungBinh1 = Double.parseDouble(scanner.nextLine());
    }
    static void nhapThongTin2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên");
        hoTen2 = scanner.nextLine();
        System.out.println("Nhập vào tuổi");
        tuoi2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính");
        gioiTinh2 = scanner.nextLine();
        System.out.println("Nhập vào mức lương");
        mucLuong2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào điểm trung bình");
        diemTrungBinh2 = Double.parseDouble(scanner.nextLine());
    }
    static void nhapThongTin3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên");
        hoTen3 = scanner.nextLine();
        System.out.println("Nhập vào tuổi");
        tuoi3 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính");
        gioiTinh3 = scanner.nextLine();
        System.out.println("Nhập vào mức lương");
        mucLuong3 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào điểm trung bình");
        diemTrungBinh3 = Double.parseDouble(scanner.nextLine());
    }
    static void nhapThongTin4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên");
        hoTen4 = scanner.nextLine();
        System.out.println("Nhập vào tuổi");
        tuoi4 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính");
        gioiTinh4 = scanner.nextLine();
        System.out.println("Nhập vào mức lương");
        mucLuong4 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào điểm trung bình");
        diemTrungBinh4 = Double.parseDouble(scanner.nextLine());
    }
    static void nhapThongTin5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên");
        hoTen5 = scanner.nextLine();
        System.out.println("Nhập vào tuổi");
        tuoi5 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính");
        gioiTinh5 = scanner.nextLine();
        System.out.println("Nhập vào mức lương");
        mucLuong5 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào điểm trung bình");
        diemTrungBinh5 = Double.parseDouble(scanner.nextLine());
    }
    static void xuatThongTin1(){
        System.out.println("Họ và tên: " + hoTen1);
        System.out.println("Tuổi nhân viên: " + tuoi1);
        System.out.println("Giới tính: " + gioiTinh1);
        System.out.println("Mức lương: " + mucLuong1 );
        System.out.println("điểm trung bình: " + diemTrungBinh1);
    }
    static void xuatThongTin2(){
        System.out.println("Họ và tên: " + hoTen2);
        System.out.println("Tuổi nhân viên: " + tuoi2);
        System.out.println("Giới tính: " + gioiTinh2);
        System.out.println("Mức lương: " + mucLuong2 );
        System.out.println("điểm trung bình: " + diemTrungBinh2);
    }
    static void xuatThongTin3(){
        System.out.println("Họ và tên: " + hoTen3);
        System.out.println("Tuổi nhân viên: " + tuoi3);
        System.out.println("Giới tính: " + gioiTinh3);
        System.out.println("Mức lương: " + mucLuong3 );
        System.out.println("điểm trung bình: " + diemTrungBinh3);
    }
    static void xuatThongTin4(){
        System.out.println("Họ và tên: " + hoTen4);
        System.out.println("Tuổi nhân viên: " + tuoi4);
        System.out.println("Giới tính: " + gioiTinh4);
        System.out.println("Mức lương: " + mucLuong4 );
        System.out.println("điểm trung bình: " + diemTrungBinh4);
    }
    static void xuatThongTin5(){
        System.out.println("Họ và tên: " + hoTen5);
        System.out.println("Tuổi nhân viên: " + tuoi5);
        System.out.println("Giới tính: " + gioiTinh5);
        System.out.println("Mức lương: " + mucLuong5 );
        System.out.println("điểm trung bình: " + diemTrungBinh5);
    }

}
