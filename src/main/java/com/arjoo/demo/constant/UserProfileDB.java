package com.arjoo.demo.constant;

import com.arjoo.demo.model.Address;
import com.arjoo.demo.model.UserProfile;

import java.util.Arrays;
import java.util.List;

public class UserProfileDB {
    public static List<UserProfile> generateUserProfile() {
        Address address = Address.builder().address("Delhi").build();

        return Arrays.asList(
                UserProfile.builder()
                        .id("1")
                        .firstName("Arjoo")
                        .lastName("Kumar")
                        .password("11")
                        .email("dummy@gmail.com")
                        .addressDTO(address)
                        .build(),
                UserProfile.builder()
                        .id("2")
                        .firstName("Martin")
                        .lastName("Jos")
                        .password("11")
                        .email("dummy1@gmail.com")
                        .addressDTO(address)
                        .build()
        );
    }
}
