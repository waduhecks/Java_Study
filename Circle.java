package zhu;

import java.util.Scanner;

public class Circle extends Shape {
    private int radius;

    //构造方法
    public Circle(String color, int area) {
        super(color, area);
    }

    void showInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("please input" + this.getClass().getSimpleName() + "'s radius:");
        radius = sc.nextInt();

        System.out.println(this.getClass().getSimpleName() + "'s radius is " + radius);
    }

}
