package optionsEnum;

import exception.NoSuchOptionException;

public enum MainOptions {
    EXIT(0, "Wyjście z programu"),
    CAR_MENU(1, "Zarządzanie flotą"),
    CUSTOMER_MENU(2, "Zarządzanie klientami"),
    RENT_MENU(3, "Zarządzanie wynajmem");

    private int value;
    private String message;

    MainOptions(int value, String message) {
        this.message = message;
        this.value = value;
    }

    public static MainOptions getOptionFromInt(int number) {
        try {
            return MainOptions.values()[number];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchOptionException("Brak opcji o id " + number);
        }
    }

    public static void printOptions() {
        for (MainOptions option : MainOptions.values()) {
            System.out.println(option.value + " -> " + option.message);
        }
    }
}
