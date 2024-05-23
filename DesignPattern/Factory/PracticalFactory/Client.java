package DesignPattern.Factory.PracticalFactory;

public class Client {

    public static void main(String[] args) {
        User user = UserFactory.getUser("TA");
        user.setName("Sandeep");
        user.setAge(22);
        System.out.println(user instanceof TA);
    }
}
