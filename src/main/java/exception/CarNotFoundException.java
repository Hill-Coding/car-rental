package exception;

public class CarNotFoundException extends RuntimeException {
    public CarNotFoundException() {
        super("Brak wyszukiwanego samochodu");
    }
}
