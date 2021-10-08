public class Mikata {
    String name;

    int hp;
    int mp;
    int atk;
    int def;
    int speed;

    Mikata(String name, int hp, int mp, int atk, int def, int speed) {
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

    void attack(Enemy enemy) {
        int damage = this.atk - enemy.def;
        System.out.println(
            this.name + "は" + enemy.name + "に" + damage + "ダメージを与えた"
        );
        if (damage <= 0) {
            damage = 0;
        }
        
        enemy.hp = enemy.hp - damage;
        if (enemy.hp <= 0) {
            enemy.hp = 0;
        }
        System.out.println(enemy.name + "のHPは残り" + enemy.hp);
    }
}