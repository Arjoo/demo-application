package com.arjoo.demo.controller;

import com.arjoo.demo.model.LoginCredentialDTO;
import com.arjoo.demo.repository.LoginRepository;
import com.arjoo.demo.services.LoginServices;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/authenticate")
@Slf4j
public class LoginController {

    @Autowired
    private LoginServices loginServices;

    @PostMapping()
    public ResponseEntity<String> authenticate(@RequestBody LoginCredentialDTO loginDTO) {
        boolean authenticated = loginServices.authenticate(loginDTO);
        return authenticated
                ? new ResponseEntity<>("Log-in successfully", HttpStatus.OK)
                : new ResponseEntity<>("Log-in failure", HttpStatus.NOT_FOUND);
    }
}
