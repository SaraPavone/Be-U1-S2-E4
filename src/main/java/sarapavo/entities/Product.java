package sarapavo.entities;

public class Product {
    private String name;
    private Long id;
    private String category;
    private Double price;


    //COSTRUTTORE
    public Product(String name, Long id, String category, Double price) {
        this.name = name;
        this.id = id;
        this.category = category;
        this.price = price;
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

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}