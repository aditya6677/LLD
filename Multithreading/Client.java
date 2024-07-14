package Multithreading;

import java.nio.file.FileAlreadyExistsException;

public class Client {
    public static void main(String[] args) {
        T1 t1 = new T1();
        t1.start();

        try{
            T2 t2 = new T2();
            Thread t3 = new Thread(t2);
            t3.start();
        }
        catch (NullPointerException nullPointerException){
            System.out.println(nullPointerException.getMessage());
        }


        Runnable runnable = () -> System.out.println("Hey Runnable");

        Thread t4 = new Thread(() -> {
            System.out.println("Hello World");
        });
        t4.start();

        new Thread(runnable).start();
    }
}
