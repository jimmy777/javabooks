package study1;

public class S02 {
    public static void main(String[] args) {
        /*
        循环
        1、循环 = 循环操作、循环体 + 循环条件
        2、while （条件）{}             适合：先判断后执行
        3、多写几步，找出相同点作为循环体，最后找条件
        4、do 。。。 while（条件）      适合：先执行后判断
         */
        int i = 0;
        while (i < 100) {
            System.out.println(i+": hello world");
            i++;//注意修改变量
        }

        /*
        1、等价 while
        2、判断-》循环操作-》变量自增-》判断
        3、for                     适合：循环次数已知，首末已知
         */
        for (int j=0;j<100;j++) {
            System.out.println(j+": hello java");
        }
    }
}
