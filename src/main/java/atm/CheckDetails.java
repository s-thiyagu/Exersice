
package atm;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckDetails {
    static int check(ArrayList manage) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Full Name with Initial Letter or Account number");
        System.out.println();
        System.out.println("Enter Your Full Name with Initial Letter");
        String customerName = sc.nextLine().trim();
        if(Validation.validationName(customerName)) {
            System.out.println("Enter Your Account Number");
            String accNum = sc.nextLine().trim();
            if (Validation.validationAccountNo(accNum)) {
                for (int i = 0; i < manage.size(); i++) {
                    CustomerDetails client = (CustomerDetails) manage.get(i);
                    String cusName = client.getCustomerName();
                    String cusAccNo = client.getAccountNo();
                    if (accNum.equals(cusAccNo) || customerName.equals(cusName)) {
                        System.out.println(cusName);
                        return i;
                    }
                }
            }
        }
        return -1;
    }
    static void delay() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}