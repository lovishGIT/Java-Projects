
import java.util.Comparator;

public class nameBased implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        // int i = 0;
        // while (i < o1.Name.length() && i < o2.Name.length()) {
        //     if (o1.Name.charAt(i) > o1.Name.charAt(i))
        //         return 1;
        //     else if (o1.Name.charAt(i) < o1.Name.charAt(i))
        //         return -1;
        //     i++;
        // }
        // return 0;
        return o1.Name.compareTo(o2.Name);
        // return (o1.Marks <= o2.Marks) ? 1 : -1;
    }
}
