public class a2_q8 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = n; row >= 0; row--) {
            for (int col = 0; col < n; col++) {
                if (row == col)
                    System.out.print("* ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
