import java.util.*;

public class a1_q8 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number ");
    String n = sc.nextLine();
    System.out.println("Enter number of times to rotate");
    int k = sc.nextInt();
    k = k % n.length();
    if (k < 0)
      k = n.length() + k;
    String rotated = n.substring(n.length() - k) + n.substring(0, n.length() - k);
    System.out.print("Rotated number= ");
    System.out.print(rotated);
  }
}
