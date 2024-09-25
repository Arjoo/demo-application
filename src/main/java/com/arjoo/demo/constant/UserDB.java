package com.arjoo.demo.constant;

import com.arjoo.demo.model.User;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

public class UserDB {
    public static List<User> generateUsers() {
        return Arrays.asList(
                new User("1", "Arjoo"),
                new User("2", "Ramesh"),
                new User("3", "Alex"),
                new User("4", "Martin"),
                new User("5", "Jazz"),
                new User("6", "Albert"),
                new User("7", "Jack"),
                new User("8", "Sindrella"),
                new User("9", "Mathew")
        );

    }
}
