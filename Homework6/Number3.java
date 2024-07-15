package java_ss1.Homework6;
// ép kiểu
public class Number3 {
    public static void main(String[] args) {
        // câu a
        byte byValue  = 100;
        short shortValue = byValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;
        // câu b
        double doubleValueb = 100;
        float floatValueb = (float) doubleValueb;
        long longValueb = (long) floatValueb;
        short shortValueb = (short) longValueb;
        byte byteValueb = (byte) shortValueb;
        //câu c
        double doubleValuec = 10010211101512.5;
        float floatValuec = (float) doubleValuec;
        long longValuec = (long) floatValuec;
        short shortValuec = (short) longValuec;
        byte byteValuec = (byte) shortValuec;
    }
}
