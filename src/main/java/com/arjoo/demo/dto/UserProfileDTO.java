package com.arjoo.demo.dto;

import lombok.Data;

@Data
public class UserProfileDTO {
    private String firstName;
    private String lastName;
    private String email;
    private AddressDTO addressDTO;
    private String password;
}
