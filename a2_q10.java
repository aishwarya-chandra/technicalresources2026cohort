public class a2_q10 {
    public static void main(String[] args) {
        int n = 3, i = 2, j = 2, q = -6;
        for (int row = 1; row <= 2 * n - 1; row++) {
            for (int col = 1; col <= 2 * n - 1; col++) {
                int col1 = row > n ? row - j : (2 * n - 1) - i;
                int col2 = row > n ? row - q : row + 2;
                if (col == col1 || col == col2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
            i++;
            q += 2;
        }
    }
}
