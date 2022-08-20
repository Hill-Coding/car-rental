package app;

import model.CarService;
import model.CustomerService;
import model.RentalService;
import optionsEnum.CarMenuOptions;
import optionsEnum.MainOptions;

import java.util.Scanner;

class CarRentalControl {

    private final CarService carService = new CarService();
    private final CustomerService customerService = new CustomerService();
    private final RentalService rentalService = new RentalService();

    // TODO move to input/output class
    private final Scanner scanner = new Scanner(System.in);

    private static final String CHOOSE_PROPER_OPTION_MESSAGE = "Wybierz poprawną opcję";

    // TODO
    void controlLoop() {
        MainOptions option;

        do {
            System.out.println("Menu główne");
            MainOptions.printOptions();
            option = MainOptions.getOptionFromInt(scanner.nextInt());

            // TODO
            switch (option) {
                case EXIT -> exit();
                case CAR_MENU -> carMenu();
                case CUSTOMER_MENU -> customerMenu();
                case RENT_MENU -> rentMenu();
                default -> System.out.println(CHOOSE_PROPER_OPTION_MESSAGE);
            }
        } while (option != MainOptions.EXIT);
    }

    // TODO
    private void carMenu() {
        System.out.println("Zarządzanie samochodami");
        CarMenuOptions option;
        do {
            CarMenuOptions.printOptions();
            option = CarMenuOptions.getOptionFromInt(scanner.nextInt());

            switch (option) {
                case PREVIOUS_MENU -> previousMenu();
                case ADD_CAR -> addCar();
                case DELETE_CAR -> deleteCar();
                case FIND_CAR -> findCar();
                case BLOCK_CAR -> blockCar();
                case CHECK_CAR_RENT_HISTORY -> checkCarRentHistory();
                default -> System.out.println(CHOOSE_PROPER_OPTION_MESSAGE);
            }
        } while (option != CarMenuOptions.PREVIOUS_MENU);
    }

    // FIXME should it be just empty method?
    private void previousMenu() {
    }

    // TODO
    private void checkCarRentHistory() {
    }

    // TODO
    private void blockCar() {
    }

    // TODO
    private void findCar() {
    }

    // TODO
    private void deleteCar() {
    }

    // TODO
    private void rentMenu() {
    }

    // TODO
    private void customerMenu() {
    }

    // TODO
    private void addCar() {
        System.out.println("TEST Dodaj samochód");
    }

    // TODO
    private void exit() {
        System.out.println("TEST Wyjście z programu");
    }
}
