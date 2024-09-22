import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayListconcept {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>(5);

        System.out.println("Enter the List Elements(-1 to exit): ");
        while (true) {
            int x= sc.nextInt();
            if(x == -1) break;
            list.add(x);
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        } System.out.println();
    }
}
