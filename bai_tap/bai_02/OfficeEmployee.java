package bai_tap.bai_02;

// Lớp nhân viên văn phòng
public class OfficeEmployee implements EmailSender {
    private String name;

    public OfficeEmployee(String name) {
        this.name = name;
    }

    @Override
    public void sendEmail(String recipient, String message) {
        System.out.println("Nhân viên văn phòng " + name + " gửi email đến " + recipient + ": " + message);
    }
}
