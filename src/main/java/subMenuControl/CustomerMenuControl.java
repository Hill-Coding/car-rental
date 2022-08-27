package subMenuControl;

import menuOptions.CustomerMenuOptions;

public class CustomerMenuControl {

    private static final String CHOOSE_PROPER_MESSAGE = "Wybierz poprawną opcję";


    public void customerMenu(int number) {
        System.out.println("Zarządzenie klientami");
        CustomerMenuOptions option;

        do {
            CustomerMenuOptions.printOptions();
            option = CustomerMenuOptions.createOptionFromInt(number);

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
    }

    private void addCustomer() {
    }

    private void deleteCustomer() {
    }

    private void findCustomers() {
    }

    private void editCustomer() {
    }

    private void rentCustomerRentHistory() {
    }

    private void pritnCustomers() {
    }
}
