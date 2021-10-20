import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int key = -1;
        while (true) {
            key = sc.nextInt();  // 何かが入力されるまで停止
            if (key == 0) {
                System.out.println("さよなら");
                break;
            } else if (key == 1) {
                System.out.println("おはよう");
            } else if (key == 2) {
                System.out.println("こんにちは");
            } else if (key == 3) {
                System.out.println("こんばんは");
            }
        }

        sc.close();
    }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int key = sc.nextInt();  // 何かが入力されるまで停止
        
    //     System.out.printf("key = %d\n", key);

    //     sc.close();
    // }
}