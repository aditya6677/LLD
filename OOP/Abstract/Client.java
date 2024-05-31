package OOP.Abstract;

public class Client {
    public static void main(String[] args) {
        try{
            throw new RuntimeException("newnew");
        }
        finally {
            System.out.println("Finally");
        }
    }
}