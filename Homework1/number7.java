package java_ss1.Homework1;

public class number7 {
    public static void main(String[] args) {
        // a
        int i = 1, j= 1;
        int a = i++ + j++;//i = 2 j = 2
        //1 + 1 = 2
        System.out.println("i= " +i);//2
        System.out.println("j= " +j);//2
        System.out.println("a= " +a);//2

        //b
        int i = 1, j= 1;
        int a = i++ + ++j;// i=2  j=2
        //1 + 2 = 4
        System.out.println("i= " +i);//2
        System.out.println("j= " +j);//2
        System.out.println("a= " +a);//3

        //c
        int i = 1, j= 1;
        int a = ++i + j++;// i=2  j=2
        // 2 + 1 =3
        System.out.println("i= " +i);//2
        System.out.println("j= " +j);//2
        System.out.println("a= " +a);//3

        //d
        int i = 1, j= 1;
        int a = ++i + ++j;// i=2  j=2
        //2 + 2 = 4
        System.out.println("i= " +i);//2
        System.out.println("j= " +j);//2
        System.out.println("a= " +a);//4

        //e
        int i = 1, j= 1;
        int a = i++ + j++ + i++ + j++;// i=3  j=3
            //  1   + 1   + 2 +   2 = 4
        System.out.println("i= " +i);//3
        System.out.println("j= " +j);//3
        System.out.println("a= " +a);//6
        //f
        int i = 1, j= 1;
        int a = ++i + ++j + i++ + j++;// i=3  j=3
            //  2   + 2   + 2   + 2 = 8
        System.out.println("i= " +i);//3
        System.out.println("j= " +j);//3
        System.out.println("a= " +a);//8
        //g
        int i = 1;
        int a = i++ + ++i - i-- - --i;// i=1
        //      1   + 3   - 2   -   1 = 0
        System.out.println("i= " +i);//1
        System.out.println("a= " +a);//0
        //h
        int a = 10;
        a += a++ + ++a;//a=12
        //10 + 10 + 12 =32
        System.out.println("a= " +a);//32
    }
}
