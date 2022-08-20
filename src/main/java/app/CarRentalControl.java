package app;

import exception.NoSuchOptionException;
import model.CarService;
import model.CustomerService;
import model.RentalService;
import optionsEnum.CarMenuOptions;
import optionsEnum.MainOptions;

import java.util.InputMismatchException;
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
        MainOptions option = null;

        do {
            System.out.println("Menu główne");
            MainOptions.printOptions();

            // FIXME move to separate method, example: private MenuOption getOption();
            // fixme from here -> {
            boolean optionOk = false;
            while (!optionOk) {
                try {
                    option = MainOptions.getOptionFromInt(scanner.nextInt());
                    optionOk = true;
                } catch (NoSuchOptionException e) {
                    System.out.println(e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("Opcja musi być liczbą");
                }
                scanner.nextLine();
            }
            // fixme } <- to here

            switch (option) {
                case EXIT -> exit();
                case CAR_MENU -> carMenu();
                case CUSTOMER_MENU -> customerMenu();
                case RENT_MENU -> rentMenu();
                default -> System.out.println(CHOOSE_PROPER_OPTION_MESSAGE);
            }
        } while (option != MainOptions.EXIT);
    }

    private void carMenu() {
        System.out.println("Zarządzanie samochodami");
        CarMenuOptions option;
        do {
            CarMenuOptions.printOptions();
            // FIXME getOptionFromInt can throw NoSuchOptionException or InputMismatchException
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
        throw new RuntimeException("Not implemented yet");
    }

    // TODO should close some file connections and scanner?
    private void exit() {
        System.out.println("Wyjście z programu");
    }
}
