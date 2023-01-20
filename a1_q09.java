import java.util.Scanner;

//find GCD and LCM of 2 numbers
//GCD (a,b) = [|a.b|]/[lcm(a,b)]
public class a1_q9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    System.out.println("Enter another number ");
    int b = sc.nextInt();
    int p = 0,m=0;
    if (a > b)
      p = a;
    else
      p = b;
    while (true) {
      if (p % a == 0 && p % b == 0) {
        System.out.printf("The LCM of %d and %d is %d.\n", a, b, p);
        break;
      }
      ++p;
    }
    m = (a * b) / (p);
    System.out.printf("The GCD of %d and %d is %d.", a, b, m);
  }
}
