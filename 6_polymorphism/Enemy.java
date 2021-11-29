public class Enemy extends Chara {
    Enemy(String name, int hp, int mp, int atk, int def, int speed) {
        super(name, hp, mp, atk, def, speed);
    }

    /* "EnemyはMikataにXXXのダメージを与えた"という表示を行う */
    void printDamage(Mikata mikata, int damage) {
        System.out.println("--------------------");
        System.out.print(this.name + "は" + mikata.name + "に");
        ColorPrint.redPrintf("%d", damage);
        System.out.println("のダメージを与えた");
    }

    /* "MikataのHPは残りXXX"という表示を行う */
    void printRestMikataHP(Mikata mikata) {
        System.out.println(mikata.name + "のHPは残り" + mikata.hp);
        System.out.println("--------------------");
    }

    void attack(Mikata mikata) {
        int damage = this.atk - mikata.def;

        if (damage <= 0) {
            damage = 0;
        }
        
        mikata.hp = mikata.hp - damage;
        if (mikata.hp <= 0) {
            mikata.hp = 0;
        }

        printDamage(mikata, damage);
        printRestMikataHP(mikata);
    }
}