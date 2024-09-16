package bai_04;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng hình chữ nhật
        Shape rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Hình chữ nhật:");
        System.out.println("Chu vi: " + rectangle.getPerimeter());
        System.out.println("Diện tích: " + rectangle.getArea());

        // Tạo đối tượng hình tròn
        Shape circle = new Circle(4.0);
        System.out.println("Hình tròn:");
        System.out.println("Chu vi: " + circle.getPerimeter());
        System.out.println("Diện tích: " + circle.getArea());
    }
}
