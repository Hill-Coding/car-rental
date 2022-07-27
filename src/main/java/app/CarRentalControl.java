package app;

import model.CarService;
import model.CustomerService;
import model.RentalService;

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
        System.out.println("Control loop");

        // TODO change to Option enum
        int option;

        do {
            System.out.println("TEST Menu główne");

            option = scanner.nextInt();
            scanner.nextLine();

            // TODO
            switch (option) {
                case 0 -> exit();
                case 1 -> carMenu();
                case 2 -> customerMenu();
                case 3 -> rentMenu();
                default -> System.out.println(CHOOSE_PROPER_OPTION_MESSAGE);
            }
        } while (option != 0);
    }

    // TODO
    private void carMenu() {
        System.out.println("TEST Zarządzanie samochodami");
        int option;
        do {
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0 -> System.out.println("Cofam do poprzedniego menu");
                case 1 -> addCar();
                default -> System.out.println(CHOOSE_PROPER_OPTION_MESSAGE);
            }
        } while (option != 0);
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
