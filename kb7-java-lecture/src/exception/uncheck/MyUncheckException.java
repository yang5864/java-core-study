package exception.uncheck;

import java.io.UncheckedIOException;

public class MyUncheckException extends RuntimeException {
    public MyUncheckException(String message) {
        super(message);
    }
}
