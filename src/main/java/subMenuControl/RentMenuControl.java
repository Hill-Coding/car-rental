package subMenuControl;

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

    }

    private void rentCar() {

    }

    private void checkCurrentAvailableCar() {

    }

    private void checkAvailebleCarForSelectedDate() {

    }
}
