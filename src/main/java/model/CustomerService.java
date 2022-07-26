package model;

import model.customer.Customer;

import java.util.List;

public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    private List<Customer> customers;

    // TODO
    void addCustomer() {

    }

    // TODO
    void deleteCustomer() {

    }
}
