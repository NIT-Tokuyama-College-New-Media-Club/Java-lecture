public class WhileTest {
    public static void main(String[] args) {

        /* eg1 : while(���߂ȗ�) */
        int a = 6;

        while (a >= 0) {
            // a >= 0��True�̊ԁA���̒��̏������J��Ԃ�
            System.out.printf("a = %d\n", a);
        }

        /* eg2 : �������g����*/
        int b = 6;
        
        while (b >= 0) {
            // b >= 0��True�̊ԁA���̒��̏������J��Ԃ�
            System.out.printf("b = %d\n", b);
            b = b - 1;
        }

        /* eg3 : �������[�v��break */
        int i = 0;

        while (true) {
            if (i > 5) {
                // i��5���傫���Ȃ����烋�[�v�𔲂���
                break;
            }
            System.out.printf("i = %d\n", i);

            i++;
        }

        System.out.printf("finish\n");

    }
}
