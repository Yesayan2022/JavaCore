package classwork.chapter8.persondynamic;

public abstract class Person {
    private String name;
    private String surname;
    private String email;
    private String phone;

    public Person(String name, String surname, String email, double phone) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = String.valueOf(phone);
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = String.valueOf(phone);
    }

    public void prinHello(){
        System.out.println("Hello");
    }
}
