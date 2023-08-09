import java.util.Scanner;

public class K_Word_Vowels_Consonanats {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            str = str.toLowerCase();
            int wordCount = 0;
            int vowelCount = 0;
            int consonantCount = 0;

            boolean isWord = false;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (ch == ' ') {
                    isWord = false;
                    continue;
                }

                if (!isWord) {
                    isWord = true;
                    wordCount++;
                }

                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }

            System.out.println(wordCount + " " + vowelCount + " " + consonantCount);
        }

        sc.close();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
