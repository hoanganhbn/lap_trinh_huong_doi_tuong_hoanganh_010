package bai_05;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(5.0, 3.0));
        shapes.add(new Circle(4.0));
        shapes.add(new Rectangle(2.0, 6.0));
        shapes.add(new Circle(7.0));

        double totalArea = 0;
        double totalPerimeter = 0;

        for (Shape shape : shapes) {
            totalArea += shape.getArea();
            totalPerimeter += shape.getPerimeter();
        }

        System.out.println("Tổng diện tích của tất cả các hình: " + totalArea);
        System.out.println("Tổng chu vi của tất cả các hình: " + totalPerimeter);
    }
}
