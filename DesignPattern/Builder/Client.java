package DesignPattern.Builder;

public class Client {
    public static void main(String[] args) throws Exception {
        Student student = Student.getBuilder()
                                .setName("Aditya")
                                .setAge(25)
                                .setGender("Male")
                                .setPsp(99)
                                .build();

        System.out.println(student.getName());

        Student student1 = Student.getBuilder()
                                .setName("Sandy")
                                .setAge(25)
                                .setGender("Male")
                                .setPsp(99)
                                .build();

        System.out.println(student1.getName());

    }
}
