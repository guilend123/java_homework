package java_ss1.Homework6;

public class Number1 {
    public static void main(String[] args) {
        String input = "Hello world";
        //a
        // sử dụng stringbuffer
        StringBuffer stringBuffer = new StringBuffer(input);
        String result1 = stringBuffer.substring(6);// lấy phần tử của chuỗi từ vị trí số 6
        // sử dụng stringbuilder
        StringBuilder stringBuilder = new StringBuilder(input);
        String result2 = stringBuilder.substring(6);//lấy phần tử của chuỗi từ vị trí số 6
        System.out.println("Kết quả sử dụng Stringbuffer" + result1);
        System.out.println("Kết quả sử dụng Stringbuilder" + result2);
        //b
        // sử dụng stringbuffer

        stringBuffer.replace(4, 5, "f"); // thay thế kí tự ở vị trí 4 'o' thành 'f'
        // sử dụng stringbuilder

        stringBuilder.replace(4, 5, "f");// thay thế kí tự ở vị trí 4 'o' thành 'f'
        System.out.println("Kết quả sử dụng Stringbuffer" + stringBuffer);
        System.out.println("Kết quả sử dụng Stringbuilder" + stringBuilder);
        //c
        String str1 = "Hello";
        String str2 = "wolrd";
        String result = str1 + str2;
        StringBuffer stringBuffer1 = new StringBuffer(str1);
        stringBuffer1.append(str2);
        String resulta = stringBuffer1.toString();
        StringBuilder stringBuilder1 = new StringBuilder(str1);
        stringBuilder1.append(str2);
        String resultb = stringBuilder1.toString();
        System.out.println("kết quả sử dụng string: " + result);
        System.out.println("kết quả sử dụng stringbuffer: " + resulta);
        System.out.println("kết quả sử dụng stringbuilder: " + resultb);
        //d
        String a = "A";// tạo đối tượng a gán "A"
        String b = new String("A");// tạo đối tượng b gán "A" thông qua từ khóa new
        String c = "A";// tạo đối tượng c gán "A"
        b.concat("B");// tạo ra đối tượng mới nhưng không tham chiếu đến nó bị bỏ đi ngay sau dòng lệnh này
        String d = c.concat("C");// tạo đối tượng d = "AC" , concat để nối 2 chuỗi lại với nhau
        StringBuffer e = new StringBuffer("E");// đối tượng e gán biến "E" bằng câu lệnh stringbuffer
        e.append("F");// không tạo mới thêm F vào đối tượng e trên
        StringBuilder g = new StringBuilder("G");// đối tượng g gán biến "G" bằng câu lệnh stringbuffer
        g.append("H");// không tạo mới thêm H vào đối tượng g trên
        System.out.println(a + b + c + d + e + g);//"A"+ "A"+ "A" + "AC" + "EF" + "GH"
        //e so sánh method equals và toán tử == cho String
        String string1 = "Hello";
        String string2 = new String("Hello");
        String string3 = "Hello";

        System.out.println("So sánh kết quả của String");
        System.out.println("string1.equals(string2): "+ string1.equals(string2));//true
        System.out.println("string1 == string2 " + (string1 == string2));//false
        System.out.println("string1 == string3 " + (string1 == string3));//true

        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println("So sánh kết quả của StringBuffer");
        System.out.println("sb1.equals(sb2): "+ sb1.equals(sb2));//false vì stringbuffer không ghi đè kết quả của sting equals
        System.out.println("sb1 == sb2 " + (sb1 == sb2));//true
        StringBuilder sbuild1 = new StringBuilder("Hello");
        StringBuilder sbuild2 = new StringBuilder("Hello");
        System.out.println("So sánh kết quả của StringBuilder");
        System.out.println("sbuild1.equals(sbuild2): "+ sbuild1.equals(sbuild2));//false vì stringbuffer không ghi đè kết quả của sting equals
        System.out.println("sbuild1 == sbuild2 " + (sbuild1 == sbuild2));//true
    }
}
