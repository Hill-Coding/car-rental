package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

// TODO add class fields
// TODO add constructor
// TODO add getters and setters
// TODO add equals and hashcode
// TODO add toString
public class Rent {
    private User user;
    private Car car;
    private LocalDateTime from;
    private LocalDateTime to;
    private BigDecimal price;

    public User getUser() {
        return user;
    }
}
