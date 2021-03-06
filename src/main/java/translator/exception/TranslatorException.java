package translator.exception;

@SuppressWarnings("serial")
public class TranslatorException extends RuntimeException {
    public TranslatorException(String message) {
        super(message);
    }

    public TranslatorException(String message, Throwable cause) {
        super(message, cause);
    }
}
