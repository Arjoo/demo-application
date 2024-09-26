package com.arjoo.demo.model;

import com.arjoo.demo.dto.AddressDTO;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
public class UserProfile {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Address addressDTO;
    private String password;
}
