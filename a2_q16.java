public class a2_q16 {
    public static void main(String[] args) {
        int n = 4, q = 0;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (col == n)
                    break;
                System.out.print(col + "\t");
            }
            for (int col = n + 1 - q; col > 0; col--) {
                System.out.print("\t");

            }
            q += 2;
            for (int col = row; col <= row; col--) {
                if (col == 0)
                    break;
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }

}
