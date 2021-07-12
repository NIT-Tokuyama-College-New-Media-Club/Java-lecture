public class IfTest {
    public static void main(String[] args) {

        /* eg1 : ifの例 */
        int a = 3;

        if (a > 2) {
            // 条件式がTrueならココ
            System.out.printf("a > 2 = True\n");
        }

        /* eg2 : {}の省略 */

        int b = 1;

        if (b > 5)
            System.out.printf("b > 5 = True\n");    // 1行だけなら{}は省略可

        // ここは「ifの外」
        System.out.printf("foo\n");

        /* eg3 : 論理演算子を使った例 */

        int c = 3;
        int d = 1;

        if ((c > 2) && (d > 5)) {
            // 条件式がTrueならココ
            System.out.printf("(c > 2) || (d > 5) = True\n");
        }

        /* eg4 : booleanの変数を使った場合 */
        
        boolean e = false;

        if (e) {
            // eはFalseなのでこの部分が実行されることはない
        }

        if (true) {
            // 条件がtrueなので絶対にここは実行される
        }

        /* eg5 : else */
        int f = 2;

        if (f >= 5) {    // fは5以上
            System.out.printf("f >= 5\n");
        } else {
            // fが5以上「でなければ」これを実行
            System.out.printf("f < 5\n");
        }        

        /* eg6 : else-ifをRPGっぽく */
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