package array2d;

public class rotateImage {
    public static void Transpose(int arr[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void ReverseRows(int arr[][], int n) {
        for (int i = 0; i < n; i++) {
            int st = 0;
            int ed = n - 1;
            while (st<ed) {
                int temp = arr[i][st];
                arr[i][st] = arr[i][ed];
                arr[i][ed] = temp;
                st++;
                ed--;
            }
        }
    }
    public static void main(String[] args) {
        final int n = 4;
        final int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };

        Transpose(arr, n);
        ReverseRows(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int j = 0; j < n - 1; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.println(arr[i][n - 1] + "]");
        }
    }
}
