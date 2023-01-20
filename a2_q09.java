public class a2_q9 {
    public static void main(String[] args) {
        int n = 5, i = 0;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == col || col == n + i)
                    System.out.print("* ");
                else
                    System.out.print("   ");
            }
            System.out.println();
            i--;
        }
    }
}
