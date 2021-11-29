public class Chara {
    
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
}