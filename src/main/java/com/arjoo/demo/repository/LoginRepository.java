package com.arjoo.demo.repository;

import com.arjoo.demo.model.Login;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoginRepository extends MongoRepository<Login, String> {
}
