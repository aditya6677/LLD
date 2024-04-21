package Design.Singleton;

public class Singleton {

    private int count = 0;

    private static Singleton instance = null;

    private Singleton(){}

    void hello(){
        System.out.println("Hello World");
    }

    synchronized public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
