import java.util.HashSet;
import java.util.Scanner;

public class T_DistinctNumbers {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        HashSet<Integer> Distinct = new HashSet<Integer>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            int m = sc.nextInt();
            Distinct.add(m);
        }

        System.out.println(Distinct.size());

    }
}