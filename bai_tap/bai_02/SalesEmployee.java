package bai_tap.bai_02;

// Lớp nhân viên bán hàng
public class SalesEmployee implements Salesperson {
    private String name;

    public SalesEmployee(String name) {
        this.name = name;
    }

    @Override
    public void sell(String product) {
        System.out.println("Nhân viên bán hàng " + name + " đang bán sản phẩm: " + product);
    }
}
