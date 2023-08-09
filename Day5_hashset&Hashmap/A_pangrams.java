import java.util.HashSet;
import java.util.Scanner;

public class A_pangrams {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        HashSet<Character> pangram = new HashSet<Character>();

        String str = sc.nextLine();
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                pangram.add(ch);

            }
        }
        if (pangram.size() == 26) {
            System.out.println("pangram");

        } else {
            System.out.println("not pangram");
        }

    }
}