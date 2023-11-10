package classwork.chapter8.persondynamic;

public class Employee extends Person {

    private String employeId;
    private double salary;
    private String position;

    public Employee() {
    }

    public Employee(String name, String surname, String email, double phone, String employeId, double salary, String position) {
        super(name, surname, email, phone);
        this.employeId = employeId;
        this.salary = salary;
        this.position = position;

    }

    public String getEmployeId() {
        return employeId;
    }

    public void setEmployeId(String employeId) {
        this.employeId = employeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void prinHello() {
        System.out.println("Barev");
    }
}
