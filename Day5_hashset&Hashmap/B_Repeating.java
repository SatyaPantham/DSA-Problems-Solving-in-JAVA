import java.util.HashSet;
import java.util.Scanner;

public class B_Repeating {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String str = sc.next();
            HashSet<Character> repeat = new HashSet<Character>();
            char repeating = ' ';

            for (int j = str.length() - 1; j >= 0; j--) {
                char ch = str.charAt(j);

                if (repeat.contains(ch)) {
                    repeating = ch;
                } else {
                    repeat.add(ch);
                }
            }

            if (repeating == ' ') {
                System.out.println('.');
            } else {
                System.out.println(repeating);
            }
        }
    }
}
