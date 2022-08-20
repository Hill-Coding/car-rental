package optionsEnum;

import exception.NoSuchOptionException;

public enum CarMenuOptions {
    PREVIOUS_MENU(0, "Powrót do menu głównego"),
    ADD_CAR(1, "Dodaj samochód"),
    DELETE_CAR(2, "Usuń samochód"),
    FIND_CAR(3, "Wyszukaj samochód"),
    BLOCK_CAR(4, "Zablokuj samochód"),
    CHECK_CAR_RENT_HISTORY(5, "Historia wypożyczeń samochodu");

    private int value;
    private String message;

    CarMenuOptions(int value, String message) {
        this.message = message;
        this.value = value;
    }

    public static CarMenuOptions getOptionFromInt(int number) throws NoSuchOptionException {
        try {
            return CarMenuOptions.values()[number];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchOptionException("Brak opcji o id " + number);
        }
    }

    public static void printOptions() {
        for (CarMenuOptions option : CarMenuOptions.values()) {
            System.out.println(option.value + " -> " + option.message);
        }
    }
}
