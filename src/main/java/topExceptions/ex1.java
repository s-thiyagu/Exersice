package topExceptions;
import topExceptions.excep.AgeRestriction;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ex1 {
    static void main(String[] args) {

        ex1 a = new ex1();

        a.arrayIndexOutOfBoundsException();

        a.multipleCatch();

    }

    void multipleCatch() {
        try {
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
            int[] arr = new int[5];
            arr[3] = 19;
            int c = 19 / 0;
            throw new AgeRestriction();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        catch (AgeRestriction ob) {
            ob.printStackTrace();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    void arrayIndexOutOfBoundsException() {
        try {
            int[] arr = new int[5];
            arr[5] = 19;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
