package com.arjoo.demo.repository;

import com.arjoo.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private RedisTemplate redisTemplate;



    @Override
    public void save(User user) {
        redisTemplate.opsForHash().put("USER", user.getId(), user);
    }

    @Override
    public Map<Object, Object> findAll() {
        return redisTemplate.opsForHash().entries("USER");
    }

    @Override
    public Object findById(String id) {
        return (User) redisTemplate.opsForHash().get("USER", id);
    }

    @Override
    public void update(User user) {
        save(user);
    }

    @Override
    public void delete(String id) {
        redisTemplate.opsForHash().delete("USER", id);
    }
}