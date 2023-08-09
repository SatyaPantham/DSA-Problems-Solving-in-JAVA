import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Reverse(arr, n - 1);
    }

    private static void Reverse(long[] arr, int index) {
        if (index < 0) {
            return;
        }

        System.out.print(arr[index] + " ");
        Reverse(arr, index - 1);
    }
}
