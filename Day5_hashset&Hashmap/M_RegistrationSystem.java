
import java.util.HashSet;
import java.util.Scanner;

public class M_RegistrationSystem {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        HashSet<String> Reg = new HashSet<String>();

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {

            String name = sc.next();

            if (Reg.contains(name)) {

                int t = 1;
                String name1 = name + t;

                while (Reg.contains(name1)) {
                    t++;
                    name1 = name + t;
                }
                Reg.add(name1);
                System.out.println(name1);

            } else {

                Reg.add(name);
                System.out.println("OK");

            }

        }

    }
}