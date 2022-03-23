package nl.anva.springtraining.api.exception;

public class EvenNumberException extends RuntimeException {
    public EvenNumberException(String message) {
        super(message);
    }
}
