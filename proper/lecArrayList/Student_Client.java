
import java.util.*;

public class Student_Client {
    public static void main(String[] args) {
        ArrayList<Students> stll = new ArrayList<>();
        stll.add(new Students("lovish", 1, 1000));
        stll.add(new Students("lisha", 2, 990));
        stll.add(new Students("janvi", 3, 910));
        stll.add(new Students("kush", 4, 950));
        stll.add(new Students("keshav", 5, 900));
        stll.add(new Students("lavish", 6, 900));

        System.out.println(stll);
        ArrayList<Students> newSTll = new ArrayList<>(stll);
        // Collections.sort(newSTll); // Comparable
        // Collections.sort(newSTll, new nameBased()); // Comparator
        Collections.sort(newSTll, Students.newComparator); // Comparator
        System.out.println(newSTll);
    }
}
