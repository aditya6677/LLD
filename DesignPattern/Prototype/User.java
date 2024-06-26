package DesignPattern.Prototype;

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(User user){
        this.name = user.name;
        this.age = user.age;
    }

    public User(){}

    public User copy(){
        return new User(this);
    }

}
