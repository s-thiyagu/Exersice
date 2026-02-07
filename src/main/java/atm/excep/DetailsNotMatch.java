package atm.excep;

public class DetailsNotMatch extends Throwable {
    public DetailsNotMatch() {
    }

    public DetailsNotMatch(String message) {
        super(message);
    }
}