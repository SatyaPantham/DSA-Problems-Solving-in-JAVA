import java.util.Scanner;

public class I_MatrixProduct {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {

            int m1 = sc.nextInt();
            int n1 = sc.nextInt();
            int arr1[][] = new int[m1][n1];

            int m2 = sc.nextInt();
            int n2 = sc.nextInt();
            int arr2[][] = new int[m2][n2];

            for (int j = 0; j < m1; j++) {
                for (int k = 0; k < n1; k++) {
                    arr1[i][j] = sc.nextInt();
                }

            }
            for (int j = 0; j < m2; j++) {
                for (int k = 0; k < n2; k++) {
                    arr2[i][j] = sc.nextInt();
                }

            }

            int res[][] = new int[m1][n2];

            for (int I = 0; I < res.length; I++) {
                for (int j = 0; j < res[i].length; j++) {
                    for (int k = 0; k < m1; k++) {

                        res[i][j] = arr1[i][k] * arr2[k][j];
                    }

                }
            }

            for (int I = 0; I < res.length; I++) {
                for (int j = 0; j < res[i].length; j++) {
                    System.out.println(res[i][j]);
                }

            }
            System.out.println();
        }

    }
}
