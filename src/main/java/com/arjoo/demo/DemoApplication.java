package com.arjoo.demo;

import com.arjoo.demo.constant.GroceryDB;
import com.arjoo.demo.constant.UserProfileDB;
import com.arjoo.demo.model.GroceryItem;
import com.arjoo.demo.model.UserProfile;
import com.arjoo.demo.repository.ItemRepository;
import com.arjoo.demo.repository.LoginRepository;
import com.arjoo.demo.repository.UserProfileRepository;
import com.arjoo.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@SpringBootApplication
//@EnableMongoRepositories
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private UserProfileRepository userProfileRepository;

	@Autowired
	private ItemRepository groceryItemRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*List<User> users = UserDB.generateUsers();
		for(User u : users) {
			userRepository.save(u);
		}*/

		List<GroceryItem> groceryItems = GroceryDB.generateGroceries();
		for(GroceryItem g: groceryItems) {
			groceryItemRepo.save(g);
		}

		List<UserProfile> userProfiles = UserProfileDB.generateUserProfile();
		for(UserProfile u : userProfiles) {
			userProfileRepository.save(u);
		}

		System.out.println("Application running");
	}
}
