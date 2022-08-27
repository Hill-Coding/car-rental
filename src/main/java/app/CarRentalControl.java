package app;

import exception.NoSuchOptionException;
import io.DataReader;
import car.CarService;
import customer.CustomerService;
import subMenuControl.CarMenuControl;
import rent.RentalService;
import menuOptions.MainMenuOptions;

import java.util.InputMismatchException;

public class CarRentalControl {

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
                    System.out.println("Nieprawidłowy format danych");
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
        CarMenuControl carControl = new CarMenuControl();
        carControl.carMenu();
    }

    // TODO
    private void rentMenu() {
        throw new RuntimeException("Not implemented yet");
    }

    // TODO
    private void customerMenu() {
        throw new RuntimeException("Not implemented yet");
    }


//    // TODO
//    private void addCar() {
//        Car carToSave = dataReader.readAndCreateCar();
//        carService.addCar(carToSave);
//    }

//    private void showAllCars() {
//        carService.printAllCars();
//    }

//    private void previousMenu () {
//        controlLoop();
//    }

    // TODO
//    private void deleteCar() {
//        throw new RuntimeException("Not implemented yet");
//    }

    //TODO
//    private void findCar() {
//        throw new RuntimeException("Not implemented yet");
//    }

    // TODO
//    private void blockCar() {
//        throw new RuntimeException("Not implemented yet");
//    }

//     // TODO
//        private void checkCarRentHistory () {
//            throw new RuntimeException("Not implemented yet");
//        }

    // TODO should close some file connections and scanner?
    private void exit() {
        dataReader.close();
        System.out.println("Wyjście z programu");
    }
}
