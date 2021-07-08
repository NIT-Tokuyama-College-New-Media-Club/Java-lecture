public class IfTest {
    public static void main(String[] args) {

        /* eg1 : 条件式が成立する例 */
        int a = 3;

        if (a > 2) {
            // 条件式がTrueならココ
            System.out.printf("a > 2 = True\n");
        }

        /* eg2 : 条件式が成立しない例 */
        int b = 1;

        if (b > 5) {
            // 条件式がTrueならココ
            System.out.printf("b > 5 = True\n");
        }

        /* eg3 : 論理演算子を使った例 */
        int c = 3;
        int d = 1;

        if ((c > 2) || (d > 5)) {
            // 条件式がTrueならココ
            System.out.printf("(c > 2) || (d > 5) = True\n");
        }

        /* eg4 : else */
        int e = 2;

        if (e >= 5) {    // eは5以上
            System.out.printf("e >= 5\n");
        } else {
            // eが5以上「でなければ」これを実行
            System.out.printf("e < 5\n");
        }        

        /* eg5 : else-ifをRPGっぽく */
        int select = 3;

        if (select == 1) {
            System.out.printf("攻撃\n");

        } else if (select == 2) {
            System.out.printf("防御\n");

        } else if (select == 3) {
            System.out.printf("逃げる\n");
        }

    }
}