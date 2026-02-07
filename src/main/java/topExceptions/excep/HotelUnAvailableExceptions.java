package topExceptions.excep;

public class HotelUnAvailableExceptions extends RuntimeException {
    public HotelUnAvailableExceptions(String message) {
        super(message);
    }
    public HotelUnAvailableExceptions() {
        super();
    }

    @Override
    public String getMessage() {
        return "Hotel Closed";
    }
}
