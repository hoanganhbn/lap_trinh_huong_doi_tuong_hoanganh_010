package bai_03;

public class bai3 {
    private double radius;
    private double width;
    private double height;

    public bai3(double radius) {
        setRadius(radius);
    }

    public bai3(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (Common.isPositiveNumber(radius)) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Bán kính phải là số dương.");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (Common.isPositiveNumber(width)) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Chiều rộng phải là số dương.");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (Common.isPositiveNumber(height)) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Chiều cao phải là số dương.");
        }
    }

    public double getCirclePerimeter() {
        if (radius <= 0) throw new IllegalStateException("Bán kính chưa được thiết lập.");
        return 2 * Math.PI * radius;
    }

    public double getCircleArea() {
        if (radius <= 0) throw new IllegalStateException("Bán kính chưa được thiết lập.");
        return Math.PI * radius * radius;
    }

    public double getRectanglePerimeter() {
        if (width <= 0 || height <= 0) throw new IllegalStateException("Chiều rộng hoặc chiều cao chưa được thiết lập.");
        return 2 * (width + height);
    }

    public double getRectangleArea() {
        if (width <= 0 || height <= 0) throw new IllegalStateException("Chiều rộng hoặc chiều cao chưa được thiết lập.");
        return width * height;
    }

    private static class Common {
        public static boolean isPositiveNumber(double number) {
            return number > 0;
        }
    }

    public static void main(String[] args) {
        bai3 circle = new bai3(5.0);
        System.out.println("Chu vi hình tròn: " + circle.getCirclePerimeter());
        System.out.println("Diện tích hình tròn: " + circle.getCircleArea());

        bai3 rect = new bai3(5.0, 3.0);
        System.out.println("Chu vi hình chữ nhật: " + rect.getRectanglePerimeter());
        System.out.println("Diện tích hình chữ nhật: " + rect.getRectangleArea());
    }
}
