// package lecollection;

import java.util.*;

public class comparableDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (a % 10 >= b % 10) return 1;
                else return -1;
            }
        };
        arr.add(10);
        arr.add(5);
        arr.add(2);
        arr.add(0);
        arr.add(11);
        // System.out.println(arr);
        // Collections.sort(arr);
        Collections.sort(arr, comp);
        System.out.println(arr);
    }
}
