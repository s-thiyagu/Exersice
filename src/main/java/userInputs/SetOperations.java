package userInputs;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static atm.Validation.validationName;
import static atm.Validation.validationNumber;
import static java.lang.Integer.parseInt;

class SetOperations {
    static void main(String[] args) {
        List<String> classA=new ArrayList<>();
        List<String> classB=new ArrayList<>();
        List<String> union=new ArrayList<>();
        List <String>cpyClassA=new ArrayList<>();
        List <String>cpyClassB=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String classACount="";
        String classBCount ="";
        boolean vaild=false;
        while(!vaild) {
            System.out.println("Enter class A Total Students");
            classACount = sc.nextLine();
            vaild=validationNumber(classACount);
        }
        vaild=false;
        while(!vaild) {
            System.out.println("Enter class B Total Students");
            classBCount = sc.nextLine();
            vaild=validationNumber(classBCount);
        }

        System.out.println("Enter the Students Name of Class A");
        for(int i=0;i<parseInt(classACount);i++){
            vaild=false;
            String name="";
            while (!vaild){
                name= sc.nextLine().trim();
                name=name.replaceAll("\\s+"," ");
                vaild=validationName(name);
            }
            classA.add(name);
        }

        System.out.println("Enter the Students Name of Class B");

        for(int i=0;i<parseInt(classBCount);i++){
            vaild=false;
            String name="";
            while (!vaild){
                name= sc.nextLine().trim();
                name=name.replaceAll("\\s+"," ");
                vaild=validationName(name);
            }
            classB.add(name);
        }

        String choice="0";
        while(parseInt(choice)<=5){
            System.out.println("1.union");
            System.out.println("2.Intersection");
            System.out.println("3.difference");
            System.out.println("4.SubString");
            System.out.println("5.Exit");
            System.out.println("6. Display");
            System.out.println("enter the number");
            choice = sc.next();
            validationNumber(choice);
            switch (parseInt(choice)) {
                case 1:
                    cpyClassA.clear();
                    cpyClassB.clear();
                    cpyClassA.addAll(classA);
                    cpyClassB.addAll(classB);
                    union(cpyClassA,cpyClassB);
                    break;
                case 2:
                    cpyClassA.clear();
                    cpyClassB.clear();
                    cpyClassA.addAll(classA);
                    cpyClassB.addAll(classB);
                    intersection(cpyClassA,cpyClassB);
                    break;
                case 3:
                    cpyClassA.clear();
                    cpyClassB.clear();
                    cpyClassA.addAll(classA);
                    cpyClassB.addAll(classB);
                    difference(cpyClassA,cpyClassB);
                    break;
                case 4:
                    cpyClassA.clear();
                    cpyClassB.clear();
                    cpyClassA.addAll(classA);
                    cpyClassB.addAll(classB);
                    subString(cpyClassA,cpyClassB);
                    break;
                case 5:
                    choice="6";
                    break;
                case 6:
                    System.out.println(classA);
                    System.out.println(classB);
            }
        }
    }

    static void difference(List<String> cpyClassA, List<String> cpyClassB) {
        ArrayList<String> sample=new ArrayList<>();
        sample.addAll(cpyClassB);
        System.out.println("classA = " + cpyClassA);
        System.out.println("classB = " + cpyClassB);
        sample.retainAll(cpyClassA);
        cpyClassA.removeAll(sample);
        cpyClassB.removeAll(sample);
        cpyClassA.addAll(cpyClassB);
        System.out.println("difference");
        System.out.println(cpyClassA);
    }

    static void subString(List<String> cpyClassA, List<String> cpyClassB) {
        System.out.println("classA = " + cpyClassA);
        System.out.println("classB = " + cpyClassB);
        if(cpyClassA.containsAll(cpyClassB)&&cpyClassB.containsAll(cpyClassA)){
            System.out.println("Both has Same Students");
        }
        else if(cpyClassA.containsAll(cpyClassB)){
            System.out.println("A has the all the students in class B");
        }
        else if(cpyClassB.containsAll(cpyClassA)){
            System.out.println("B has the all the students in class A");
        }
        else{
            System.out.println("no SubString");
        }
    }

    static void intersection(List<String> cpyClassA, List<String> cpyClassB) {
        System.out.println("classA = " + cpyClassA);
        System.out.println("classB = " + cpyClassB);
        cpyClassB.retainAll(cpyClassA);
        System.out.println("Intersection ");
        System.out.println(cpyClassB);
    }

    static void union(List<String> cpyClassA, List<String> cpyClassB) {
        System.out.println("classA = " + cpyClassA);
        System.out.println("classB = " + cpyClassB);
        cpyClassA.addAll(cpyClassB);
        System.out.println("Union");
        System.out.println(cpyClassA);
    }

}
