import java.util.Scanner;

public class Searching {
    static void linearSearch(int[] arr, int target) {
        for (int i= 0; i< arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("Found at "+ i);
                return;
            }
        }
        System.out.println("Not Found");
    }
    static void binarySearch(int[] arr, int target) {
        int start= 0;
        int end= arr.length;
        int mid;
        while(start < end) {
            mid= (start + end) / 2;
            if(arr[mid] < target) {
                start= mid+1;
            } else if(arr[mid] > target) {
                end= mid-1;
            } else {
                System.out.println("Found at "+ mid);
                return;
            }
        }
        System.out.println("Not Found");
    }
    static void stringSearch(String str, char target) {
        for (int i=0; i<str.length(); i++) {
            if(str.charAt(i) == target) {
                System.out.println("Found at "+ i);
                return;
            }
        }
        System.out.println("Not Found");
    }
    static int ceilingNumber(int[] arr, int target) {
        int start= 0;
        int end= arr.length;
        while(start < end) {
            int mid= (start+end)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) start= mid+1;
            else {
                if(mid == 0) break;
                if(arr[mid-1] < target) return mid;
                end= mid-1;
            }
        }
        return target > arr[0] ? arr.length : 0;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Array 
        System.out.print("Enter number of elements: ");
        int n= sc.nextInt();
        System.out.print("Enter " + n + " elements: ");
        int[] arr= new int[n];
        for(int i= 0; i<n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.print("What You wanna Search: ");
        int target= sc.nextInt();

        // linearSearch(arr, target);
        // binarySearch(arr, target);
        System.out.println(ceilingNumber(arr, target));

        // String
        // String str= sc.nextLine();
        // System.out.print("Target: ");
        // char target= sc.next().charAt(0);
        
        // stringSearch(str, target);
        
        
    }
}