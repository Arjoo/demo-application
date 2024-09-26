package com.arjoo.demo.repository;

import com.arjoo.demo.model.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ItemRepository extends MongoRepository<GroceryItem, String> {
    
    @Query("{name:'?0'}")
    GroceryItem findItemByName(String name);
    
    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1, 'category': 1}")
    List<GroceryItem> findAll(String category);
    
    long count();

}