package sarapavo.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Order {

    private List<Product> products;
    private Customer customer;
    private Long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;

    //COSTRUTTORE
    public Order(Customer customer) {
        this.products = new ArrayList<>();
        this.customer = customer;
        this.status = "We're working on it!";
        this.orderDate = LocalDate.now();
        this.deliveryDate = LocalDate.now().plusWeeks(1);
    }

    public List<Product> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


    //Aggiungo il singolo prodotto alla lista products
    public void addProductToList(Product p) {
        products.add(p);
    }

    //Totale dell'ordine
    public double getTotal() {
        return this.products.stream().mapToDouble(Product::getPrice).sum();
    }


    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", customer=" + customer +
                ", id=" + id +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", Total: " + getTotal() + "$}";
    }
}
