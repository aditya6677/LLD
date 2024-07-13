package OOP.Inheritance;

public class B extends A{
    String course;
    String batch;

    public B(){}

    @Override
    public void display(){
        System.out.println("Runtime Exception");
        throw new RuntimeException();
    }
}