package topExceptions.excep;

public class OrdernotAvailableException extends RuntimeException {
    public OrdernotAvailableException(String message) {
        super(message);
    }
    public OrdernotAvailableException() {
    }
    public String getMessage(){
        return "Order Not Available ";
    };
}
