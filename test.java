package zhu;

public class test {
    public static void main(String[] args) {
        Circle circle = new Circle("黑色",10);
        circle.showColor();
        circle.showInfo();
        circle.showArea();
        System.out.println(circle instanceof Circle);
        System.out.println(circle instanceof Shape);

        System.out.println("\n");

        Rectangle rectangle = new Rectangle("红色",20);
        rectangle.showColor();
        rectangle.showInfo();
        rectangle.showArea();
        System.out.println(rectangle instanceof Rectangle);
        System.out.println(rectangle instanceof Shape);
    }
}
