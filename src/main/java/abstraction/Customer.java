package abstraction;

public class Customer {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String args[]) {

        Manage cus1 = new Manage();
        Manage cus2 = new Manage();
        cus1.setCustomerDetails("Thiyagu S", "9842076029", 9);
        cus1.setAuditDetails(3332);
        cus1.setBankDetails("Kalavasal","SBI");

        cus2.setCustomerDetails("Vijay R", "9876543219", 34);
        cus2.setAuditDetails(53332);
        cus2.setBankDetails("Gurutheater","SBI");

        cus1.getCustomerDetails();
        cus1.getBankDetails();
        cus1.getAuditDetails();

        cus2.getCustomerDetails();
        cus2.getBankDetails();
        cus2.getAuditDetails();
        cus2.setEmpDetails("helo",4,30);

        Manage cus3 = new Manage();
        cus3.setCustomerDetails("Vijay R", "9876543219", 34);
        cus3.setAuditDetails(53332);
        cus3.setBankDetails("Gurutheater","SBI");
        cus3.setEmpDetails("heloo",3,30);

        Manage test1= new Manage();
        Manage test2= new Manage();

        System.out.println(test1.equals(test2));
        System.out.println(cus3.equals(cus2));
        System.out.println(cus3==cus2);

        System.out.println(cus3.toString()+cus2.toString()+cus1.toString());

    }
}
