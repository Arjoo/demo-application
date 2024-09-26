package com.arjoo.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("groceryitems")
@Data
public class GroceryItem {

        @Id
        private final String id;

        private final String name;
        private final int quantity;
        private final String category;
}