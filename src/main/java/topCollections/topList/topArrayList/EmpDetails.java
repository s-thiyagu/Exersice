package topCollections.topList.topArrayList;

import java.util.ArrayList;

public class EmpDetails{
    private String name;
    private int id;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public EmpDetails( String name,int id, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public EmpDetails() {
    }

    @Override
    public String toString() {
        return "EmpDetails \n" +
                "name= " + name + "\n" +
                "id= " + id + "\n" +
                "salary= " + salary+"\n";
    }

    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<EmpDetails> details = new ArrayList<EmpDetails>();
//
//        //creation
//        for (int i = 0; i < 2; i++) {
//            EmpDetails emp = new EmpDetails();
//            System.out.println("Enter Name");
//            String name = sc.next();
//            System.out.println("Enter ID");
//            int id = sc.nextInt();
//            System.out.println("Enter Salary");
//            int salary = sc.nextInt();
//            emp.setName(name);
//            emp.setId(id);
//            emp.setSalary(salary);
//            details.add(emp);
//        }
//        for (EmpDetails e : details) {
//            System.out.println(e);
//        }

        //add, addAll,
        ArrayList<Integer> no = new ArrayList<Integer>(10);
        ArrayList<Integer> no1= new ArrayList<Integer>(10);
        for(int i=0;i<5;i++){
            no.add(i);
        }
        no1.add(6);
        no1.add(7);
        no1.add(8);
        no1.add(9);
        no.addAll(no1);
        System.out.println(no);
        System.out.println(no1);

        //clear
        no1.clear();
        System.out.println(no1);

        //clone
        no1=(ArrayList<Integer>)no.clone();
        System.out.println(no1);

        //contains
        if(no1.contains(1)){
            System.out.println("hi");
        }

        //get() indexOf()
        System.out.println(no.get(1));
        System.out.println(no.indexOf(6));

        // removeAll()
        System.out.println(no1.remove(6));
        System.out.println(no1);
        System.out.println(no.removeAll(no1));
        System.out.println(no);
        System.out.println(no1);

        //

    }
}



