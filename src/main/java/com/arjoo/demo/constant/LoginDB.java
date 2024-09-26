package com.arjoo.demo.constant;

import com.arjoo.demo.model.Login;

import java.util.Arrays;
import java.util.List;

public class LoginDB {
    public static List<Login> generateUser() {
        return Arrays.asList(
                Login.builder().userName("Arjoo").password("11").build(),
                Login.builder().userName("Michel").password("11").build()
        );
    }
}
