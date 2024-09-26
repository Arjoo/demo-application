package com.arjoo.demo.repository;

import com.arjoo.demo.model.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoginRepository extends MongoRepository<UserProfile, String> {
}
