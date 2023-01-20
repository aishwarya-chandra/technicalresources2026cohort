public class a2_q17 {
    public static void main(String[] args) {
        int n = 3,q=-4;
        for (int row = 1; row <= 2 * n - 1; row++) {
            int columns = row > n ? row - q : row;
            for (int spaces = 1; spaces < n; spaces++) {
                if (row == n)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            for (int col = 1; col <= columns; col++) {
                System.out.print("*\t");
            }
            q += 2;
            System.out.println();
        }
    }

}
