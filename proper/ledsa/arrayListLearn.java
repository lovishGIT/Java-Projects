package lecollection;

import java.util.*;

public class arrayListLearn {
    public static void main(String[] args) {
        // Multi Threaded
        // JDK 1.2
        // Faster than Vector

        // ArrayList col = new ArrayList();
        // col.add(10.20);
        // col.add(true);
        // col.add(2, "lovish");
        // col.add(5, "ram"); // error:- IndexOutOFBound Exception
        // col.set(6, "hello");
        // System.out.println(col);

        ArrayList<Integer> col = new ArrayList<Integer>();
        col.add(10);
        col.add(20);
        col.add(30);
        col.add(40);
        col.add(50);

        // for (int i : col) {
        //     System.out.println(i);
        // } // No backward Possible

        // for (int i = 0; i < col.size(); i++) {
        //     System.out.println(col.get(i));
        // } // backward Possible

        // col.forEach(element -> System.out.println(element)); // arrow function

        // col.forEach(System.out::println); // lambda function

        // Backward iteration using a Consumer with a traditional for loop
        // Consumer<Integer> consumer = element -> System.out.println(element);
        // for (int i = col.size() - 1; i >= 0; i--) {
        //     consumer.accept(col.get(i));
        // }
        
    }
}
