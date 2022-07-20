package model.car;

import java.math.BigDecimal;
import java.util.Set;

// TODO add class fields
// TODO add constructor
// TODO add getters and setters
// TODO add equals and hashcode
// TODO add toString
public class Car {
    private BigDecimal basePrice;
    // FIXME change to suitable Java class (Date, LocalDate, Year...)
    private String productionYear;
    private Set<CarType> carTypes;
    private EngineType engineType;
    private Gearbox gearbox;
}
