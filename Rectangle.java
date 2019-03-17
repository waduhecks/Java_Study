package zhu;

import java.util.Scanner;

public class Rectangle extends Shape{
    private int  length;
    private int width;

    //构造方法
    public Rectangle(String color, int area) {
        super(color, area);
    }


    void showInfo() {        
        Scanner sc = new Scanner(System.in);

        System.out.println("please input" + this.getClass().getSimpleName() + "'s length:");
        length = sc.nextInt();
        System.out.println(this.getClass().getSimpleName() + "'s length is " + length);

        System.out.println("please input" + this.getClass().getSimpleName() + "'s width:");
        width = sc.nextInt();
        System.out.println(this.getClass().getSimpleName() + "'s width is " + width);

    }
}
