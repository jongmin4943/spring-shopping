package shopping.product.exception;

public class InvalidProductException extends RuntimeException {
    public InvalidProductException(final String message) {
        super(message);
    }
}
