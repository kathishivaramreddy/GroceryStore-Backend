package com.api.grocerystore;

public class Grocery {

    private String name;
    private int price;
    private String image;
    private String currency;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "[{"+"name:" + name
                + ",price:" + price
                + ",image:" + image
                + ",currency=" + currency
                +",category="+ category + "}]";
    }

}
