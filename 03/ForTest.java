public class ForTest {
    public static void main(String[] args) {

        /* eg1 while�ł���Ă݂� */
        int a = 0;    // ���[�v�p�̕ϐ����`����
        while (a < 5) {
            System.out.printf("a = %d\n", a);

            a++;    // a��1�����Z����
        }

        /* eg2 for�� */
        for (int i = 0; i < 5; i++) {
            System.out.printf("i = %d\n", i);
        }

        /* eg3 2�dfor�� */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("(i, j) = (%d, %d)\n", i, j);
            }
        }
        
    }
}
