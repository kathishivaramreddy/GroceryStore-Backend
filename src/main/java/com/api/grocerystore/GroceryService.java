package com.api.grocerystore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceryService {

    @Autowired
    GroceryRepository groceryRepository;

    public List<Grocery> getProducts() {
        return groceryRepository.getproducts();
    }

}
