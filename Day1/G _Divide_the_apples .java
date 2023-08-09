import java.util.Scanner;

class Dividetheapples {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int r = k % n;

        System.out.println(r);

    }

}
