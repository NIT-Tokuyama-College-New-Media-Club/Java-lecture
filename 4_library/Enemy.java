public class Enemy {
    String name;

    int hp;
    int mp;
    int atk;
    int def;
    int speed;

    Enemy(String name, int hp, int mp, int atk, int def, int speed) {
        this.name  = name;
        this.hp    = hp;
        this.mp    = mp;
        this.atk   = atk;
        this.def   = def;
        this.speed = speed;
    }

    void printStatus() {
        System.out.printf("%7s ", this.name);
        System.out.printf("HP : %4d, ", this.hp);
        System.out.printf("MP : %4d, ", this.mp);
        System.out.printf("ATK : %4d, ", this.atk);
        System.out.printf("DEF : %4d, ", this.def);
        System.out.printf("SPEED : %4d\n", this.speed);
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