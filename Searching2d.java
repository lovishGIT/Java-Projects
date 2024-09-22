import java.util.Scanner;

public class Searching2d {
    public static void linearSearch(int[][] arr, int r, int c, int target) {
        for(int i= 0; i<r; i++) {
            for(int j= 0; j<c; j++) {
                if( arr[i][j] == target ) {
                    System.out.println(target + " found at " + i + " " + j);
                    return;
                }
            }
        }
        System.out.println("not found");
    }
    public static void binaryROWCOLSearch(int[][] arr, int r, int c, int target) {
        int s= 0; int e= c-1;
        while(s>=0 && s<r && e>=0 && e<c) {
            if(arr[s][e] == target) {
                System.out.println(target + " found at " + s + " " + e);
                return;
            } else if(arr[s][e] > target) {
                e--;
            } else {
                s++;
            }
        }
        System.out.println("not found");
    }
    public static void binaryCompleteSearch(int[][] arr, int r, int c, int target) {
        int startR= 0;
        int midC = (c) / 2;
        while((r - startR) != 2 && (r - startR) != 1 && r > 0 && startR < r) {
            int midR = (startR + r) / 2;
            if(arr[midR][midC] == target) {
                System.out.println(target + " found at " + midR + " " + midC);
                return;
            } else if(arr[midR][midC] > target) {
                r = midR + 1;
                // System.out.println(startR + " " + r);
            } else {
                startR = midR;
                // System.out.println(startR + " " + r);
            }
        }
        for(int i= startR; i<r; i++) {
            int jstart= 0;
            int jend= c;
            while(jstart < c && jend > 0 && jend >= jstart) {
                // System.out.println(i + " " + jstart + "," + jend);
                midC= (jstart + jend) / 2;
                if(arr[i][midC] == target) {
                    System.out.println(target + " found at " + i + " " + midC);
                    return;
                } else if(arr[i][midC] > target) {
                    jend= midC-1;
                } else {
                    jstart= midC + 1;
                }
            }
        }
        System.out.println("not found");
    }
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // int r= sc.nextInt();
        // int c= sc.nextInt();
        // int[][] arr= new int[r][c];
        // for(int i= 0; i<r; i++) {
        //     for(int j= 0; j<c; j++) {
        //         arr[i][j]= sc.nextInt();
        //     }
        // }
        // int target= sc.nextInt();
        // linearSearch(arr, r, c, target);
        // binaryROWCOLSearch(arr, r, c, target);
        int arr[][]= {
            {}
        };
        int r= 1; int c= 0;
        int target= 0;
        binaryCompleteSearch(arr, r, c, target);
    }
}
