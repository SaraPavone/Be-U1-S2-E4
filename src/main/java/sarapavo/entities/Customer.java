package sarapavo.entities;

public class Customer {
    private String name;
    private String surname;
    private Long id;
    private Integer tier;


    //COSTRUTTORE
    public Customer(String name, String surname, Long id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.tier = tier;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }
}



