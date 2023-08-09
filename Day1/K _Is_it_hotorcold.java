import java.util.Scanner;

class hotorcold {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {

            int C = sc.nextInt();

            if (C > 20) {
                System.out.println("HOT");
            } else {
                System.out.println("COLD");
            }
        }

    }

}
