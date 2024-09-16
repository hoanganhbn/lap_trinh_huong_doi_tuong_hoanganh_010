public class bai2 {
    private double width;
    private double height;

    public bai2(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        bai2 rect = new bai2(5.0, 3.0);

        System.out.println("Chu vi hinh chu nhat: " + rect.getPerimeter());
        System.out.println("Diện tich hinh chu nhat: " + rect.getArea());
    }
}