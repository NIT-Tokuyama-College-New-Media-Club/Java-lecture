public class WhileTest {
    public static void main(String[] args) {

        /* eg1 : while(だめな例) */
        int a = 6;

        while (a >= 0) {
            // a >= 0がTrueの間、この中の処理を繰り返す
            System.out.printf("a = %d\n", a);
        }

        /* eg2 : 正しい使い方*/
        int b = 6;
        
        while (b >= 0) {
            // b >= 0がTrueの間、この中の処理を繰り返す
            System.out.printf("b = %d\n", b);
            b = b - 1;
        }

        /* eg3 : 無限ループとbreak */
        int i = 0;

        while (true) {
            if (i > 5) {
                // iが5より大きくなったらループを抜ける
                break;
            }
            System.out.printf("i = %d\n", i);

            i++;
        }

        System.out.printf("finish\n");

    }
}
