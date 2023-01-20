public class a2_q5 {
    public static void main(String[] args) {
        int n = 3, i = 0, j = 4;
        for (int row = 1; row <= 2 * n - 1; row++) {
            int columns_are = row > n ? (2 * n - row) + j : row + i;
            int spaces_are = row > n ? row - n : n - row;
            for (int spaces = 1; spaces <= spaces_are; spaces++) {
                System.out.print("  ");
            }
            for (int col = 0; col < columns_are; col++) {
                System.out.print("* ");
            }
            System.out.println();
            i++;
            j--;
        }
    }
}
