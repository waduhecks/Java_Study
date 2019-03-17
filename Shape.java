package zhu;

public class Shape {
    private String color;
    private int area;

    public Shape(String color, int area) {
        this.color = color;
        this.area = area;
    }

    //show 颜色
    void showColor() {

        System.out.println(this.getClass().getSimpleName() + "'s color is " + color);
    }

    //show 面积
    void showArea() {

        System.out.println(this.getClass().getSimpleName() + "'s area is " + area);
    }
}
