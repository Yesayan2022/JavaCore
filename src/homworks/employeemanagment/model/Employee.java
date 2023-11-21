package homworks.employeemanagment.model;

public class Employee {
    private String id;
    private String name;
    private String surname;
    private String phone;
    private double salary;
    private String position;
    private Company company;

    public Employee(String id, String name, String surname, String phone, double salary, String position, Company company) {

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.salary = salary;
        this.position = position;
        this.company = company;
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public Company getCompany() {
        return company;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", company=" + company +
                '}';
    }
}
