package com.arjoo.demo.controller;

import com.arjoo.demo.model.GroceryItem;
import com.arjoo.demo.repository.ItemRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroceryController {
    private static final Logger logger = LogManager.getLogger(GroceryController.class);
    @Autowired
    ItemRepository groceryItemRepo;

    @RequestMapping(value={"/items"}, method = RequestMethod.POST)
    public String create() {
            System.out.println("Data creation started...");
            groceryItemRepo.save(new GroceryItem("Whole Wheat Biscuit", "Whole Wheat Biscuit", 5, "snacks"));
            groceryItemRepo.save(new GroceryItem("Kodo Millet", "XYZ Kodo Millet healthy", 2, "millets"));
            groceryItemRepo.save(new GroceryItem("Dried Red Chilli", "Dried Whole Red Chilli", 2, "spices"));
            groceryItemRepo.save(new GroceryItem("Pearl Millet", "Healthy Pearl Millet", 1, "millets"));
            groceryItemRepo.save(new GroceryItem("Cheese Crackers", "Bonny Cheese Crackers Plain", 6, "snacks"));
            return "Created successfully";
    }

    @RequestMapping(value={"/items"}, method = RequestMethod.GET)
    public List<GroceryItem> all() {
        return groceryItemRepo.findAll("snacks");
    }
}
