import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        int mikata1Hp = 150;
        int mikata1Mp = 15;
        int mikata1Atk = 20;
        int mikata1Def = 10;
        int mikata1Speed = 5;

        int mikata2Hp = 100;
        int mikata2Mp = 20;
        int mikata2Atk = 5;
        int mikata2Def = 12;
        int mikata2Speed = 10;

        int mikata3Hp = 80;
        int mikata3Mp = 80;
        int mikata3Atk = 80;
        int mikata3Def = 80;
        int mikata3Speed = 80;

        int enemy1Hp = 200;
        int enemy1Mp = 200;
        int enemy1Atk = 200;
        int enemy1Def = 200;
        int enemy1Speed = 200;
        
        int enemy2Hp = 250;
        int enemy2Mp = 250;
        int enemy2Atk = 250;
        int enemy2Def = 250;
        int enemy2Speed = 250;

    
        Scanner sc = new Scanner();
        int target = 0;

        /* 味方1の攻撃処理 */
        target = sc.nextInt();  // どの敵に攻撃するか
        if (target == 1) {
            enemy1Hp = mikata1Atk - enemy1Def;
        } else if (target == 2) {
            enemy2Hp = mikata1Atk - enemy2Def;
        }

        /* 味方2の攻撃処理 */
        target = sc.nextInt();  // どの敵に攻撃するか
        if (target == 1) {
            enemy1Hp = mikata2Atk - enemy1Def;
        } else if (target == 2) {
            enemy2Hp = mikata2Atk - enemy2Def;
        }

        /* 味方3の攻撃処理 */
        target = sc.nextInt();  // どの敵に攻撃するか
        if (target == 1) {
            enemy1Hp = mikata3Atk - enemy1Def;
        } else if (target == 2) {
            enemy2Hp = mikata3Atk - enemy2Def;
        }

        /* 敵1の攻撃処理 */
        target = sc.nextInt();  // どの味方に攻撃するか
        if (target == 1) {
            mikata1Hp = enemy1Atk - mikata1Def;
        } else if (target == 2) {
            mikata2Hp = enemy1Atk - mikata2Def;
        } else if (target == 3) {
            mikata3Hp = enemy1Atk - mikata3Def;
        }
    
        /* 敵2の攻撃処理 */
        target = sc.nextInt();  // どの味方に攻撃するか
        if (target == 1) {
            mikata1Hp = enemy1Atk - mikata1Def;
        } else if (target == 2) {
            mikata2Hp = enemy1Atk - mikata2Def;
        } else if (target == 3) {
            mikata3Hp = enemy1Atk - mikata3Def;
        }
    }
}
