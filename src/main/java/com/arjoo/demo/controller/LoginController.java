package com.arjoo.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private static final Logger logger = LogManager.getLogger(LoginController.class);

    @RequestMapping("/")
    public String login() {
        logger.info("Login controller");
        return "Hey user, You logged in Successfully";
    }
}
