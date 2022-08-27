package subMenuControl;

import car.CarService;
import car.model.Car;
import io.DataReader;
import menuOptions.CarMenuOptions;

public class CarMenuControl {

    private static final String CHOOSE_PROPER_OPTION_MESSAGE = "Wybierz poprawną opcję";

    private final CarService carService = new CarService();
    private final DataReader dataReader = new DataReader();

    public void carMenu() {
        System.out.println("Zarządzanie samochodami");
        CarMenuOptions option;
        do {
            CarMenuOptions.printOptions();
            // FIXME getOptionFromInt can throw NoSuchOptionException or InputMismatchException
            option = CarMenuOptions.getOptionFromInt(dataReader.readInt());

            switch (option) {
                case PREVIOUS_MENU -> previousMenu();
                case ADD_CAR -> addCar();
                case DELETE_CAR -> deleteCar();
                case FIND_CAR -> findCar();
                case BLOCK_CAR -> blockCar();
                case CHECK_CAR_RENT_HISTORY -> checkCarRentHistory();
                case SHOW_ALL_CARS -> showAllCars();
                default -> System.out.println(CHOOSE_PROPER_OPTION_MESSAGE);
            }
        } while (option != CarMenuOptions.PREVIOUS_MENU);
    }

    private void previousMenu() {
    }

    private void addCar() {
        Car carToSave = dataReader.readAndCreateCar();
        carService.addCar(carToSave);
    }

    private void deleteCar() {
        throw new RuntimeException("Not implemented yet");
    }

    private void findCar() {
        throw new RuntimeException("Not implemented yet");
    }

    private void blockCar() {
        throw new RuntimeException("Not implemented yet");
    }

    private void checkCarRentHistory() {
        throw new RuntimeException("Not implemented yet");
    }

    private void showAllCars() {
        carService.printAllCars();
    }
}


