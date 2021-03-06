package com.api.grocerystore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroceryController {

    @Autowired
    GroceryService groceryService;

    @RequestMapping("/products")
    public Resp getProducts(){

        return new Resp(groceryService.getProducts());

    }

    @RequestMapping("/fruits")
    public Resp getFruits(){

        return new Resp(groceryService.getFruits());
    }

    public class Resp {
        private List<Grocery> products;

        Resp(List<Grocery> products) {

            this.products = products;
        }

        public List<Grocery> getProducts() {

            return products;
        }

        public void setProducts(List<Grocery> products) {

            this.products = products;
        }

    }

}
