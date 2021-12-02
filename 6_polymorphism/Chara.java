public abstract class Chara {
    
    String name;

    int hp;
    int mp;
    int atk;
    int def;
    int speed;
    
    int maxHp;
    int maxMp;
    
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

        if (this.hp <= 0) {
            ColorPrint.redPrintf("HP : %4d / %4d, ", this.hp, this.maxHp);
        } else {
            System.out.printf("HP : %4d / %4d, ", this.hp, this.maxHp);
        }

        System.out.printf("MP : %4d / %4d, ", this.mp, this.maxMp);
        System.out.printf("ATK : %4d, ", this.atk);
        System.out.printf("DEF : %4d, ", this.def);
        System.out.printf("SPEED : %4d\n", this.speed);
    }

    /* "AはBにXXXのダメージを与えた"という表示を行う */
    void printDamage(Chara chara, int damage) {
        System.out.println("--------------------");
        System.out.print(this.name + "は" + chara.name + "に");
        ColorPrint.redPrintf("%d", damage);
        System.out.println("のダメージを与えた");
    }

    /* "AのHPは残りXXX"という表示を行う */
    void printRestHP(Chara chara) {
        System.out.println(chara.name + "のHPは残り" + chara.hp);
        System.out.println("--------------------");
    }

    abstract void attack(Chara chara);
}