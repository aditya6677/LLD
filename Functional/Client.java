package Functional;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int sum = list.stream().filter(x -> x % 2 == 0).reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
