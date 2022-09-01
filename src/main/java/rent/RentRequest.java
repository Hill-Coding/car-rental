package rent;

import car.model.Car;
import customer.model.Customer;

import java.time.LocalDateTime;

public record RentRequest (
        Customer customer,
        Car car,
        LocalDateTime from,
        LocalDateTime to,
        String placeOfRent,
        String placeOfReturn,
        int userNumber
) { }
