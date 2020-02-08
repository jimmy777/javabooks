package z03;

public class Gess {
    public static void main(String[] args) {
        /*
        char 字符型
        1、占16位 = 2个字节内存空间
        2、使用单引号，双引号是字符串
        3、字符可以作为整数，二者可以转换操作
        4、unicode为0~65536个字符（0x0000~0xffff）
         */
        char word = 'd', word2 = '@';
        int p=23045, p2=45213;
        System.out.println("d在unicode表中的顺序位置是：" + (int)word);
        System.out.println("@在unicode表中的顺序位置是：" + (int)word2);
        System.out.println("unicode表中的第23045位是：" + (char)p);
        System.out.println("unicode表中的第45213位是："+ (char)p2);
    }
}
