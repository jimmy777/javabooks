package study4;

/**
 * Created by yuanziyang on 2018/1/22.
 */

class Person {
    String name;
    int age;

    public void tell() {
        System.out.println("my name is: "+ name + ", my age is: " + age);
    }
}

public class TestDemo {
    public static void main(String[] args) {
//        Person per = new Person();
        Person per;
        per = new Person();

        Person per2 = per;

        per.name = "yuanziyang";
        per.age = 40;

        per2.tell();

        per2.name = "wangying";

        per.tell();
        per2.tell();

        Person per3 = new Person();
        Person per4 = new Person();

        per3.name = "name33";
        per3.age = 33;

        per4.name = "name44";
        per4.age = 44;

        per4 = per3;

        per4.tell();
        per4.age = 444;
        per4.tell();
        per3.tell();
    }
}
