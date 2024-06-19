package DesignPattern.Singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

    private final String name;

    private static volatile Singleton instance = null;

    private Singleton(String name){
        this.name = name;
    }

    void hello(){
        System.out.println(name);
    }

    public static Singleton getInstance(String name){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton(name);
                }
            }
        }
        return instance;
    }
}
