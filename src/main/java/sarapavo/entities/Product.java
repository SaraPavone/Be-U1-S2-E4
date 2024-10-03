package sarapavo.entities;

import java.util.Random;

public class Product {
    private String name;
    private Long id;
    private String category;
    private Double price;


    //COSTRUTTORE
    public Product(String name, String category, Double price) {
        this.name = name;
        this.category = category;
        this.price = price;
        Random random = new Random();
        this.id = random.nextLong();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return name +
                "-ID: " + id +
                "-CATEGORY: " + category +
                "-PRICE: " + price;
    }
}