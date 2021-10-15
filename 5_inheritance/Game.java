import java.util.Scanner;

public class Game {
    static final int COMMAND_ATTACK         = 1;
    static final int COMMAND_SPECIAL_ATTACK = 2;
    static final int COMMAND_GUARD          = 3;
    static final int COMMAND_QUIT           = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mikata m1 = new Mikata("KNIGHT", 100, 100, 10, 15, 12);
        Mikata m2 = new Mikata("WIZARD",  85, 35,  5, 15, 20);
        Mikata m3 = new Mikata("TANK",   240,  0, 20, 40, 5);
        Enemy e1 = new Enemy("ENEMY1",  400, 30, 10, 0, 15);
        Enemy e2 = new Enemy("ENEMY2", 1200,  0, 50, 5, 1);

        int cmd = 0;
        int target = 0;
        do {
            printStatus(m1, m2, m3, e1, e2);
            printCommand();

            cmd = sc.nextInt();
            switch (cmd) {
            case COMMAND_ATTACK:
                ColorPrint.redPrintf("[TARGET]\n");
                System.out.printf("1: %s\n", e1.name);
                System.out.printf("2: %s\n", e2.name);
                System.out.println("--------------------");

                target = sc.nextInt();
                switch (target) {
                case 1: 
                    m1.attack(e1);
                    break;
                case 2:
                    m1.attack(e2);
                    break;
                }
                break;
            case COMMAND_SPECIAL_ATTACK:
                break;
            case COMMAND_GUARD:
                break;
            case COMMAND_QUIT:
                break;
            default:
                break;
            }
        } while (cmd != 0);

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
        System.out.println("2. Special attack");
        System.out.println("3. Guard");
        System.out.println("0. Quit");
        System.out.println("--------------------");
    }
}
