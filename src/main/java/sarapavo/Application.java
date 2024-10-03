package sarapavo;

import com.github.javafaker.Faker;
import sarapavo.entities.Customer;
import sarapavo.entities.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.function.Supplier;

public class Application {

    public static void main(String[] args) {

        Supplier<Customer> customerSupplier = () -> {
            Faker faker = new Faker(Locale.ITALY);
            Random random = new Random();
            return new Customer(faker.harryPotter().character(), faker.name().lastName(), random.nextLong (1,100));
        };

        List<Customer> randomCustomers = new ArrayList<>();

        for (int i = 0; i < 100; i++){
            randomCustomers.add(customerSupplier.get());
        }

        Supplier<List<Order>> orderSupplier = () -> {
            List<Order> orderList = new ArrayList<>();
            for (int i = 0; i < 20; i++ ){
          orderList.add(customerSupplier.get());

        }


    }
}
