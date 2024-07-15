package java_ss1.Homework5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Number2 {
    public static void main(String[] args) {
        // chuyển đổi string thành int trong java

        String aStr = "100000";
        int a = Integer.parseInt(aStr);
        // chuyển đổi int thành string trong java
        String bStr = String.valueOf(a);

        // chuyển string thành long trong java
        String cStr = "23154647892145";
        long c = Long.parseLong(cStr);
        // chuyển đổi long thành Srting trong java
        String dStr = String.valueOf(c);
        // chuyển đổi String thành float trong java
        String eStr = "12.2";
        float e = Float.parseFloat(eStr);
        // chuyển đổi float thành string trong java
        String fStr = String.valueOf(e);
        // chuyển đổi string thành double trong java
        String gStr = "10.1";
        Double g = Double.parseDouble(gStr);
        // chuyển đổi double thành string trong java
        String hStr = String.valueOf(g);
        // chuyển đổi string thành short trong java
        String iStr = "100";
        Short i = Short.parseShort(eStr);
        // chuyển đổi từ shot thành string trong java
        String k = String.valueOf(i);
    }

}
