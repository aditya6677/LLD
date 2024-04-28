package Design.Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Singleton singleton = Singleton.getInstance(scanner.next());
        singleton.hello();

    }
}
