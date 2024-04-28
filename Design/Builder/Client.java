package Design.Builder;

public class Client {
    public static void main(String[] args) throws Exception {
        Student student = Builder.getBuilder()
                                .setName("Aditya")
                                .setAge(25)
                                .setGender("Male")
                                .setPsp(99)
                                .build();

        System.out.println(student.getName());

    }
}
