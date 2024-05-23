package DesignPattern.Prototype;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        User student = new Student("Java");

        Registry registry = new Registry();
        registry.registerUser("K1", user);
        registry.registerUser("K2", student);

        User javaStudent = registry.getUser("K2").copy();
        javaStudent.setName("Aditya");
        System.out.println(javaStudent);
    }
}