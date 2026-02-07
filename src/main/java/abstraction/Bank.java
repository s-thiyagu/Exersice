package abstraction;

public interface Bank {
    abstract void setBankDetails(String BranchName,String BankName);
    abstract void setCustomerDetails(String CusName, String CusPhone, int Age);
    abstract void setEmpDetails(String EmpName, int EmpID, int Age);
    abstract void setAuditDetails(int Balance);
    abstract void getBankDetails();
    abstract void getCustomerDetails();
    abstract void getEmpDetails();
    abstract void getAuditDetails();
}