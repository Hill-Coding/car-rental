package subMenuControl;

import app.CarRentalControl;
import io.DataReader;
import menuOptions.RentMenuOption;

public class RentMenuControl {

    private final static String CHOOSE_PROPER_OPTION_MESSAGE = "Wybierz poprawną opcję";

    DataReader dataReader = new DataReader();

    public void rentMenu() {
        System.out.println("Zarządanie wynajmen");
        RentMenuOption option;
        do {
            RentMenuOption.printOption();
            option = RentMenuOption.createOptionFromInt(dataReader.readInt());

            switch (option) {
                case PREVIOUS_MENU -> previousMenu();
                case RENT_CAR -> rentCar();
                case CHECK_CURRENTLY_AVAILABLE_CARS -> checkCurrentAvailableCar();
                case CHECK_AVAILABLE_CARS_FOR_SELECTED_DATE -> checkAvailebleCarForSelectedDate();
                default -> System.out.println(CHOOSE_PROPER_OPTION_MESSAGE);
            }
        } while (option != RentMenuOption.PREVIOUS_MENU);
    }

    private void previousMenu() {
        CarRentalControl carRentalControl = new CarRentalControl();
        carRentalControl.controlLoop();
    }

    private void rentCar() {
        throw new RuntimeException("Not implemented yet");
    }

    private void checkCurrentAvailableCar() {
        throw new RuntimeException("Not implemented yet");

    }

    private void checkAvailebleCarForSelectedDate() {
        throw new RuntimeException("Not implemented yet");

    }
}
