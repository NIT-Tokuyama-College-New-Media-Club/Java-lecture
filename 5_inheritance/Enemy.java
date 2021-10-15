public class Enemy extends Chara {
    Enemy(String name, int hp, int mp, int atk, int def, int speed) {
        super(name, hp, mp, atk, def, speed);
    }

    void attack(Mikata mikata) {
        int damage = this.atk - mikata.def;

        System.out.println("--------------------");
        System.out.print(this.name + "は" + mikata.name + "に");
        ColorPrint.redPrintf("%d", damage);
        System.out.println("のダメージを与えた");

        if (damage <= 0) {
            damage = 0;
        }

        mikata.hp = mikata.hp - damage;
        if (mikata.hp <= 0) {
            mikata.hp = 0;
        }
        System.out.println(mikata.name + "のHPは残り" + mikata.hp);
        System.out.println("--------------------");
    }
}