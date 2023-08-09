import java.util.HashMap;
import java.util.Scanner;

public class M_Hashmap {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> reg = new HashMap<>();

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String name = sc.next();

            if (reg.containsKey(name)) {
                int t = 1;

                String newName = name + t;
                while (reg.containsKey(newName)) {
                    t++;
                    newName = name + t;
                }
                reg.put(newName, 1);
                System.out.println(newName);
            } else {
                reg.put(name, 1);
                System.out.println("OK");
            }
        }
    }
}
