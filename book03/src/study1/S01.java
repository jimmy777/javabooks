package study1;

import Account.Account;
import Die.Die;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class S01 {
    enum Flavor { A, B, C};

    public static void main(String[] args) {
        /*
        如果是连续区间建议if支持整数或枚举，如果是离散的单点值建议switch不支持小数
         */

//        System.out.println("第一行");
//        System.out.println();
//        System.out.println("word1"+","+"word2");
//        System.out.println("转义：\t结束。");

//        int total;
//        int num1, num2=2,num3;
//        final int MAX=45;

//        System.out.println("第一行：" + total);
//        System.out.println("第二行：" + num2);
//        System.out.println("第三行：" + MAX);

        // 变量与赋值
        /*
        int sides = 7;
        System.out.println("第一个值：" + sides);

        sides = 10;
        System.out.println("第二个值：" + sides);

        sides = 12;
        System.out.println("第二个值：" + sides);
         */

        // 整数和浮点型
        /*
        int answer = 12;
        byte smallNumber, smallNumber2;
        long countStars = 868L;
        float ratio = 0.21F;
        double delta = 0.12;

        System.out.println("整数为：" + answer);
        System.out.println("长整数为：" + countStars);
        System.out.println("浮点数为：" + ratio);
        System.out.println("双浮点：" + delta);
         */

        // 字符型
        /*
        char topGrade = 'A';
        char symball;
        char terminator=';', separator=' ';

        System.out.println("字符串" + topGrade);
        System.out.println("特殊字符" + terminator);
        System.out.println("特殊字符" + separator + "结束");
         */

        // 布尔值
        /*
        boolean flag = true;
        boolean tooHigh;
        boolean done = false;

        System.out.println("开" + flag);
        System.out.println("关" + done);
         */

        // 运算符
        /*
        final int BASE = 32;
        final double CONVERSION_FACTOR = 9.0 / 5.0;

        double fahrenheitTemp;
        int celsiusTemp = 24;

        fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;

        System.out.println("摄氏度：" + celsiusTemp);
        System.out.println("华氏度：" + fahrenheitTemp);
         */

        // 自增和自减运算符
        /*
        int i = 1, total;

        total = i++;
        System.out.println("i = "+i);
        System.out.println("total = "+total);

        System.out.println("-----------------");

        total = ++i;
        System.out.println("i = "+i);
        System.out.println("total = "+total);
         */

        // Scanner类
        /*
        String message;
        Scanner scan = new Scanner(System.in);

        System.out.println("输入一行文字：");
        message = scan.nextLine();
        System.out.println("你输入的文字是：\"" + message + "\"");

         */

        // String类
        /*
        String phrase = "Change is inevitable";
        String mutation1, mutation2,mutation3,mutation4;

        System.out.println("原字符串是" + phrase);
        System.out.println("原字符串长" + phrase.length());

        mutation1 = phrase.concat(", except from vending machines.");
        mutation2 = mutation1.toUpperCase();
        mutation3 = mutation2.replace('E', 'X');
        mutation4 = mutation3.substring(3, 30);

        System.out.println("字符串拼接" + mutation1);
        System.out.println("转换为大写" + mutation2);
        System.out.println("字母来替换" + mutation3);
        System.out.println("提取子串是" + mutation4);

         */

        // Random类
        /*
        Random generator = new Random();
        int num1;
        float num2;

        num1 = generator.nextInt();
        System.out.println("一个随机整数 " + num1);

        num1 = generator.nextInt(10);
        System.out.println("零到九的整数 " + num1);

        num1 = generator.nextInt(10) + 1;
        System.out.println("壹到拾的整数 " + num1);

        num2 = generator.nextFloat();
        System.out.println("零到壹的小数 " + num2);

        num2 = generator.nextFloat() * 6;
        System.out.println("零到六间小数 " + num2);
        num1 = (int)num2 + 1;
        System.out.println("壹到六的整数 " + num1);

         */

        // ax^2 + bx + c
        // 问题：联华超市将进货单价为40元的商品如果按50元销售，就能卖出500个，但如果这种商品每个涨价1元，其销售量就减少10个，如果你是超市的经理的话，为了赚得8000元的利润，你觉得售价应定为多少？这时应进货多少个？
        // 分析：题中如果销售价按照单价50元的话，每个利润是10元，可以卖出500个，共可获利5000元，无法完成利润8000元的目标，所以只有提高单价并控制适当的单价，才可以完成获得利润5000元任务。
        // 解题：x^2 -40x + 300 = 0
        // 计算 x1 和 x2
        /*
        int a,b,c;
        double disciminant, x1, x2;

        Scanner scanner = new Scanner(System.in);

        // a=1
        System.out.println("输入a ");
        a = scanner.nextInt();

        // b=-40
        System.out.println("输入b ");
        b = scanner.nextInt();

        // c=300
        System.out.println("输入c ");
        c = scanner.nextInt();

        // b^2-4ac
        // (-40)^2-4*1*300=400
        disciminant = Math.pow(b, 2) - (4*a*c);
        System.out.println("因子1：" + disciminant);

        // Math类的开根号，得到第一个值x1。
        x1 = ((-1*b) + Math.sqrt(disciminant)) / (2*a);
        System.out.println("定价因子1：" + x1 + "，定价为：" + (50+x1) + "，进货量为：" + (int)(500-(10*x1)));

        // Math类的开根号，得到第二个值x2。
        x2 = ((-1*b) - Math.sqrt(disciminant)) / (2*a);
        System.out.println("定价因子2：" + x2 + "，定价为：" + (50+x2) + "，进货量为：" + (int)(500-(10*x2)));

         */

        // NumberFormat格式化
        /*
        final double TAX_RATE = 0.06; // 6%的税

        int quantity; // 销售数量
        double subtotal, tax, totalCost, unitPrice;

        Scanner scanner = new Scanner(System.in);

        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        NumberFormat fmt2 = NumberFormat.getPercentInstance();

        System.out.println("输入销售的数量：");
        quantity = scanner.nextInt();

        System.out.println("输入商品单价：");
        unitPrice = scanner.nextDouble();

        subtotal = quantity * unitPrice; // 销售额
        tax = subtotal * TAX_RATE; // 税
        totalCost = subtotal + tax; // 成本

        System.out.println("销售额为：" + fmt1.format(subtotal));
        System.out.println("交税额为：" + fmt1.format(tax) + "，按 " + fmt2.format(TAX_RATE) + " 税率来计算");
        System.out.println("总成本为：" + fmt1.format(totalCost));

         */

        // DecimalFormat类
        /*
        int radius;
        double area, circumference;

        Scanner scan = new Scanner(System.in);

        System.out.println("输入半径:");
        radius = scan.nextInt();

        area = Math.PI * Math.pow(radius, 2);
        circumference = 2 * Math.PI * radius;

        DecimalFormat fmt = new DecimalFormat("0.###");


        System.out.println("它面积为：" + fmt.format(area));
        System.out.println("它周长为：" + fmt.format(circumference));

         */

        // 枚举类型
        /*
        Flavor cone1, cone2, cone3;

        cone1 = Flavor.B;

        System.out.println("cone1 值：" + cone1);
        System.out.println("cone1 序：" + cone1.ordinal());
        System.out.println("cone1 名：" + cone1.name());

         */

        // switch运算符
        /*
        int rank = 20;
        switch (rank){ //遇到break或最后}跳出结束
            case 10: //不能重复
                System.out.println("正数奖励笔记本");
                break;
            case 20:
                System.out.println("奖励U盘");
                break;//一般建议不省略
            case 30:
                System.out.println("不奖励");
        }

         */

        // 两个骰子例子
        /*
        Die die1, die2;
        int sum;

        die1 = new Die();
        die2 = new Die();

        die1.roll();
        die2.roll();

        System.out.println("骰子1：" + die1 + ", 骰子2：" + die2) ;

        die1.roll();
        die2.setFaceValue(4);

        System.out.println("骰子1：" + die1 + ", 骰子2：" + die2) ;

        sum = die1.getFaceValue() + die2.getFaceValue();
        System.out.println("结果是：" + sum);

         */

        // 4.4.4 银行账户示例
//        1. 账户实例包括：客户、账户号、当前余额。
//        2. deposit和withdraw 两个方法执行账户的交易，并调整余额。
//        3. addInterest计算利息，加入余额。
//        打印三个账户信息
        Account acct1 = new Account("Ted Murphy", 72354, 102.56);
        Account acct2 = new Account("Jane Smith", 69713, 40.00);
        Account acct3 = new Account("Edward Demsey", 93757, 759.32);

        acct1.deposit(25.85);

        double smithBalance = acct2.deposit(500.00);
        System.out.println("Smith balance after deposit: " + smithBalance);
        System.out.println("Smith balance after withdrawal: " + acct2.withdraw(430.75, 1.50));

        acct1.addInterest();
        acct2.addInterest();
        acct3.addInterest();

        System.out.println();
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);

    }
}
