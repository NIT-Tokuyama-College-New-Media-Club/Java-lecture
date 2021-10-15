public class Mikata extends Chara {
    Mikata(String name, int hp, int mp, int atk, int def, int speed) {
        super(name, hp, mp, atk, def, speed);
    }

    void attack(Enemy enemy) {
        int damage = this.atk - enemy.def;

        System.out.println("--------------------");
        System.out.print(this.name + "は" + enemy.name + "に");
        ColorPrint.redPrintf("%d", damage);
        System.out.println("のダメージを与えた");
        
        if (damage <= 0) {
            damage = 0;
        }
        
        enemy.hp = enemy.hp - damage;
        if (enemy.hp <= 0) {
            enemy.hp = 0;
        }
        System.out.println(enemy.name + "のHPは残り" + enemy.hp);
        System.out.println("--------------------");
    }
}