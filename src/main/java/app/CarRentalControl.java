package app;

import car.model.Car;
import exception.NoSuchOptionException;
import io.DataReader;
import car.CarService;
import customer.CustomerService;
import rent.RentalService;
import menuoptions.CarMenuOptions;
import menuoptions.MainMenuOptions;

import java.util.InputMismatchException;

class CarRentalControl {

    private final CarService carService = new CarService();
    private final CustomerService customerService = new CustomerService();
    private final RentalService rentalService = new RentalService();

    private final DataReader dataReader = new DataReader();

    private static final String CHOOSE_PROPER_OPTION_MESSAGE = "Wybierz poprawną opcję";

    // TODO
    void controlLoop() {
        MainMenuOptions option = null;

        do {
            System.out.println("Menu główne");
            MainMenuOptions.printOptions();

            // FIXME move to separate method, example: private MenuOption getOption();
            // fixme from here -> {
            boolean optionOk = false;
            while (!optionOk) {
                try {
                    option = MainMenuOptions.getOptionFromInt(dataReader.readInt());
                    optionOk = true;
                } catch (NoSuchOptionException e) {
                    System.out.println(e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("Opcja musi być liczbą");
                }
            }
            // fixme } <- to here

            switch (option) {
                case EXIT -> exit();
                case CAR_MENU -> carMenu();
                case CUSTOMER_MENU -> customerMenu();
                case RENT_MENU -> rentMenu();
                default -> System.out.println(CHOOSE_PROPER_OPTION_MESSAGE);
            }
        } while (option != MainMenuOptions.EXIT);
    }

    private void carMenu() {
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

    private void showAllCars() {
        carService.printAllCars();
    }

    // TODO
    private void rentMenu() {
        throw new RuntimeException("Not implemented yet");
    }

    // TODO
    private void customerMenu() {
        throw new RuntimeException("Not implemented yet");
    }

    // FIXME should it be just empty method?
    private void previousMenu() {
    }

    // TODO
    private void checkCarRentHistory() {
        throw new RuntimeException("Not implemented yet");
    }

    // TODO
    private void blockCar() {
        throw new RuntimeException("Not implemented yet");
    }

    // TODO
    private void findCar() {
        throw new RuntimeException("Not implemented yet");
    }

    // TODO
    private void deleteCar() {
        throw new RuntimeException("Not implemented yet");
    }

    // TODO
    private void addCar() {
        Car carToSave = dataReader.readAndCreateCar();
        carService.addCar(carToSave);
    }

    // TODO should close some file connections and scanner?
    private void exit() {
        dataReader.close();
        System.out.println("Wyjście z programu");
    }
}
