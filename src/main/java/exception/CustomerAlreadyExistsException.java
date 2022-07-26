package exception;

import model.customer.Customer;

public class CustomerAlreadyExistsException extends RuntimeException {

    public CustomerAlreadyExistsException(Customer customer) {
        super(customer + " already exists");
    }
}
