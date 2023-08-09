import java.util.Scanner;

class Discount {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {

            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();

            int c = A - C;
            int d = B - D;

            if (c < d) {
                System.out.println("First");

            } else if (c > d) {
                System.out.println("Second");
            } else {
                System.out.println("Any");
            }

        }
    }

}
