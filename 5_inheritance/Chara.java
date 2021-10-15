public class Chara {
    String name;

    int hp;
    int mp;
    int atk;
    int def;
    int speed;

    Chara(String name, int hp, int mp, int atk, int def, int speed) {
        this.name  = name;
        this.hp    = hp;
        this.mp    = mp;
        this.atk   = atk;
        this.def   = def;
        this.speed = speed;
    }

    void printStatus() {
        System.out.printf("%7s ", name);
        System.out.printf("HP : %4d, ", hp);
        System.out.printf("MP : %4d, ", mp);
        System.out.printf("ATK : %4d, ", atk);
        System.out.printf("DEF : %4d, ", def);
        System.out.printf("SPEED : %4d\n", speed);
    }
}
