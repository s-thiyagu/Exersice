package topExceptions.excep;

public class DiscountNotAvailable extends Throwable {
    public DiscountNotAvailable() {
    }

    @Override
    public String getMessage() {
        return "Discount Not Available";
    }

    public DiscountNotAvailable(String message) {
        super(message);

    }
}
