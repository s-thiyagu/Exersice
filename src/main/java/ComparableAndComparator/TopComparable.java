package ComparableAndComparator;

import java.util.*;

public class TopComparable implements Comparable {
    int id;
    String Name;
    int salary;

    public TopComparable(int id, String name, int salary) {
        this.id = id;
        Name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "TopComparable{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public TopComparable() {
    }

    public int compareTo(Object obj) {
        TopComparable com = (TopComparable) obj;
        if (salary < com.salary) {
            return -1;
        }
        return 0;
    }
    static void main(String[] args) {
        ArrayList<TopComparable> arr = new ArrayList<>();
        arr.add(new TopComparable(58, "Thiyagu", 10000));
        arr.add(new TopComparable(69, "Shalini", 20000));
        arr.add(new TopComparable(43, "Selva"  , 30000));
        arr.add(new TopComparable(72, "vijay"  , 40000));
        arr.add(new TopComparable(43, "Adtiya" , 50000));
        arr.add(new TopComparable(38, "Deepak" , 50000));
        Collections.sort(arr);
        for (TopComparable mitrah : arr) {
            System.out.println(mitrah);
        }
    }
}
