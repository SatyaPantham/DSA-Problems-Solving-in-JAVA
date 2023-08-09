import java.util.Scanner;

class MatrixRowSum {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int column = sc.nextInt();

        int arr[][] = new int[rows][column];

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();

                sum = sum + arr[i][j];

            }
            System.out.println(sum);

        }

    }

}