package java_ss1.Homework5;

import java.util.Locale;
import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "hello world";
        //a Lấy ra chữ world
        System.out.println("Lấy ra chữ world " + str.substring(6));
        // thay o thành f
        System.out.println("Thay o thành f " + str.replace('o','f'));
        //đếm xem bao nhiêu chữ l
        int count = 0;
        for (int i = 0; i <= str.length() - 1;i++){
            if(str.charAt(i) == 'l'){
                count++;
            }
        }
        System.out.println("có " +count+" chữ L ");
        //tìm vị trí đầu tiên của chữ l và vị trí cuối cùng chữ l xuất hiện
        System.out.println("Vị trí đầu tiên chữ l " +str.indexOf('l'));
        System.out.println("Vị trí cuối cùng chữ l xuất hiện" + str.lastIndexOf('l'));
        // xóa hết space đầu tiên , giữa và cuối cùng
        System.out.println("Xóa hết space " +str.trim());
        // đảo chuỗi
        String daoChuoi = "";
        for (int i = str.length()-1; i >= 0; i--){
            daoChuoi += str.charAt(i);
        }
        System.out.println("chuỗi sau khi đảo là: " + daoChuoi);
        // thêm kí tự " SQC "vào chuỗi
        System.out.println("SQC" + str);
        // Đổi toàn bộ kí tự sang in hoa
        System.out.println("chuỗi kí tự sau khi in hoa là: " + str.toUpperCase());
        // đổi toàn bộ kí tự sang in thường
        System.out.println("chuỗi kí tự sau khi chuyển sang in thường là: " + str.toLowerCase());
        // trích ra kí tự từ n đếm m trong chuỗi kí tự là
        System.out.println("Nhập n");
        int n = scanner.nextInt();
        System.out.println("Nhập m");
        int m = scanner.nextInt();
        System.out.printf(" chuỗi kí tự còn từ %d đến %d là : %s ", n, m, str.substring(n,m));
    }
}
