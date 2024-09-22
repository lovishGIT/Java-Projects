package array2d;
//     public static int[] operation(int n, int m, char opr, char var, int i, int j, int x) {
//         if (var == 'i') {
//         } else {
//             j = (opr == '+') ? j + 1 : j - 1;
//         }

//         if (j == m) {
//             opr = '+';
//             var = 'i';
//             i = i + 1;
//             j = m - 1;
//         } else if (i == n) {
//             opr = '-';
//             var = 'j';
//             i = n - 1;
//             j = j - 1;
//         } else if (i == -1) {
//             opr = '+';
//             var = 'j';
//             i = 0;
//             j = j + 1;
//         } else if (j == -1) {
//             opr = '-';
//             var = 'i';
//             i = i - 1;
//             j = 0;
//         }
//         return new int[]{opr, var, i, j};
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // int n= sc.nextInt();
//         // int m= sc.nextInt();
//         // int arr[][] = new int[n][m];
//         // for(int i=0; i<n; i++) {
//         //     for(int j=0; j<n; j++) {
//         //         arr[i][j] = sc.nextInt();
//         //     }
//         // }
//         final int n = 4;
//         final int m = 4;
//         final int arr[][] = {
//                 {1, 2, 3, 4},
//                 {5, 6, 7, 8},
//                 {9, 10, 11, 12},
//                 {13, 14, 15, 16},
//         };
//         int i = 0;
//         int j = 0;
//         int x = 0;
//         char opr = '+';
//         char var = 'j';
//         while (x < n * m) {
//             System.out.println(arr[i][j]);
//             x++;
//             int[] result = operation(n, m, opr, var, i, j, x);
//             opr = (char) result[0];
//             var = (char) result[1];
//             i = result[2];
//             j = result[3];
//         }
//     }
// }

// TODO

public class spiralPrint {
    public static void up(int arr[][], int i, int j, int x) {
        if (x == arr.length / 2 - 1) { // -1 because we r increasing x here.
            return;
        }
        if (i < x+1) {
            // System.out.println("here");
            x++;
            i++;
            j++;
            right(arr, i, j, x);
            return;
        }
        System.out.println("up " + arr[i][j]);
        i--;
        up(arr, i, j, x);
    }

    public static void left(int arr[][], int i, int j, int x) {
        if (x >= arr.length / 2) {
            return;
        }
        if (j < x) {
            j++;
            i--;
            up(arr, i, j, x);
            return;
        }
        System.out.println("left " + arr[i][j]);
        j--;
        left(arr, i, j, x);
    }

    public static void down(int arr[][], int i, int j, int x) {
        if (x >= arr.length / 2) {
            return;
        }
        if (i >= arr.length-x) {
            j--;
            i--;
            left(arr, i, j, x);
            return;
        }
        System.out.println("down " + arr[i][j]);
        i++;
        down(arr, i, j, x);
    }

    public static void right(int arr[][], int i, int j, int x) {
        if (x >= arr.length - 1) {
            return;
        }
        if (j >= arr[0].length-x) {
            j--;
            i++;
            down(arr, i, j, x);
            return;
        }
        System.out.println("right " + arr[i][j]);
        j++;
        right(arr, i, j, x);
    }
    public static void main(String[] args) {
        final int n = 4;
        final int m = 4;
        final int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
        };
        right(arr, 0, 0, 0);
    }
}