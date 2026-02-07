package atm;

import atm.excep.DetailsNotMatch;

import java.util.ArrayList;

import static atm.CheckDetails.check;

public class DisplayBalance {
    static void displayBalance(ArrayList manage) {
        int check=check(manage);
        boolean bool= check >= 0;
        if (bool){
            CustomerDetails balance= (CustomerDetails) manage.get(check);
            System.out.println("Customer Name = "+balance.getCustomerName()+"\nBalance = "+balance.getBalance());
        } else {
            try {
                throw new DetailsNotMatch("Details not Match to Get the Balance");
            } catch (DetailsNotMatch object) {
                object.printStackTrace();
            }
        }
    }
}
