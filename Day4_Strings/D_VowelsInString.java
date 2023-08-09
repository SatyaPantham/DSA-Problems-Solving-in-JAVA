import java.util.Scanner;

public class D_VowelsInString {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = str.toLowerCase();

        char ch;
        boolean flag = false;

        for (int i = 0; i < str1.length(); i++) {
            ch = str1.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
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