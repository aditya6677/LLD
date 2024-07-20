package DesignPattern.Singleton;

import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Singleton singleton = Singleton.getInstance(scanner.next());
        singleton.hello();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("single.ser"));
        objectOutputStream.writeObject(singleton);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("single.ser"));
        Singleton singleton1 = (Singleton) objectInputStream.readObject();

        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.doSomething();

    }
}
