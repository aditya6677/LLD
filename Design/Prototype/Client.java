package Design.Prototype;

public class Client {
    public static void main(String[] args) {
        User user = new User(); //Object of student will be created in memory
        User newUser = user.copy();

        User newUser2 = new Student();
        newUser2.setName("Aditya");

        User newUser3 = newUser2.copy();

    }
}
