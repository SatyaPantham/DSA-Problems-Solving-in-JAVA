import java.util.Scanner;

public class D_FindDuplicate {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int t;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[i]) {
                    t = arr[j];
                    System.out.println(t);
                    break;
                }

            }

        }

    }

}
