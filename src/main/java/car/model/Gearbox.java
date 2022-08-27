package car.model;

public enum Gearbox {
    AUTOMATIC,
    MANUAL;

    public static void printOption() {
        for (Gearbox option : Gearbox.values()) {
            System.out.println(option);
        }
    }
}
