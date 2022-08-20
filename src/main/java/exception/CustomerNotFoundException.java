package exception;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException() {
        super("Brak wyszukiwanego klienta");
    }
}
