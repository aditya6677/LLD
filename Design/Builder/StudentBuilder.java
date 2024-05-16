//package Design.Builder;
//
//public class StudentBuilder {
//
//    private String name;
//    private int age;
//    private String gender;
//    private int psp;
//
//    public static StudentBuilder getBuilder(){
//        return new StudentBuilder();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public StudentBuilder setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public StudentBuilder setAge(int age) {
//        this.age = age;
//        return this;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public StudentBuilder setGender(String gender) {
//        this.gender = gender;
//        return this;
//    }
//
//    public int getPsp() {
//        return psp;
//    }
//
//    public StudentBuilder setPsp(int psp) {
//        this.psp = psp;
//        return this;
//    }
//
//    public boolean validate(){
//        return age >= 18;
//    }
//
//    public Student build() throws Exception {
//        if(!validate()){
//            throw new Exception("Input not valid");
//        }
//        return new Student(this);
//    }
//
//}
