import java.util.Scanner;

public class C_SumOfTwoMatrices {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int i, j, k;

        int arr[][] = new int[m][n];

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                k = sc.nextInt();
                arr[i][j] = arr[i][j] + k;
            }

        }

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }
}
