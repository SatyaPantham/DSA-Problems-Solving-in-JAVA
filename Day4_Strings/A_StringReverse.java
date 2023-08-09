import java.util.Scanner;

public class A_StringReverse {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String Reverse = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            Reverse = ch + Reverse;
        }

        System.out.println(Reverse);

    }
}