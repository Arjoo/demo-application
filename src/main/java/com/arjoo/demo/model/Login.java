package com.arjoo.demo.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

@Document
@Data
@Builder
public class Login {
    private String userName;
    private String password;
}
