import java.util.*;

public class C_Anagram_Hashmap {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {

            String str1 = sc.next().toLowerCase();
            String str2 = sc.next().toLowerCase();

            if (str1.length() != str2.length()) {
                System.out.println("False");
                continue;
            }

            HashMap<Character, Integer> charCount = new HashMap<>();
            for (int j = 0; j < str1.length(); j++) {
                char ch = str1.charAt(j);
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }

            boolean flag = true;
            for (int j = 0; j < str2.length(); j++) {
                char ch = str2.charAt(j);
                if (!charCount.containsKey(ch) || charCount.get(ch) <= 0) {
                    flag = false;
                    break;
                }
                charCount.put(ch, charCount.get(ch) - 1);
            }

            if (flag) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
