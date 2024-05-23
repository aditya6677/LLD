package DesignPattern.Prototype;

public class Student extends User{
    private String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student(Student student){
        super(student);
        this.course = student.course;
    }

    public Student(){}

    public Student(String course){
        this.course = course;
    }

    public Student copy(){
        return new Student(this);
    }
}
