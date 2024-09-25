package com.arjoo.demo.repository;

import com.arjoo.demo.model.User;

import java.util.Map;

public interface UserRepository {
    void save(User user);
    Map<Object, Object> findAll();
    Object findById(String id);
    void update(User user);
    void delete(String id);
}