import java.util.*;

public class C_Anagram_HashSet {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {

            String str1 = sc.next().toLowerCase();
            String str2 = sc.next().toLowerCase();

            System.out.println(str1.length());
            System.out.println(str2.length());

            if (str1.length() != str2.length()) {
                System.out.println("False");
                continue;
            }

            HashSet<Character> Anagram = new HashSet<Character>();
            for (int j = 0; j < str1.length(); j++) {
                Anagram.add(str1.charAt(j));
            }

            boolean flag = true;
            for (int j = 0; j < str2.length(); j++) {
                char ch = str2.charAt(j);
                if (!Anagram.contains(ch)) {
                    flag = false;
                    break;
                }
                Anagram.remove(ch);
                System.out.println(Anagram);
            }

            if (flag == true) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
