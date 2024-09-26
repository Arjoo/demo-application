package com.arjoo.demo.constant;

import com.arjoo.demo.model.GroceryItem;
import com.arjoo.demo.model.User;

import java.util.Arrays;
import java.util.List;

public class GroceryDB {

    public static List<GroceryItem> generateGroceries() {
        return Arrays.asList(
            new GroceryItem("Whole Wheat Biscuit", "Whole Wheat Biscuit", 5, "snacks"),
            new GroceryItem("Kodo Millet", "XYZ Kodo Millet healthy", 2, "millets"),
            new GroceryItem("Dried Red Chilli", "Dried Whole Red Chilli", 2, "spices"),
            new GroceryItem("Pearl Millet", "Healthy Pearl Millet", 1, "millets"),
            new GroceryItem("Cheese Crackers", "Bonny Cheese Crackers Plain", 6, "snacks"),
            new GroceryItem("Cheese", "Bonny Cheese Crackers Plain", 6, "snacks")
        );
    }
}
