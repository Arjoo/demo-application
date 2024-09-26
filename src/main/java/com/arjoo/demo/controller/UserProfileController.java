package com.arjoo.demo.controller;

import com.arjoo.demo.dto.UserProfileDTO;
import com.arjoo.demo.services.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/profile")
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    @PostMapping(value = "/create")
    public ResponseEntity<String> createProfile(@RequestBody UserProfileDTO userProfile) {
        boolean profile = userProfileService.createProfile(userProfile);
        return profile
                ? new ResponseEntity<>("Profile created", HttpStatus.CREATED)
                : new ResponseEntity<>("Profile not created", HttpStatus.OK);
    }
}
