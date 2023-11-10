package classwork.chapter8.persondynamic;

public class DynamicDispatchTest {
    public static void main(String[] args) {

        Employee employee = new Employee();
        sendEmail(employee);
        Student student = new Student();
        sendEmail(student);

    }

    public static void sendEmail(Person person) {
        person.prinHello();
    }
}
