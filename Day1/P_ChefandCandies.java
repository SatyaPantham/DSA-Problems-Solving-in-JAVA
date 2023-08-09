import java.util.Scanner;

public class P_ChefandCandies {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int t, y, p;

        for (int i = 0; i < T; i++) {

            int N = sc.nextInt();
            int X = sc.nextInt();

            if (N > X) {

                t = (N - X);

                if (t > 4) {

                    if (t % 4 == 0) {

                        p = t / 4;
                    } else {

                        p = t % 4;
                    }

                    System.out.println(p);

                } else if (t <= 4) {
                    y = 1;
                    System.out.println(y);
                }

            } else {
                y = 0;
                System.out.println(y);
            }

        }
    }
}
