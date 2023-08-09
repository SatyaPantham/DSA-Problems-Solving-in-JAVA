import java.util.Scanner;

public class F_Linearsearch {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];
        int t = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                t = i;
                break;
            }
        }
        System.out.println(t);

    }
}
