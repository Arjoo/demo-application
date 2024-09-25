package com.arjoo.demo;

import com.arjoo.demo.constant.UserDB;
import com.arjoo.demo.model.User;
import com.arjoo.demo.repository.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@SpringBootApplication
@EnableMongoRepositories
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	private static final Logger logger = LogManager.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<User> users = UserDB.generateUsers();
		for(User u : users) {
			userRepository.save(u);
		}
		System.out.println("Application running");

	}
}
