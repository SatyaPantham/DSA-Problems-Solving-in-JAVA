import java.util.Scanner;

public class G_ToggleCase {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
                str1 = str1 + ch;

            } else {
                ch = Character.toLowerCase(ch);
                str1 = str1 + ch;
            }
        }
        System.out.println(str1);
    }
}
