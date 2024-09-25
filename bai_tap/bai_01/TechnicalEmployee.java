package bai_tap.bai_01;

public class TechnicalEmployee extends Employee {
    private int workHours;
    private double hourlyRate;

    public TechnicalEmployee(String name, int age, int workHours, double hourlyRate) {
        super(name, age);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void calculateSalary() {
        this.salary = workHours * hourlyRate;
    }

    // Getter và Setter cho workHours và hourlyRate
    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
