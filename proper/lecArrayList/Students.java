import java.util.*;


public class Students {
    String Name;
    int RollNo;
    int Marks;

    Students(String Name, int RollNo, int Marks) {
        if (Name.length() > 0)
            this.Name = Name;
        if (RollNo >= 0)
            this.RollNo = RollNo;
        if (Marks >= 0)
            this.Marks = Marks;
    }

    @Override
    public String toString() {
        return "Student " + this.Name + "( Roll Number:- " + this.RollNo + "): " + this.Marks + '\n';
    }

    // @Override
    // public int compareTo(Students o) {
    // if (this.Marks%10 >= o.Marks%10)
    //     return 1;
    // return -1;
    // }
    // @Override
    // public int compareTo(Students o) {
    //     if (this.Marks > o.Marks)
    //         return 1;
    //     return -1;
    // }

    // @Override
    // public int compareTo(Students o1, Students o2) {
    //     if (o1.Marks >= o2.Marks)
    //         return 1;
    //     int i = 0;
    //     while (i < o1.Name.length() && i < o2.Name.length()) {
    //         if (o1.Name.charAt(i) > o1.Name.charAt(i))
    //             return 1;
    //         else if (o1.Name.charAt(i) < o1.Name.charAt(i))
    //             return -1;
    //         i++;
    //     }
    //     return 0;
    // }

    public static Comparator<Students> newComparator = (Students s1, Students s2) -> s1.Name.compareTo(s2.Name);
}