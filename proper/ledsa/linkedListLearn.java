package lecollection;

import java.util.LinkedList;

public class linkedListLearn {
    public static void main(String[] args) {
        // Non Continous Memory Allocation unline in array

        LinkedList ll = new LinkedList();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        // ll.add(2, 40); // adding new and pushing others back
        // ll.set(2, 40); // adding new and removing the existing

        System.out.println(ll);

        // isEmpty, contains, size
    }
}