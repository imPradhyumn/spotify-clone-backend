package com.spotifyclone.error;

public class UserAlreadyRegisteredException extends Exception {
    public UserAlreadyRegisteredException() {
        super();
    }

    public UserAlreadyRegisteredException(String message) {
        super(message);
    }

    public UserAlreadyRegisteredException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserAlreadyRegisteredException(Throwable cause) {
        super(cause);
    }

    protected UserAlreadyRegisteredException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
