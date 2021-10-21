import java.util.Scanner;

public class Game {
    static final int COMMAND_ATTACK         = 1;
    static final int COMMAND_QUIT           = 0;

    public static void main(String[] args) {
        Mikata m1 = new Mikata("KNIGHT", 100, 100, 10, 15, 12);
        Mikata m2 = new Mikata("WIZARD",  85, 35,  5, 15, 20);
        Mikata m3 = new Mikata("TANK",   240,  0, 20, 40, 5);
        Enemy e1 = new Enemy("ENEMY1",  400, 30, 10, 0, 15);
        Enemy e2 = new Enemy("ENEMY2", 1200,  0, 50, 5, 1);
        printStatus(m1, m2, m3, e1, e2);

        Scanner sc = new Scanner(System.in);

        int cmd = -1;
        while (true) {
            printCommand();
            cmd = sc.nextInt();
            if (cmd == COMMAND_QUIT) {
                break;
            } else if (cmd == COMMAND_ATTACK) {
                m1.attack(e1);
                printStatus(m1, m2, m3, e1, e2);
            }
        }

        sc.close();

        System.out.println("Game over");
    }

    static void printStatus(Mikata m1, Mikata m2, Mikata m3, Enemy e1, Enemy e2) {
        ColorPrint.greenPrintf("[PARTY]\n");
        m1.printStatus();
        m2.printStatus();
        m3.printStatus();
        ColorPrint.yellowPrintf("[ENEMY]\n");
        e1.printStatus();
        e2.printStatus();
        System.out.println("--------------------");
    }

    static void printCommand() {
        ColorPrint.purplePrintf("[COMMAND]\n");
        System.out.println("1. Attack");
        System.out.println("0. Quit");
        System.out.println("--------------------");
    }
}
