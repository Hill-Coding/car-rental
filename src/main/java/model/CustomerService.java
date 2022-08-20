package model;

import exception.CustomerAlreadyExistsException;
import exception.CustomerNotFoundException;
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
    void deleteCustomer(String drivingLicenseNumber) {
        customers.stream()
                .filter(customer -> customer.getDrivingLicenseNumber().equals(drivingLicenseNumber))
                .findFirst()
                .orElseThrow(CustomerNotFoundException::new);
    }
}
