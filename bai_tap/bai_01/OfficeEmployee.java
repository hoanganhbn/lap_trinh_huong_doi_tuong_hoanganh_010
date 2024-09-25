package bai_tap.bai_01;

public class OfficeEmployee extends Employee {
    private int workDays;
    private static final double DAILY_WAGE = 100;

    public OfficeEmployee(String name, int age, int workDays) {
        super(name, age);
        this.workDays = workDays;
    }

    @Override
    public void calculateSalary() {
        this.salary = workDays * DAILY_WAGE;
    }

    // Getter và Setter cho workDays
    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }
}
