import java.util.Scanner;

//print all primes till N
public class a1_q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number of range");
        int low_num = sc.nextInt();
        System.out.println("Enter last number of range");
        int high_num = sc.nextInt();
        System.out.println("Prime number are:");
        task: for (int j = low_num; j <= high_num; j++) {
            if (j == 1)
                continue task;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    continue task;
                }
            }
            System.out.print(" " + j + " ");
        }
    }

}
