package com.arjoo.demo.services;

import com.arjoo.demo.model.Login;
import com.arjoo.demo.model.LoginCredentialDTO;
import com.arjoo.demo.model.UserProfile;
import com.arjoo.demo.repository.LoginRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class LoginServices {

    @Autowired
    private LoginRepository loginRepository;

    public boolean authenticate(LoginCredentialDTO loginCredentialDTO) {
        UserProfile userCredential = UserProfile.builder()
                .email(loginCredentialDTO.email())
                .password(loginCredentialDTO.password())
                .build();

        Example<UserProfile> loginExample = Example.of(userCredential);
        Optional<UserProfile> find = loginRepository.findOne(loginExample);
        log.info("{}", find);
        return find.isPresent();
    }
}
