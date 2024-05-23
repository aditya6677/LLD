package DesignPattern.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    Map<String, User> users = new HashMap<>();

    public void registerUser(String name, User user) {
        users.put(name, user);
    }

    public User getUser(String name) {
        return users.get(name);
    }
}
