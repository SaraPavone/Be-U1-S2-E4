package sarapavo;


import sarapavo.entities.Customer;
import sarapavo.entities.Order;
import sarapavo.entities.Product;

import java.util.*;
import java.util.stream.Collectors;

public class Application {

    public static List<Product> warehouse = new ArrayList<>();
    public static List<Customer> customers = new ArrayList<>();
    public static List<Order> orders = new ArrayList<>();

    public static void main(String[] args) {
        warehouseProducts();
        createCustomers();
        createOrders();

        System.out.println("----------------------ESERCIZIO 1-----------------------");

        getCustomerOrders().forEach((customer, order) -> System.out.println("Il cliente: " + customer.getName() + " " + customer.getSurname() + ", ha effettuato: " + order.size() + " ordini."));

        System.out.println("----------------------ESERCIZIO 2-----------------------");

        getTotalByCustomer().forEach((customer, total) -> System.out.println("Il totale speso da " + customer.getName() + " " + customer.getSurname() + " é: " + total));

        System.out.println("----------------------ESERCIZIO 3-----------------------");

        System.out.println("I 3 prodotti piú costosi dello store sono: ");
        getMostExpensive().forEach(product -> System.out.println("- " + product));

        System.out.println("----------------------ESERCIZIO 4-----------------------");

        getAverage().toString();
        System.out.println("La media degli importi degli ordini é: " + getAverage());

    }

    //"----------------------ESERCIZIO 1-----------------------"
    public static Map<Customer, List<Order>> getCustomerOrders() {
        return orders.stream().collect(Collectors.groupingBy(Order::getCustomer));
    }
    //"----------------------ESERCIZIO 2-----------------------"

    public static Map<Customer, Double> getTotalByCustomer() {
        return orders.stream()
                .collect(Collectors.groupingBy(Order::getCustomer,
                        Collectors.collectingAndThen(Collectors.summingDouble(Order::getTotal),
                                total -> Math.round(total * 100.0) / 100.0)));
    }


    //"----------------------ESERCIZIO 3-----------------------"

    public static List<Product> getMostExpensive() {
        return warehouse.stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed()).limit(3).toList();
    }

    //"----------------------ESERCIZIO 4-----------------------"

    public static Double getAverage() {
        Double average = orders.stream().collect(Collectors.averagingDouble(Order::getTotal));
        return Math.round(average * 100.0) / 100.0;
    }


    public static void createCustomers() {

        Customer john = new Customer("John", "Doe", 1);
        Customer jane = new Customer("Jane", "Smith", 2);
        Customer michael = new Customer("Michael", "Johnson", 3);
        Customer emily = new Customer("Emily", "Davis", 1);
        Customer david = new Customer("David", "Brown", 2);
        Customer sarah = new Customer("Sarah", "Wilson", 3);

        customers.add(john);
        customers.add(jane);
        customers.add(michael);
        customers.add(emily);
        customers.add(david);
        customers.add(sarah);

    }

    public static void warehouseProducts() {


        Product iPhone = new Product("Apple iPhone 15", "Electronics", 999.00);
        Product smartphone = new Product("Samsung Galaxy S23", "Electronics", 799.00);
        Product headphones = new Product("Sony WH-1000XM5 Headphones", "Electronics", 349.99);
        Product laptop = new Product("Dell XPS 13 Laptop", "Computers", 1199.59);
        Product speaker = new Product("Bose SoundLink Bluetooth Speaker", "Electronics", 129.00);
        Product nike = new Product("Nike Air Max 270", "Footwear", 150.60);
        Product adidas = new Product("Adidas Ultraboost Running Shoes", "Footwear", 180.25);
        Product jacket = new Product("Patagonia Down Sweater Jacket", "Clothing", 229.96);
        Product jeans = new Product("Levi's 501 Original Jeans", "Clothing", 89.76);
        Product glasses = new Product("Ray-Ban Aviator Sunglasses", "Accessories", 154.88);
        Product mixer = new Product("KitchenAid Stand Mixer", "Kitchen Appliances", 379.31);
        Product vacuum = new Product("Dyson V11 Cordless Vacuum Cleaner", "Home Appliances", 599.99);
        Product echo = new Product("Amazon Echo Show 8", "Smart Home", 129.00);
        Product thermos = new Product("Google Nest Thermostat", "Smart Home", 249.97);
        Product fitbit = new Product("Fitbit Charge 5", "Wearable Tech", 179.36);
        Product canon = new Product("Canon EOS R5 Mirrorless Camera", "Electronics", 3899.22);
        Product playStation = new Product("Sony PlayStation 5", "Gaming", 499.50);
        Product nintendo = new Product("Nintendo Switch OLED", "Gaming", 349.06);
        Product tv = new Product("LG OLED65CXPUA 65 TV", "Electronics", 1799.49);
        Product iPad = new Product("Apple iPad Pro 12.9", "Tablets", 1099.99);


        Product[] products = {iPhone, smartphone, headphones, laptop, speaker, nike, adidas, jacket, jeans, glasses, mixer, vacuum, echo, thermos, fitbit, canon, playStation, nintendo, tv, iPad};


        warehouse.addAll(Arrays.asList(products));
    }

    public static void createOrders() {

        Order johns = new Order(customers.get(0));
        Order janes = new Order(customers.get(1));
        Order michaels = new Order(customers.get(2));
        Order emilys = new Order(customers.get(3));
        Order davids = new Order(customers.get(4));
        Order sarahs = new Order(customers.get(5));

        Product iPhone = warehouse.get(0);
        Product smartphone = warehouse.get(1);
        Product headphones = warehouse.get(2);
        Product laptop = warehouse.get(3);
        Product speaker = warehouse.get(4);
        Product nike = warehouse.get(5);
        Product adidas = warehouse.get(6);
        Product jacket = warehouse.get(7);
        Product jeans = warehouse.get(8);
        Product glasses = warehouse.get(9);
        Product mixer = warehouse.get(10);
        Product vacuum = warehouse.get(11);
        Product echo = warehouse.get(12);
        Product thermos = warehouse.get(13);
        Product fitbit = warehouse.get(14);
        Product canon = warehouse.get(15);
        Product playStation = warehouse.get(16);
        Product nintendo = warehouse.get(17);
        Product tv = warehouse.get(18);
        Product iPad = warehouse.get(19);


        johns.addProductToList(vacuum);
        johns.addProductToList(canon);
        johns.addProductToList(jacket);

        janes.addProductToList(tv);
        janes.addProductToList(nike);
        janes.addProductToList(jacket);
        janes.addProductToList(headphones);
        janes.addProductToList(mixer);
        janes.addProductToList(fitbit);

        michaels.addProductToList(iPad);
        michaels.addProductToList(iPhone);

        emilys.addProductToList(speaker);
        emilys.addProductToList(echo);
        emilys.addProductToList(jeans);
        emilys.addProductToList(smartphone);

        davids.addProductToList(laptop);
        davids.addProductToList(playStation);
        davids.addProductToList(nintendo);
        davids.addProductToList(nike);
        davids.addProductToList(headphones);

        sarahs.addProductToList(adidas);
        sarahs.addProductToList(glasses);
        sarahs.addProductToList(thermos);


        orders.add(johns);
        orders.add(janes);
        orders.add(michaels);
        orders.add(emilys);
        orders.add(davids);
        orders.add(sarahs);


    }


}
