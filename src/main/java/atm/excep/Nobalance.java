package atm.excep;

public class Nobalance extends Exception {
    @Override
    public String getMessage() {
        return "Insufficient Balance";
    }
    public Nobalance( ) {
        super();

    }

}
