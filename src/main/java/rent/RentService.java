package rent;

import availability.AvailabilityService;
import car.CarService;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Duration;
import java.util.List;

public class RentService {

    private final AvailabilityService availabilityService;
    private final RentalHistoryService rentalHistoryService;
    private List<Rent> rents;

    public RentService(AvailabilityService availabilityService, CarService carService, RentalHistoryService rentalHistoryService) {
        this.availabilityService = availabilityService;
        this.rentalHistoryService = rentalHistoryService;
    }

    // TODO test method
    public void rentCar(RentRequest rent) {
        boolean isCarAvailable = availabilityService.checkAvailability(rent.car(), rent.from(), rent.to());
        if (isCarAvailable) {
            long daysNumber = Duration.between(rent.from(), rent.to()).toDays();
            BigDecimal calculatedPrice = calculatePrice(daysNumber);
            rents.add(new Rent(
                    rent.customer(),
                    rent.car(),
                    rent.from(),
                    rent.to(),
                    rent.placeOfRent(),
                    rent.placeOfReturn(),
                    calculatedPrice,
                    rent.userNumber()
                    )
            );
        } else {
            System.out.println("Car is not available in requested dates");
        }
    }

    // todo implement method
    private BigDecimal calculatePrice(long daysNumber) {
        return null;
    }

    // TODO test method
    public void returnCar(Rent rent) {
        rents.remove(rent);
        rentalHistoryService.getRentalHistory().add(rent);
    }
}
