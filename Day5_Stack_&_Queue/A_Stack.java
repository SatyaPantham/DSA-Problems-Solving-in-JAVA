import java.util.*;

public class A_Stack {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < T; i++) {

            String operation = sc.next();

            if (operation.equals("push")) {

                stk.push(sc.nextInt());

            } else if (operation.equals("pop")) {

                if (stk.isEmpty()) {

                    System.out.println("Empty");

                } else {
                    System.out.println(stk.pop());
                }

            }

        }

    }
}
