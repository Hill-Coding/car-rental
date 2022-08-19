package model;

import exception.CustomerAlreadyExistsException;
import model.customer.Customer;

import java.util.List;

public class CustomerService {

    private List<Customer> customers;

    // TODO
    void addCustomer(Customer customer) {
        if (customers.contains(customer))
            throw new CustomerAlreadyExistsException(customer);
        customers.add(customer);
    }

    // TODO
    void deleteCustomer() {

    }
}
