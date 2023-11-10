package classwork.chapter8.persondynamic;

public class Student extends Person {
    private String studentId;
    private double score;

    public Student(String name, String surname, String email, double phone, String studentId, double score) {
        super(name, surname, email, phone);
        this.studentId = studentId;
        this.score = score;
    }

    public Student() {
    }

    @Override
    public void prinHello() {
        System.out.println("Voxjuyn ussanoxic");
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


}
