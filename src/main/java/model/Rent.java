package model;

import model.car.Car;
import model.customer.Customer;

import java.math.BigDecimal;
import java.time.LocalDateTime;

// TODO add class fields
// TODO add constructor
// TODO add getters and setters
// TODO add toString
public class Rent {
    private Customer customer;
    private Car car;
    private LocalDateTime from;
    private LocalDateTime to;
    private String placeOfRent;
    private String placeOfReturn;
    private BigDecimal price;
}
