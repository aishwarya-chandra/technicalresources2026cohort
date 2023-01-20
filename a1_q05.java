import java.util.Scanner;

//count digits in a number
public class a1_q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println("Digits in the number are " + count);
    }
}
