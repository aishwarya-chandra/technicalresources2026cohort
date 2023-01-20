public class a2_q6 {
    public static void main(String[] args) {
        int n = 3, i = 0, j = 4;
        for (int row = 1; row <= 2 * n - 1; row++) {
            int spaces_are = row > n ? (2 * n - row) + j : row + i;
            int columns_are = row > n ? row - n : n - row;
            for (int col = -1; col < columns_are; col++) {
                System.out.print("* ");
            }
            for (int spaces = 1; spaces <= spaces_are; spaces++) {
                System.out.print("  ");
            }
            for (int col = -1; col < columns_are; col++) {
                System.out.print("* ");
            }
            System.out.println();
            i++;
            j--;
        }
    }
}
