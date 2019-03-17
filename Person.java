package zhu;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private void sayHi() {
        System.out.println("姓名是:" + name);
        System.out.println("年龄为:" + age);
        System.out.println("地址是:" + address);

    }

    public Person() {
        this("wang", 20 ,"street 1");
    }

    public static void main(String[] args) {
        Person person1 = new Person("gao", 29, "street b");
        person1.sayHi();
    }
}
