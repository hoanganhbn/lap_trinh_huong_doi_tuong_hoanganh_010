package bai_tap.bai_02;

// Lớp nhân viên kỹ thuật
public class TechnicalEmployee implements Programmer {
    private String name;

    public TechnicalEmployee(String name) {
        this.name = name;
    }

    @Override
    public void writeCode(String code) {
        System.out.println("Nhân viên kỹ thuật " + name + " đang viết mã: " + code);
    }
}
