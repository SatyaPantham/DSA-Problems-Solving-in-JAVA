import java.util.Scanner;

public class H_CompressString {
    public static String compressString(String s) {
        StringBuilder compressed = new StringBuilder();

        int count = 1;
        for (int i = 1; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) != s.charAt(i - 1)) {
                compressed.append(s.charAt(i - 1)).append(count);
                count = 1;
            } else {
                count++;
            }
        }

        return compressed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        scanner.close();

        String compressedString = compressString(s);
        System.out.println(compressedString);
    }
}
