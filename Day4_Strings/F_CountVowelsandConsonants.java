import java.util.Scanner;

public class F_CountVowelsandConsonants {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = str.toLowerCase();

        char ch;
        int count = 0;
        int count1 = 0;

        for (int i = 0; i < str1.length(); i++) {
            ch = str1.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count = count + 1;

            } else {
                count1 = count1 + 1;
            }
        }
        System.out.println(count + " " + count1);

    }

}