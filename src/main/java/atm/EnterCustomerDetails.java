package atm;

import java.util.Scanner;

public class EnterCustomerDetails {

    static void enterCustomerDetails(CustomerDetails cus) {
        customerDetail(cus);
        ifsc(cus);
        System.out.println("\n                Stored The Details Successfully               \n");
    }

    static void customerDetail(CustomerDetails cus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Full Name with Initial Letter");
        String cusName=sc.nextLine().trim();
        if(Validation.validationName(cusName)){
            cusName=cusName.replaceAll("\\s+"," ");
            cus.setCustomerName(cusName);
        }
        System.out.println("Enter Your Account Number");
        String cusAccNo=sc.nextLine().trim();
        if(Validation.validationAccountNo(cusAccNo)){
            cusAccNo = cusAccNo.replaceAll(" ", "");
            cus.setAccountNo(cusAccNo);
        }
    }

    static void ifsc(CustomerDetails cus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your IFSC Code");
        String cusIFSC=sc.nextLine();
        if(Validation.validationIFSC(cusIFSC)){
            cusIFSC = cusIFSC.replaceAll(" ", "");
            cus.setIfscCode(cusIFSC.toUpperCase());
        }
    }

}
