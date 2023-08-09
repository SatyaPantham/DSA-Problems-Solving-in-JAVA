import java.util.Scanner;

public class B_OddEvenIndex {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String odd = "";
        String even = "";
        char ch;

        for (int i = 1; i < str.length(); i = i + 2) {
            ch = str.charAt(i);
            odd = odd + ch;

        }
        for (int i = 0; i < str.length(); i = i + 2) {
            ch = str.charAt(i);
            even = even + ch;
        }
        System.out.println(odd.concat(even));
    }
}
