public abstract class Chara {
    String name;

    int hp;
    int maxHp;

    int mp;
    int maxMp;

    int atk;
    int def;
    int speed;

    Chara(String name, int hp, int mp, int atk, int def, int speed) {
        this.name  = name;
        
        this.hp    = hp;
        this.maxHp = hp;
        this.mp    = mp;
        this.maxMp = mp;

        this.atk   = atk;
        this.def   = def;
        this.speed = speed;
    }

    void printStatus() {
        System.out.printf("%7s ", this.name);
        System.out.printf("HP : %4d / %4d, ", this.hp, this.maxHp);
        System.out.printf("MP : %4d / %4d, ", this.mp, this.maxMp);
        System.out.printf("ATK : %4d, ", this.atk);
        System.out.printf("DEF : %4d, ", this.def);
        System.out.printf("SPEED : %4d\n", this.speed);
    }

    void execAttack(Chara target, int damage) {
        System.out.println("--------------------");
        System.out.print(this.name + "は" + target.name + "に");
        ColorPrint.redPrintf("%d", damage);
        System.out.println("のダメージを与えた");

        target.hp = target.hp - damage;
        if (target.hp <= 0) {
            target.hp = 0;
        }

        System.out.println(target.name + "のHPは残り" + target.hp);
        System.out.println("--------------------");
    }

    void attack(Chara target) {
        execAttack(target, this.atk - target.def);
    }
    
    abstract void specialAttack(Chara target);
}