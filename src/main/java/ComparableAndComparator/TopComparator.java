package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TopComparator {
    int id;
    String Name;
    int salary;

    public TopComparator(int id, String name, int salary) {
        this.id = id;
        Name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "TopComparator{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", salary=" + salary +
                '}';
    }

    static void main() {
        ArrayList<TopComparator> arr = new ArrayList<>();
        arr.add(new TopComparator(58, "Thiyagu", 10000));
        arr.add(new TopComparator(69, "Shalini", 20000));
        arr.add(new TopComparator(43, "Selva"  , 30000));
        arr.add(new TopComparator(72, "vijay"  , 40000));
        arr.add(new TopComparator(43, "Adtiya" , 50000));
        arr.add(new TopComparator(38, "Deepak" , 50000));
        Comparator comp_ref=new SortById();
        Collections.sort(arr,comp_ref);
        for (TopComparator mitrah : arr) {
            System.out.println(mitrah);
        }
        Comparator ref=new SortByName();
        Collections.sort(arr,ref);
        System.out.println();
        System.out.println("Sort By Name");
        for (TopComparator mitrah : arr) {

            System.out.println(mitrah);
        }

    }
}
class SortById implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        TopComparator comp1=(TopComparator) o1;
        TopComparator comp2=(TopComparator) o2;
        if(comp1.id < comp2.id){
            return -1;
        }
        return 0;
    }
}
class SortByName implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return ((TopComparator) o1).Name.compareTo(((TopComparator) o2).Name);
    }
}


