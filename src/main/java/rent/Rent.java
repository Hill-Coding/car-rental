package rent;

import car.model.Car;
import customer.model.Customer;

import java.math.BigDecimal;
import java.time.LocalDateTime;

// TODO add class fields
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
    private int userNumber;

    public Rent(Customer customer,
                Car car,
                LocalDateTime from,
                LocalDateTime to,
                String placeOfRent,
                String placeOfReturn,
                BigDecimal price,
                int userNumber) {
        this.customer = customer;
        this.car = car;
        this.from = from;
        this.to = to;
        this.placeOfRent = placeOfRent;
        this.placeOfReturn = placeOfReturn;
        this.price = price;
        this.userNumber = userNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Car getCar() {
        return car;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public String getPlaceOfRent() {
        return placeOfRent;
    }

    public String getPlaceOfReturn() {
        return placeOfReturn;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getUserNumber() {
        return userNumber;
    }
}
