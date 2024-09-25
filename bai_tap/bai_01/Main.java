package bai_tap.bai_01;

public class Main {
    public static void main(String[] args) {
        OfficeEmployee officeEmployee = new OfficeEmployee("Nguyen Van A", 30, 22);
        TechnicalEmployee technicalEmployee = new TechnicalEmployee("Tran Thi B", 28, 160, 20);

        officeEmployee.calculateSalary();
        technicalEmployee.calculateSalary();

        System.out.println("Tên: " + officeEmployee.getName() + ", Lương: " + officeEmployee.getSalary());
        System.out.println("Tên: " + technicalEmployee.getName() + ", Lương: " + technicalEmployee.getSalary());
    }
}
