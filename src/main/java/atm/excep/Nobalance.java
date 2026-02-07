package atm.excep;

public class Nobalance extends RuntimeException {
    @Override
    public String getMessage() {
        return "Insufficient Balance";
    }
    public Nobalance( ) {
        super();

    }

}
