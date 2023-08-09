import java.util.*;

public class C_CollectingMangoes {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {

            Stack<Integer> stk = new Stack<>();
            int count = sc.nextInt();
            System.out.println("Case " + i + ":");

            for (int j = 0; j < count; j++) {

                char operation;
                operation = sc.next().charAt(0);

                if (operation == 'A') {
                    int x = sc.nextInt();

                    if (stk.empty() || x > stk.peek()) {
                        stk.push(x);
                    } else {
                        stk.push(stk.peek());
                    }

                } else if (operation == 'R') {
                    if (stk.empty()) {
                        System.out.println("Empty");
                    } else {
                        stk.pop();
                    }
                } else {

                    System.out.println(stk.peek());

                }
                count++;

            }

        }

    }

}