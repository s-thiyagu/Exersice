package atm;

import atm.excep.DetailsNotMatch;

import java.util.ArrayList;

import static atm.CheckDetails.check;

public class DisplayCustomerDetail {
    static void display(ArrayList manage) {
        int check=check(manage);
        boolean bool= check >= 0;
        if (bool){
            System.out.println(manage.get(check));
        } else {
            try {
                throw new DetailsNotMatch("Details not Match to display the Customer Details");
            } catch (DetailsNotMatch object) {
                object.printStackTrace();
            }
        }
    }
}
