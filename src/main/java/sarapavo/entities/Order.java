package sarapavo.entities;

import java.time.LocalDate;
import java.util.List;


public class Order {

    private List<Product> products;
    private Customer customer;
    private Long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;

    //COSTRUTTORE
    public Order(List<Product> products, Customer customer, Long id, String status, LocalDate deliveryDate) {
        this.products = products;
        this.customer = customer;
        this.id = id;
        this.status = status;
        this.orderDate = LocalDate.now();
        this.deliveryDate = LocalDate.p;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
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
                '}';
    }
}
