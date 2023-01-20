public class a2_q18 {
    public static void main(String[] args) {
        int n = 4, q = 4, i = 3, j = 4;
        for (int row = 1; row <= 2 * n - 1; row++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int row = 2; row <= n; row++) {
            for (int col = 1; col <= 2 * n - 1; col++) {
                if (col == row || row + q == col)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
            q -= 2;
        }
        for (int row = 5; row <= 2 * n - 1; row++) {
            for (int spaces = j; spaces <= row; spaces++) {
                System.out.print("  ");
            }
            for (int stars = i; stars <= row; stars++) {
                System.out.print("* ");
            }
            System.out.println();
            i--;
            j += 2;
        }
    }
}
