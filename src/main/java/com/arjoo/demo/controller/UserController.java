package com.arjoo.demo.controller;

import com.arjoo.demo.constant.UserDB;
import com.arjoo.demo.model.User;
import com.arjoo.demo.repository.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController(value = "/users")
public class UserController {

    private static final Logger logger = LogManager.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User users(@PathVariable("id") String id) {
        return (User)userRepository.findById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Map<Object, Object> all() {
        return userRepository.findAll();
    }

    @RequestMapping(value = "/names", method = RequestMethod.GET)
    public List<Object> names() {
        return userRepository.findAll().entrySet().stream()
                .map(e -> ((User)e.getValue()).getName()).collect(Collectors.toList());
    }
}
