public class bai1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Vui long nhap width và height.");
            return;
        }

        try {
            int width = Integer.parseInt(args[0]);
            int height = Integer.parseInt(args[1]);

            if (width <= 0 || height <= 0) {
                System.out.println("Chieu rong va chieu cao phai la so nguyen duong");
                return;
            }

            int perimeter = 2 * (width + height);
            int area = width * height;

            System.out.println("Chu vi hinh chu nhat la: " + perimeter);
            System.out.println("Dien tich hinh chu nhat la: " + area);

        } catch (NumberFormatException e) {
            System.out.println("Vui long nhap so nguyen hop le");
        }
    }
}
