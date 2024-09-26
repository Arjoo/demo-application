package com.arjoo.demo.services;

import com.arjoo.demo.model.Login;
import com.arjoo.demo.model.LoginCredentialDTO;
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
        Login login = Login.builder()
                .userName(loginCredentialDTO.userName())
                .password(loginCredentialDTO.password())
                .build();
        Example<Login> loginExample = Example.of(login);
        Optional<Login> find = loginRepository.findOne(loginExample);
        log.info("{}", find);
        return find.isPresent() ? Boolean.TRUE : Boolean.FALSE;
    }
}
