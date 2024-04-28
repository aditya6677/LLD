package Design.Builder;

public class Builder {

    private String name;
    private int age;
    private String gender;
    private int psp;

    public static Builder getBuilder(){
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Builder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public int getPsp() {
        return psp;
    }

    public Builder setPsp(int psp) {
        this.psp = psp;
        return this;
    }

    public boolean validate(){
        return age >= 18;
    }

    public Student build() throws Exception {
        if(!validate()){
            throw new Exception("Input not valid");
        }
        return new Student(this);
    }


}
