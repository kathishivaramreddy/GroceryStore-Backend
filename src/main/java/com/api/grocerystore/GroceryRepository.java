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
    private Grocery  product7 = new Grocery();
    private Grocery  product8 = new Grocery();
    private Grocery  product9 = new Grocery();
    private Grocery  product10 = new Grocery();
    private Grocery  product11 = new Grocery();
    private Grocery  product12 = new Grocery();




    public List<Grocery> getproducts() {

        List<Grocery> products = new ArrayList<Grocery>();

        product1.setName("Apple");
        product1.setPrice(250);
        product1.setImage("require('./images/apple.jpg')");
        product1.setCurrency("INR");
        product1.setCategory("fruits");

        product7.setName("Grapes");
        product7.setPrice(145);
        product7.setImage("require('./images/grapes.jpg')");
        product7.setCurrency("INR");
        product7.setCategory("fruits");

        product2.setName("Tomato");
        product2.setPrice(125);
        product2.setImage("require('./images/tomato.jpg')");
        product2.setCurrency("INR");
        product2.setCategory("vegetables");

        product8.setName("Potato");
        product8.setPrice(50);
        product8.setImage("require('./images/potato.jpg')");
        product8.setCurrency("INR");
        product8.setCategory("vegetables");

        product3.setName("Classic Coffee");
        product3.setPrice(250);
        product3.setImage("require('./images/coffeeclassic.jpg')");
        product3.setCurrency("INR");
        product3.setCategory("coffee");

        product9.setName("Sunrise Coffee");
        product9.setPrice(75);
        product9.setImage("require('./images/coffeesunrise.jpg')");
        product9.setCurrency("INR");
        product9.setCategory("coffee");

        product4.setName("Eggs");
        product4.setPrice(250);
        product4.setImage("require('./images/eggsmeat.jpg')");
        product4.setCurrency("INR");
        product4.setCategory("meat");

        product10.setName("Fish");
        product10.setPrice(320);
        product10.setImage("require('./images/fishmeat.jpg')");
        product10.setCurrency("INR");
        product10.setCategory("meat");

        product5.setName("Almond Milk");
        product5.setPrice(250);
        product5.setImage("require('./images/almondmilk.jpg')");
        product5.setCurrency("INR");
        product5.setCategory("milk");

        product11.setName("Low Fat Milk");
        product11.setPrice(75);
        product11.setImage("require('./images/lowfatmilk.jpg')");
        product11.setCurrency("INR");
        product11.setCategory("milk");

        product6.setName("Red Label");
        product6.setPrice(250);
        product6.setImage("require('./images/redlabeltea.jpg')");
        product6.setCurrency("INR");
        product6.setCategory("tea");

        product12.setName("Societ");
        product12.setPrice(190);
        product12.setImage("require('./images/societytea.jpg')");
        product12.setCurrency("INR");
        product12.setCategory("tea");


        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);
        products.add(product11);
        products.add(product12);

        return products;
    }

    public List<Grocery> getFruits() {

        List<Grocery> fruits = new ArrayList<Grocery>();
        product1.setName("Apple");
        product1.setPrice(250);
        product1.setImage("require('./images/apple.jpg')");
        product1.setCurrency("INR");
        product1.setCategory("fruits");

        product7.setName("Grapes");
        product7.setPrice(145);
        product7.setImage("require('./images/grapes.jpg')");
        product7.setCurrency("INR");
        product7.setCategory("fruits");

        fruits.add(product1);
        fruits.add(product7);

        return fruits;
    }
}
