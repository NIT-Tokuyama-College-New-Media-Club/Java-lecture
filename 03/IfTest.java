public class IfTest {
    public static void main(String[] args) {

        /* eg1 : ����������������� */
        int a = 3;

        if (a > 2) {
            // ��������True�Ȃ�R�R
            System.out.printf("a > 2 = True\n");
        }

        /* eg2 : ���������������Ȃ��� */
        int b = 1;

        if (b > 5) {
            // ��������True�Ȃ�R�R
            System.out.printf("b > 5 = True\n");
        }

        /* eg3 : �_�����Z�q���g������ */
        int c = 3;
        int d = 1;

        if ((c > 2) || (d > 5)) {
            // ��������True�Ȃ�R�R
            System.out.printf("(c > 2) || (d > 5) = True\n");
        }

        /* eg4 : else */
        int e = 2;

        if (e >= 5) {    // e��5�ȏ�
            System.out.printf("e >= 5\n");
        } else {
            // e��5�ȏ�u�łȂ���΁v��������s
            System.out.printf("e < 5\n");
        }        

        /* eg5 : else-if��RPG���ۂ� */
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