package OOP.Inheritance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
//        B b = new B();
//        b.display();
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("D");
        list.add("D");

        Collections.reverse(list);
    }
}