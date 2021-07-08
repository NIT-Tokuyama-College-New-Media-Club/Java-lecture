public class ForTest {
    public static void main(String[] args) {

        /* eg1 whileでやってみる */
        int a = 0;    // ループ用の変数を定義する
        while (a < 5) {
            System.out.printf("a = %d\n", a);

            a++;    // aに1を加算する
        }

        /* eg2 for文 */
        for (int i = 0; i < 5; i++) {
            System.out.printf("i = %d\n", i);
        }

        /* eg3 2重for文 */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("(i, j) = (%d, %d)\n", i, j);
            }
        }
        
    }
}
