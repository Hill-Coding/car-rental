package menuOptions;

import exception.NoSuchOptionException;

public enum MainMenuOptions {
    EXIT(0, "Wyjście z programu"),
    CAR_MENU(1, "Zarządzanie flotą"),
    CUSTOMER_MENU(2, "Zarządzanie klientami"),
    RENT_MENU(3, "Zarządzanie wynajmem");

    private int value;
    private String message;

    MainMenuOptions(int value, String message) {
        this.message = message;
        this.value = value;
    }

    public static MainMenuOptions getOptionFromInt(int number) throws NoSuchOptionException {
        try {
            return MainMenuOptions.values()[number];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchOptionException("Brak opcji o id " + number);
        }
    }

    public static void printOptions() {
        for (MainMenuOptions option : MainMenuOptions.values()) {
            System.out.println(option.value + " -> " + option.message);
        }
    }
}
