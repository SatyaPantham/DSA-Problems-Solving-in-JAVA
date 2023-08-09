import java.util.Scanner;

public class E_SparseMatrix {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;

        long arr[][] = new long[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    count = count + 1;
                }
            }

        }

        if (count > (m * n / 2)) {

            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
    }
}