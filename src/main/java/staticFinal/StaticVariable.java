package staticFinal;

public class StaticVariable {
    public int empId;
    public String empName;
    static  String off="Mitrah Soft";

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

      public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    void display(){
        System.out.println("Employee ID : "+empId+"\nEmployee Name : "+empName+"\nCompany : "+off);
    }

    public static void main(String[] args){
//        String name="Thiyagu";
//        String name1="Thiyagu";
        StaticVariable sc= new StaticVariable();
        sc.empId=1;
        sc.empName="Thiyagu";
        sc.display();
//        System.out.println(System.identityHashCode(name));
//        System.out.println(System.identityHashCode(name1));
    }
}
