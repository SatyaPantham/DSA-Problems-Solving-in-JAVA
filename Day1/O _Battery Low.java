import java.util.Scanner;

class BatteryLow {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {

            int X = sc.nextInt();

            if (X > 15) {
                System.out.println("NO");

            } else {
                System.out.println("Yes");
            }

        }

    }

}
