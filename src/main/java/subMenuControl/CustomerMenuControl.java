package subMenuControl;

import app.CarRentalControl;
import io.DataReader;
import menuOptions.CustomerMenuOptions;

public class CustomerMenuControl {

    private static final String CHOOSE_PROPER_MESSAGE = "Wybierz poprawną opcję";

    DataReader dataReader = new DataReader();

    public void customerMenu() {
        System.out.println("Zarządzenie klientami");
        CustomerMenuOptions option;

        do {
            CustomerMenuOptions.printOptions();
            option = CustomerMenuOptions.createOptionFromInt(dataReader.readInt());

            switch (option) {
                case PREVIOUS_MENU -> previousMenu();
                case ADD_CUSTOMER -> addCustomer();
                case DELETE_CUSTOMER -> deleteCustomer();
                case FIND_CUSTOMER -> findCustomers();
                case EDIT_CUSTOMER_DATA -> editCustomer();
                case CHECK_CUSTOMER_RENT_HISTORY -> rentCustomerRentHistory();
                case SHOW_ALL_CUSTOMERS -> pritnCustomers();
                default -> System.out.println(CHOOSE_PROPER_MESSAGE);
            }
        }
        while (option != CustomerMenuOptions.PREVIOUS_MENU);
    }

    private void previousMenu() {
        CarRentalControl carRentalControl = new CarRentalControl();
        carRentalControl.controlLoop();
    }

    private void addCustomer() {
        throw new RuntimeException("Not implemented yet");
    }

    private void deleteCustomer() {
        throw new RuntimeException("Not implemented yet");
    }

    private void findCustomers() {
        throw new RuntimeException("Not implemented yet");
    }

    private void editCustomer() {
        throw new RuntimeException("Not implemented yet");
    }

    private void rentCustomerRentHistory() {
        throw new RuntimeException("Not implemented yet");
    }

    private void pritnCustomers() {
        throw new RuntimeException("Not implemented yet");
    }
}
