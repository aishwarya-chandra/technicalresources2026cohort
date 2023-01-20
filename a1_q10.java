import java.util.Scanner;

//prime factorization of number
public class a1_q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.print("Prime Factorization of " + num + " is 1");
        task: for (int j = 2; j <= num; j++) {
            if (j == 1)
                continue task;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    continue task;
                }
            }
            above: for (int p = 1; p >= 1; p++) {
                if (num % j == 0 && num != 0) {
                    num = num / j;
                    System.out.print("*" + j);
                    continue above;
                }
                break;
            }
        }
    }
}
