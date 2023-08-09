import java.util.Scanner;

class ColumnSum {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int column = sc.nextInt();

        int arr[][] = new int[rows][column];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();

            }

        }
        for (int i = 0; i < column; i++) {
            int sum = 0;
            for (int j = 0; j < rows; j++) {
                sum = sum + arr[j][i];

            }
            System.out.println(sum);
        }

    }

}