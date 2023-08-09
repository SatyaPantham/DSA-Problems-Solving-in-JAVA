import java.util.Scanner;

public class C_CharacterOccurrence {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String sent = sc.nextLine();
        char ch = sc.next().charAt(0);
        char c;
        int count = 0;

        for (int i = 0; i < sent.length(); i++) {
            c = sent.charAt(i);
            if (c == ch) {
                count = count + 1;
            }
        }
        System.out.println(count);

    }

}
