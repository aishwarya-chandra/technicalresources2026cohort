import java.util.*;

public class a1_q7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scn.nextInt();
        int inv = 0; // inverted number at the tart
        int op = 1; // original place
        while (n > 0) {
            int od = n % 10; // last digit of original number
            int id = op; // id = inverted digit
            int ip = od; // ip = inverted place
            // Make change to inv using ip and id
            inv = inv + (id * (int) Math.pow(10, ip - 1));
            n = n / 10;
            op++;
        }
        System.out.println(inv);
    }
}
