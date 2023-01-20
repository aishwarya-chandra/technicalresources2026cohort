public class a2_q12 {
    public static void main(String[] args) {
        int n = 4, i = 0;
        int first = 0, second = 1, third = first + second;
        System.out.println(first);
        for (i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 2 && j == 1) {
                    System.out.print(second + "\t");
                    continue;
                }
                System.out.print(third + "\t");
                first = second;
                second = third;
                third = first + second;
            }
            System.out.println();
        }
    }
}
