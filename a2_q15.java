public class a2_q15 {
    public static void main(String[] args) {
        int n = 3, i = 0, p = -2 * n, j = 2 * n - 2;
        for (int row = 1; row <= 2 * n - 1; row++) {
            p += 2;
            int columns_are = row > n ? (2 * n - row) + j : row + i;
            int spaces_are = row > n ? row - n : n - row;
            for (int spaces = 1; spaces <= spaces_are; spaces++) {
                System.out.print("\t");
            }
            int q = 0, r = 2, row1 = 0;
            for (int col = 0; col < columns_are; col++) {
                if (col <= columns_are / 2 && row <= n) {
                    System.out.print(row + q + "\t");
                    q++;
                    row1 = row + q;
                } else if (col <= columns_are / 2 && row > n) {
                    System.out.print(row - p + q + "\t");
                    q++;
                    row1 = row - p + q;
                } else {
                    System.out.print(row1 - r + "\t");
                    row1++;
                    r += 2;
                }
            }
            System.out.println();
            i++;
            j--;
        }
    }
}
