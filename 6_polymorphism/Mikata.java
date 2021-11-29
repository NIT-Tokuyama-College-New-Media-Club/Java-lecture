public class Mikata extends Chara {
    Mikata(String name, int hp, int mp, int atk, int def, int speed) {
        super(name, hp, mp, atk, def, speed);
    }

    /* "味方は敵にXXXのダメージを与えた"という表示を行う */
    void printDamage(Enemy enemy, int damage) {
        System.out.println("--------------------");
        System.out.print(this.name + "は" + enemy.name + "に");
        ColorPrint.redPrintf("%d", damage);
        System.out.println("のダメージを与えた");
    }

    /* "敵のHPは残りXXX"という表示を行う */
    void printRestEnemyHP(Enemy enemy) {
        System.out.println(enemy.name + "のHPは残り" + enemy.hp);
        System.out.println("--------------------");
    }

    void attack(Enemy enemy) {
        int damage = (this.atk * 2) - enemy.def - 1;

        if (damage <= 0) {
            damage = 0;
        }
        
        enemy.hp = enemy.hp - damage;
        if (enemy.hp <= 0) {
            enemy.hp = 0;
        }

        printDamage(enemy, damage);
        printRestEnemyHP(enemy);
    }
}