public class IfTest {
    public static void main(String[] args) {

        /* eg1 : if�̗� */
        int a = 3;

        if (a > 2) {
            // ��������True�Ȃ�R�R
            System.out.printf("a > 2 = True\n");
        }

        /* eg2 : {}�̏ȗ� */

        int b = 1;

        if (b > 5)
            System.out.printf("b > 5 = True\n");    // 1�s�����Ȃ�{}�͏ȗ���

        // �����́uif�̊O�v
        System.out.printf("foo\n");

        /* eg3 : �_�����Z�q���g������ */

        int c = 3;
        int d = 1;

        if ((c > 2) && (d > 5)) {
            // ��������True�Ȃ�R�R
            System.out.printf("(c > 2) || (d > 5) = True\n");
        }

        /* eg4 : boolean�̕ϐ����g�����ꍇ */
        
        boolean e = false;

        if (e) {
            // e��False�Ȃ̂ł��̕��������s����邱�Ƃ͂Ȃ�
        }

        if (true) {
            // ������true�Ȃ̂Ő�΂ɂ����͎��s�����
        }

        /* eg5 : else */
        int f = 2;

        if (f >= 5) {    // f��5�ȏ�
            System.out.printf("f >= 5\n");
        } else {
            // f��5�ȏ�u�łȂ���΁v��������s
            System.out.printf("f < 5\n");
        }        

        /* eg6 : else-if��RPG���ۂ� */
        int select = 3;

        if (select == 1) {
            System.out.printf("�U��\n");

        } else if (select == 2) {
            System.out.printf("�h��\n");

        } else if (select == 3) {
            System.out.printf("������\n");
        }

    }
}