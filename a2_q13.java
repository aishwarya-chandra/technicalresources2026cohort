public class a2_q13 {
    public static void main(String[] args) {
        int n = 6;
        for (int row = 0; row < n; row++) {
            int i = 1;
            for (int col = 0; col <= row; col++) {
                System.out.print(i + " ");
                int io = i * (row - col) / (col + 1);
                i = io;
            }
            System.out.println();
        }
    }
}
