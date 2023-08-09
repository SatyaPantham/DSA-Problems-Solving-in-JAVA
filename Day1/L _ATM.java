import java.util.Scanner;

class ATM {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        float X = sc.nextInt();
        float Y = sc.nextInt();

        if (X > Y) {

            Y = Y;
        } else if (Y >= X) {

            Y = Y - X;
        }

        System.out.printf("%.2f", Y);

    }

}
