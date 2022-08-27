package menuOptions;

import exception.NoSuchOptionException;

public enum RentMenuOption {
    PREVIOUS_MENU(0, "Powrót do menu głównego"),
    RENT_CAR(1, "Dodaj nowe wypożyczenie"),
    CHECK_CURRENTLY_AVAILABLE_CARS(2, "Sprawdź aktualnie dostępne samochody"),
    CHECK_AVAILABLE_CARS_FOR_SELECTED_DATE(3, "Sprawdź samochody dostępne w wybranym terminie");

    private int value;
    private String message;

    RentMenuOption(int value, String message) {
        this.value = value;
        this.message = message;
    }

    public static RentMenuOption createOptionFromInt(int number) {
        try {
            return RentMenuOption.values()[number];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchOptionException("Brak opcji o id " + number);
        }
    }

    public static void printOption() {
        for (RentMenuOption option : RentMenuOption.values()) {
            System.out.println(option.value + " -> " + option.message);
        }
    }
}
