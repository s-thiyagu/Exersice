package stringProblems;

public class BankEncapsulation {
    private String branchName;
    private long ifscCode;
    private int pinCode;

    public void setAll(String branchName,long ifscCode,int pinCode){
        this.branchName=branchName;
        this.ifscCode=ifscCode;
        this.pinCode=pinCode;
    }
    public String getBranchName() {
        return branchName;
    }

    public int getPinCode() {
        return pinCode;
    }

    public long getIfscCode() {
        return ifscCode;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setIfscCode(long ifscCode) {
        this.ifscCode = ifscCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
    @Override
    public String toString() {
        return "BankEncapsulation{" +
                "branchName='" + branchName + '\'' +
                ", ifscCode=" + ifscCode +
                ", pinCode=" + pinCode +
                '}';
    }

    public static void main(String[] args) {
        BankEncapsulation sc=new BankEncapsulation();
        sc.setAll("Kochadai",1234456789,625016);
        System.out.println("sc = " + sc);

    }
}
