public class a2_q11 {
    public static void main(String[] args) {
        int n = 4, i = 0;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                i++;
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
