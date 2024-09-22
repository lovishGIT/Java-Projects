import java.util.Arrays;
import java.util.Scanner;

public class Sorting_1 {
    public static int[] selectionSort(int arr[]) {
        int min;
        for(int i=0; i<arr.length-1; i++) { // arr.length-1 because when last person is left, its already sorted.
            min= i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[min] > arr[j]) {
                    min= j;
                }
            }
            int temp= arr[i];
            arr[i]= arr[min];
            arr[min]= temp;
        }
        return arr;
    }
    public static int[] revSelectionSort(int arr[]) {
        int max;
        int n= arr.length;
        for(int i=0; i<n-1; i++) { // n-1 because when first person is left, its already sorted.
            max= n-1-i;
            for(int j=0; j<n-i; j++) { 
                if(arr[max] < arr[j]) {
                    max= j;
                }
            }
            int temp= arr[n-1-i];
            arr[n-1-i]= arr[max];
            arr[max]= temp;
        }
        return arr;
    }
    public static int[] bubbleSort(int arr[]) {
        boolean swapped;
        for(int i=0; i<arr.length-1; i++) { // arr.length-1 because when last person is left, its already sorted.
            swapped= false;
            for(int j=1; j<arr.length-i; j++) {
                if(arr[j-1] > arr[j]) {
                    int temp= arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j]= temp;
                    swapped= true;
                }
            }
            if (!swapped) break; //For earlier sorted array.
        }
        return arr;
    }
    public static int[] insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int temp= arr[i];
            int j= i;
            while(j>0 && temp < arr[j-1]) {
                arr[j]= arr[j-1];
                j--;
            }
            arr[j]= temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++) {
            arr[i]= sc.nextInt();
        }
        // System.out.println(Arrays.toString(selectionSort(arr)));
        // System.out.println(Arrays.toString(revSelectionSort(arr)));
        // System.out.println(Arrays.toString(bubbleSort(arr)));
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
// Binary Search also know as SINKING SORT / EXCHANGE SORT