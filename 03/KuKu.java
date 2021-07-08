public class KuKu {
    public static void main(String[] args) {

        /* eg : 九九 */
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.printf("\n");    // 改行
        }

    }
}
