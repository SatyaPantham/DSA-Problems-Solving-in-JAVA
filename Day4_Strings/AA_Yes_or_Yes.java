import java.util.Scanner;

public class AA_Yes_or_Yes {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int j = 0; j < T; j++) {
                
                String str = sc.next();
            
                if (str.charAt(0) == 'y' || str.charAt(0) == 'Y') {
                    if (str.charAt(1) == 'e' || str.charAt(1) == 'E') {
                        if (str.charAt(2) == 's' || str.charAt(2) == 'S') {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                    } else {
                        System.out.println("NO");
                    }

                } else {
                    System.out.println("NO");

                }

            }

        }
}
