import java.util.Scanner;

//if is a prime number
public class a1_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.print(num);
        /*if (num == 1) {
            System.out.println(" is not a prime number");
            System.exit(0);
        }*/
        for (int i = 2; i < num; i++) {
            if (num % i == 0||num==1) {
                System.out.print(" is not a prime number");
                System.exit(0);
            }
        }
        System.out.println(" is a prime number");
    }
}
