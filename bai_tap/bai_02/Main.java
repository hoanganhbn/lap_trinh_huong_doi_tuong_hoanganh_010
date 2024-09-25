package bai_tap.bai_02;

// Chương trình chính
public class Main {
    public static void main(String[] args) {
        OfficeEmployee officeEmployee = new OfficeEmployee("Nguyễn Văn A");
        officeEmployee.sendEmail("khachhang@example.com", "Chào bạn, đây là thông điệp của chúng tôi.");

        TechnicalEmployee technicalEmployee = new TechnicalEmployee("Trần Văn B");
        technicalEmployee.writeCode("public static void main(String[] args) { }");

        SalesEmployee salesEmployee = new SalesEmployee("Lê Thị C");
        salesEmployee.sell("Sản phẩm XYZ");
    }
}
