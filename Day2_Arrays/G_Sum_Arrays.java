import java.util.Scanner;

public class G_Sum_Arrays {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {

            int n = sc.nextInt();
            long arr[] = new long[n];
            long sum = 0;

            for (int j = 0; j < n; j++) {

                arr[j] = sc.nextLong();
                sum = sum + arr[j];
            }

            System.out.println(sum);

        }

    }

}
