import java.util.Scanner;

public class Game {
    static final int COMMAND_ATTACK         = 1;
    static final int COMMAND_QUIT           = 0;

    public static void main(String[] args) {
        clearTerminal();
        Scanner sc = new Scanner(System.in);

        Chara[] charas = new Chara[5];
        charas[0] = new Mikata("KNIGHT", 100, 100, 100, 15, 12);
        charas[1] = new Mikata("WIZARD",  85, 35,  5, 15, 20);
        charas[2] = new Mikata("TANK",   0,  100, 20, 40, 5);
        charas[3] = new Enemy("ENEMY1",  400, 30, 10, 0, 15);
        charas[4] = new Enemy("ENEMY2", 1200,  0, 50, 5, 1);
        
        int cmd  = 0;
        int turn = 0;
        while (true) {
            printStatus(charas);
            printCurrentActor(charas[turn]);
            printCommand();
            cmd = sc.nextInt();
            
            if (cmd == COMMAND_QUIT) {
                break;
                
            } else if (cmd == COMMAND_ATTACK) {
                Chara target = selectTarget(charas);
                
                System.out.println(target.name + "に攻撃する");
                charas[turn].attack(target);

                printStatus(charas);
            }

            // 何か押されるまで待機
            sc.nextLine();
            sc.nextLine();

            clearTerminal();

            turn++;
            // 行動順を先頭に戻す
            if (turn >= charas.length) {
                turn = 0;
            }
        }

        System.out.println("Game over");
    }

    static Chara selectTarget(Chara[] charas) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.println("誰に攻撃しますか？");
        for (int i = 0; i < charas.length; i++) {
            System.out.printf("%2d : %s\n", i, charas[i].name);
        }
        System.out.println();

        int target = sc.nextInt();
        while (target >= charas.length) {
            target = sc.nextInt();
        }

        return charas[target];
    }

    static void printCurrentActor(Chara chara) {
        System.out.println(chara.name + "のターンです");
    }

    static void printStatus(Chara[] charas) {
        System.out.println("[STATUS]");
        for (int i = 0; i < charas.length; i++) {
            charas[i].printStatus();
        }
        System.out.println("--------------------");
    }

    static void printCommand() {
        ColorPrint.purplePrintf("[COMMAND]\n");
        System.out.println("1. Attack");
        System.out.println("0. Quit");
        System.out.println("--------------------");
    }

    static void clearTerminal() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
}
