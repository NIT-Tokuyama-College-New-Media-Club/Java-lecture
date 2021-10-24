import java.util.Scanner;

public class Game {
    static final int COMMAND_ATTACK         = 1;
    static final int COMMAND_SPECIALATTACK  = 2;
    static final int COMMAND_QUIT           = 0;

    public static void main(String[] args) {
        clearTerminal();

        Mikata m1 = new Mikata("KNIGHT", 100, 100, 10, 15, 12);
        Mikata m2 = new Mikata("WIZARD",  85, 35,  5, 15, 20);
        Mikata m3 = new Mikata("TANK",   240,  0, 20, 40, 5);
        Enemy e1 = new Enemy("ENEMY1",  400, 30, 10, 0, 15);
        Enemy e2 = new Enemy("ENEMY2", 1200,  0, 50, 5, 1);
        Chara charas[] = {m1, m2, m3, e1, e2};

        Scanner sc = new Scanner(System.in);
        int cmd = -1;

        int turn = 0;  // 誰が行動しているか
        int target = 0; // 誰が攻撃対象なのか
        while (true) {
            printStatus(m1, m2, m3, e1, e2);
            printCommand();

            System.out.println(charas[turn].name + "はどうする？");
            System.out.printf(">");
            cmd = sc.nextInt();
            
            if (cmd == COMMAND_QUIT) {
                break;

            } else if (cmd == COMMAND_ATTACK) {
                target = selectTarget(charas[turn], charas);
                charas[turn].attack(charas[target]);
                
            } else if (cmd == COMMAND_SPECIALATTACK) {
                target = selectTarget(charas[turn], charas);
                charas[turn].specialAttack(charas[target]);
                
            } else {
                continue;
            }
            
            printStatus(m1, m2, m3, e1, e2);

            // エンターキーが押されるまで待ち
            sc.nextLine();
            sc.nextLine();
            
            turn++;
            if (turn >= charas.length) {
                turn = 0;
            }

            clearTerminal();
        }

        clearTerminal();
        System.out.println("Game over");
    }

    /* 攻撃対象のcharas内での添え字を返す */
    static int selectTarget(Chara actor, Chara[] charas) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.printf(">");
        System.out.println(actor.name + "は誰に攻撃する？");

        for (int i = 0; i < charas.length; i++) {
            System.out.println((i + 1) + ". " + charas[i].name);
        }

        int target = -1; 
        while (!(0 <= target && target < charas.length)) {
            target = sc.nextInt() - 1;  // 配列の添え字と対応させるため-1
        }

        return target;
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
        System.out.println("1. 攻撃");
        System.out.println("2. スペシャル攻撃");
        System.out.println("0. 終了");
        System.out.println("--------------------");
    }

    static void clearTerminal() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
}
