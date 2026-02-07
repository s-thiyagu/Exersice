package userInputs;

import java.util.ArrayList;
import java.util.List;

class MyClass {
    int value;

    // Constructor
    MyClass(int v) {
        this.value = v;
    }
}

public class ObjectCreator {
    public static void main(String[] args) {
        // 1. Create a list to hold the objects
        List<MyClass> objectList = new ArrayList<>();

        // 2. Loop to create multiple objects
        for (int i = 0; i < 5; i++) {
            // 3. Instantiate a NEW object in each iteration
            MyClass newObject = new MyClass(i);

            // 4. Add the unique object reference to the list
            objectList.add(newObject);
        }

        // 5. Accessing the created objects later
        for (MyClass obj : objectList) {
            System.out.println("Object value: " + obj.value);
        }
    }
}