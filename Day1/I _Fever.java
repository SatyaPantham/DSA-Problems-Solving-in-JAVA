import java.util.Scanner;

class Fever {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {

            int X = sc.nextInt();
            if (X > 98) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }

}
