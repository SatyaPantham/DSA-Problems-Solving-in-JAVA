import java.util.Scanner;

public class P_WayTooLongWords {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {

            String str = sc.next();

            if (str.length() > 10) {
                String str1 = str.charAt(0) + Integer.toString(str.length() - 2) + str.charAt(str.length() - 1);
                System.out.println(str1);
            } else {
                System.out.println(str);

            }

        }

    }

}
