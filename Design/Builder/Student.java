package Design.Builder;

public class Student {
    private String name;
    private int age;
    private String gender;
    private int psp;

    public Student(Builder builder){
        this.name = builder.getName();
        this.age = builder.getAge();
        this.gender = builder.getGender();
        this.psp = builder.getPsp();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getPsp() {
        return psp;
    }
}
