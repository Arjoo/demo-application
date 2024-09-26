package com.arjoo.demo.controller;

import com.arjoo.demo.model.GroceryItem;
import com.arjoo.demo.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping(value = "/grocery")
public class GroceryController {

    @Autowired
    ItemRepository groceryItemRepo;

    @GetMapping(value = "/item")
    public List<GroceryItem> item(@RequestParam(value = "categoryName", defaultValue = "snacks") String categoryName) {
        return groceryItemRepo.findAll(categoryName);
    }

    @GetMapping(value = "/")
    public List<GroceryItem> items() {
        return groceryItemRepo.findAll();
    }
}

