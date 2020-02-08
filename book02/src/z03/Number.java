package z03;

public class Number {
    public static void main(String[] args) {
        /*
        整数类型：
        ------  -------
        byte    8位
        short   16位
        int     32位
        long    64位
         */
        byte mybyte = 124;
        short myshort = 32564;
        int myint = 45784612;
        long mylong = 46789451;
        long result = mybyte + myshort + myint + mylong;
        System.out.println("结果为：" + result);

        /*
        浮点类型
        ---------  -------
        float       32位
        double      64位
         */
        float f1 = 13.23f;
        double d1 = 4654.12d;
        double result2 = f1 + d1;
        System.out.println("浮点计算结果为：" + result2);
    }
}
