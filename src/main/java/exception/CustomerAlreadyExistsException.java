package exception;

import model.Customer;

public class CustomerAlreadyExistsException extends RuntimeException {

    public CustomerAlreadyExistsException(Customer customer) {
        super(customer + " already exists");
    }
}
