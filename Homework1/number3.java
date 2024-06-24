package java_ss1.Homework1;

import java.util.Scanner;

public class number3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên sản phẩm ");
        String tenSanPham = scanner.nextLine();

        System.out.println("Nhập số luợng sản phẩm ");
        int soLuong = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập đơn giá của sản phẩm ");
        double donGia = Double.parseDouble(scanner.nextLine());

        double tien = soLuong * donGia;
        double vat = 0.1 * tien;

        System.out.println("Tên sản phẩm: " + tenSanPham);
        System.out.println("Tiền: "+ tien);
        System.out.println("Thuế GTGT: " +vat);
    }
}
