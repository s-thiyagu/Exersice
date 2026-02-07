package atm;

public class CustomerDetails {
    private String customerName;
    private String accountNo;
    private String ifscCode;
    private int balance;
    private static int count=0;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public CustomerDetails() {

    }

    public CustomerDetails(String customerName, int balance, String ifscCode, String accountNo) {
        this.customerName = customerName;
        this.balance = balance;
        this.ifscCode = ifscCode;
        this.accountNo = accountNo;
    }


    @Override
    public String toString() {
        return "CustomerDetails \n" +
                " Customer Name = " + customerName + "\n" +
                " Account No = " + accountNo + "\n" +
                " IFSC Code = " + ifscCode + "\n" +
                " Balance = " + balance+ "\n";
    }
}
