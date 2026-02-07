package topExceptions.excep;

public class AgeRestriction extends Exception {
    public AgeRestriction(String text) {
        super(text);
    }

    public AgeRestriction() {
    }

    @Override
    public String getMessage() {
        return "Help";
    }
}