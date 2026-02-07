package abstraction;

import java.util.Objects;

class Manage implements Bank {
    private String BranchName;
    private String BankName;
    private String CusName;
    private String CusPhone;
    private int EmpId;
    private String EmpName;
    private int CusAge;
    private int EmpAge;
    private int Balance;
    @Override
    public void setBankDetails(String BranchName, String BankName) {
        this.BranchName = BranchName;
        this.BankName = BankName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manage manage = (Manage) o;
        return CusAge == manage.CusAge && EmpAge == manage.EmpAge;
    }

    @Override
    public String toString() {
        return "Manage{" +
                "BranchName='" + BranchName + '\'' +
                ", BankName='" + BankName + '\'' +
                ", CusName='" + CusName + '\'' +
                ", CusPhone='" + CusPhone + '\'' +
                ", EmpId=" + EmpId +
                ", EmpName='" + EmpName + '\'' +
                ", CusAge=" + CusAge +
                ", EmpAge=" + EmpAge +
                ", Balance=" + Balance +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(CusAge, EmpAge);
    }

    @Override
    public void setCustomerDetails(String CusName, String CusPhone, int Age) {
        this.CusName = CusName;
        this.CusPhone = CusPhone;
        this.CusAge = Age;
    }

    @Override
    public void setEmpDetails(String EmpName, int EmpId, int Age) {
        this.EmpName = EmpName;
        this.EmpId = EmpId;
        this.EmpAge = Age;
    }

    @Override
    public void setAuditDetails(int Balance) {
        this.Balance=Balance;
    }

    @Override
    public void getBankDetails() {
        System.out.println("Bank Name = "+BankName+"\nBranch Name = "+BranchName+"\n");
    }

    @Override
    public void getCustomerDetails() {
        System.out.println("Customer Name = "+CusName+"\nCustomer Phone Number = "+CusPhone+" \nCustomer Age = "+CusAge+"\n");
    }

    @Override
    public void getEmpDetails() {
        System.out.println("Employee Name = "+EmpName+"\nEmployee ID = "+EmpId+" \nEmployee Age = "+EmpAge+"\n");
    }

    @Override
    public void getAuditDetails() {
        System.out.println("Account Balance = "+Balance+"\n");
    }

    public static void main() {

    }
}