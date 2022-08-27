package menuOptions;

import exception.NoSuchOptionException;

public enum CustomerMenuOptions {
    PREVIOUS_MENU(0, "Powrót do menu głównego"),
    ADD_CUSTOMER(1, "Dodaj uzytkownika"),
    DELETE_CUSTOMER(2, "Usuń użytkownika"),
    FIND_CUSTOMER(3, "Wyszukaj użytkownika"),
    EDIT_CUSTOMER_DATA(4, "Edytuj dane użytkownika"),
    CHECK_CUSTOMER_RENT_HISTORY(5, "Historia wypożyczeń użytkownia"),
    SHOW_ALL_CUSTOMERS(6, "Lista użytkowników");

    private int value;
    private String message;

    CustomerMenuOptions(int option, String name) {
        this.value = option;
        this.message = name;
    }

    public static CustomerMenuOptions createOptionFromInt(int number) {
        try {
            return CustomerMenuOptions.values()[number];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchOptionException("Brak opcji o id " + number);
        }
    }

    public static void printOptions() {
        for (CustomerMenuOptions option : CustomerMenuOptions.values()) {
            System.out.println(option.value + " -> " + option.message);
        }
    }
}
