package Task_7.exception;

public class UserNotFoundException extends RuntimeException{
    //непроверяемое
    //проверяемое наследуюется от Exception

    public UserNotFoundException(String message) {
        super(message);
    }
}
