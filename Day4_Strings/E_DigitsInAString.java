import java.util.Scanner;

public class E_DigitsInAString {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch;
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);

            if (ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8'
                    || ch == '9' || ch == '0') {
                flag = true;

            } else {
                flag = false;
                break;
            }

        }
        if (flag == true) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }

    }

}
