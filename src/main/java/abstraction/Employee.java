package abstraction;

public class Employee {
    public static void main() {
        Manage emp1 = new Manage();
        emp1.setEmpDetails("Thiyagu S", 1, 21);
        Manage emp2 = new Manage();
        emp2.setEmpDetails("Selva Kumar S", 2, 24);
        emp2.getEmpDetails();
        emp1.getEmpDetails();
    }
}
