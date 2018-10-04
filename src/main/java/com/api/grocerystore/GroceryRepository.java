package com.api.grocerystore;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class GroceryRepository {

    private Grocery  product1 = new Grocery();
    private Grocery  product2 = new Grocery();
    private Grocery  product3 = new Grocery();
    private Grocery  product4 = new Grocery();
    private Grocery  product5 = new Grocery();
    private Grocery  product6 = new Grocery();

    public List<Grocery> getproducts() {

        List<Grocery> products = new ArrayList<Grocery>();

        product1.setName("Apple");
        product1.setPrice(250);
        product1.setImage("require('./images/apple.jpg')");
        product1.setCurrency("INR");
        product1.setCategory("fruits");

        product2.setName("Tomato");
        product2.setPrice(125);
        product2.setImage("require('./images/tomato.jpg')");
        product2.setCurrency("INR");
        product2.setCategory("vegetables");

        product3.setName("Classic Coffee");
        product3.setPrice(250);
        product3.setImage("require('./images/coffeeclassic.jpg')");
        product3.setCurrency("INR");
        product3.setCategory("coffee");

        product4.setName("Eggs");
        product4.setPrice(250);
        product4.setImage("require('./images/eggsmeat.jpg')");
        product4.setCurrency("INR");
        product4.setCategory("meat");

        product5.setName("Almond Milk");
        product5.setPrice(250);
        product5.setImage("require('./images/almondmilk.jpg')");
        product5.setCurrency("INR");
        product5.setCategory("milk");

        product6.setName("Red Label");
        product6.setPrice(250);
        product6.setImage("require('./images/redlabeltea.jpg')");
        product6.setCurrency("INR");
        product6.setCategory("tea");

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);



        return products;
    }
}
