import java.util.Scanner;

public class M_Discount {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int A = 100;

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {

            int x = sc.nextInt();

            int a = A - (A * x / 100);
            System.out.println(a);
        }

    }

}
