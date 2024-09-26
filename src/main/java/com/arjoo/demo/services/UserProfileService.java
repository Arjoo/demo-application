package com.arjoo.demo.services;

import com.arjoo.demo.dto.AddressDTO;
import com.arjoo.demo.dto.UserProfileDTO;
import com.arjoo.demo.model.Address;
import com.arjoo.demo.model.UserProfile;
import com.arjoo.demo.repository.UserProfileRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    public boolean createProfile(UserProfileDTO userProfileDTO) {
        Address address = Address.builder()
                .address(userProfileDTO.getAddressDTO().getAddress())
                .build();
        UserProfile userProfile = UserProfile.builder()
                .firstName(userProfileDTO.getFirstName())
                .lastName(userProfileDTO.getLastName())
                .email(userProfileDTO.getEmail())
                .addressDTO(address)
                .password(userProfileDTO.getPassword()).build();

        UserProfile save = userProfileRepository.save(userProfile);
        return save.getId() != null;


    }
}
