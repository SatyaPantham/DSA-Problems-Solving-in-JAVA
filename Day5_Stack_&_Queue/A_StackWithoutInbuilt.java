import java.util.*;

public class A_StackWithoutInbuilt {

    static int TOP = -1, Length = 100000;

    public static void PUSH(int[] S1, int x) {
        if (TOP == Length - 1) {
            return;
        }
        TOP = TOP + 1;
        S1[TOP] = x;
    }

    public static void POP(int[] S1) {

        if (TOP == -1) {
            System.out.println("Empty");
            return;
        }
        System.out.println(S1[TOP]);
        TOP = TOP - 1;

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int x = 0;
        int S1[] = new int[100000];

        while (T-- > 0) {

            String str = sc.next();
            if (str.equals("push")) {
                int n = sc.nextInt();
                x = n;
            }
            switch (str) {

                case "push":
                    PUSH(S1, x);
                    break;
                case "pop":
                    POP(S1);
                    break;

            }

        }

    }

}
