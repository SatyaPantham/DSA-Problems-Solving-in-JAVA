import java.util.Scanner;

public class Q_LoveStory {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {

            String s = "codeforces";
            String s1 = sc.next();
            int count = 0;

            for (int j = 0; j < s1.length(); j++) {

                if (s1.charAt(j) != s.charAt(j)) {
                    count = count + 1;
                }

            }

            System.out.println(count);
        }

    }
}
