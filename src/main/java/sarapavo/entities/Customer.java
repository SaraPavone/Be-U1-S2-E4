package sarapavo.entities;

import java.util.Random;

public class Customer {
    private String name;
    private String surname;
    private Long id;
    private Integer tier;


    //COSTRUTTORE
    public Customer(String name, String surname, Integer tier) {
        this.name = name;
        this.surname = surname;
        this.tier = tier;
        Random random = new Random();
        this.id = random.nextLong();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return name + " " + surname +
                "  -ID: " + id +
                "  -TIER: " + tier;
    }
}



