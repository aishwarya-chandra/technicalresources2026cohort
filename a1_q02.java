import java.util.Scanner;

public class a1_q2 {
    public static void main(String[] args) {
        System.out.println("Enter marks");
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        if (m > 90)
            System.out.println("excellent");
        else if (m <= 90 && m > 80)
            System.out.println("good");
        else if (m <= 80 && m > 70)
            System.out.println("fair");
        else if (m <= 70 && m > 60)
            System.out.println("meets expectations");
        else
            System.out.println("below par");

    }
}
