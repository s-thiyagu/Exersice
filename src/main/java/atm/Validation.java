package atm;

import atm.excep.DetailsNotMatch;

public class Validation {
    public static boolean validationName(String cusName) {
        if(cusName.isEmpty()){
            try {
                throw new DetailsNotMatch("Name Should not be Empty");
            } catch (DetailsNotMatch object) {
                object.printStackTrace();
            }
            return false;
        }
        else if (!cusName.matches("[a-zA-Z_ ]+")) {
            try {
                throw new DetailsNotMatch("Name Should be in Letters Only");
            } catch (DetailsNotMatch object) {
                object.printStackTrace();
            }
            return false;
        }
        return true;
    }

    public static boolean validationAccountNo(String cusAccNo) {
        if(cusAccNo.isEmpty()){
            try {
                throw new DetailsNotMatch("Account Number Should not be Empty");
            } catch (DetailsNotMatch object) {
                object.printStackTrace();
            }
            return false;
        }
        else if (!cusAccNo.matches("[0-9 ]+")) {
            try {
                throw new DetailsNotMatch("Account Number Should be in Numbers Only");

            } catch (DetailsNotMatch object) {
                object.printStackTrace();
            }
            return false;
        }
        cusAccNo = cusAccNo.replaceAll(" ", "");
        if(cusAccNo.length() == 10) {
            return true;
        }
        else {
            try {
                throw new DetailsNotMatch("Enter 10 digit Number for Account Number ");

            } catch (DetailsNotMatch object) {
                object.printStackTrace();
            }
            return false;
        }
    }

    public static boolean validationIFSC(String cusIFSC) {
        if (!cusIFSC.matches("[0-9a-zA-Z ]+")) {
            try {
                throw new DetailsNotMatch("IFSc Should be in Alpha Numeric Only");

            } catch (DetailsNotMatch object) {
                object.printStackTrace();
            }
            return false;
        }
        cusIFSC = cusIFSC.replaceAll(" ", "");
        System.out.println("cusIFSC = " + cusIFSC);
        String ifscRegex = "^[A-Z]{4}0[A-Z0-9]{6}$";
        if (cusIFSC.matches(ifscRegex)){
                return true;
        } else {
            try {
                throw new DetailsNotMatch("Enter 11 Alpha Numeric for IFSC Code (First Four is letter next is 0 and 6 are numeric)");

            } catch (DetailsNotMatch object) {
                object.printStackTrace();
            }
            return false;
        }
    }
    public static boolean validationNumber(String cusAccNo) {
        if(cusAccNo.isEmpty()){
            try {
                throw new DetailsNotMatch("Number Should not be Empty");
            } catch (DetailsNotMatch object) {
                object.printStackTrace();
            }
            return false;
        }
        else if (!cusAccNo.matches("[0-9 ]+")) {
            try {
                throw new DetailsNotMatch("Account Number Should be in Numbers Only");

            } catch (DetailsNotMatch object) {
                object.printStackTrace();
            }
            return false;
        }
        cusAccNo = cusAccNo.replaceAll(" ", "");
        if(cusAccNo.length() == 1) {
            return true;
        }
        else {
            try {
                throw new DetailsNotMatch("Enter 1 digit Number ");

            } catch (DetailsNotMatch object) {
                object.printStackTrace();
            }
            return false;
        }
    }

}
