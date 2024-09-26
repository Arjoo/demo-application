package com.arjoo.demo.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
public class Address {
    private String address;
    /*private String city;
    private String state;
    private Integer zipCode;*/
}