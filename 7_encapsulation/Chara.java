public abstract class Chara {
    
    private String name;

    private int hp;
    private int mp;
    private int atk;
    private int def;
    private int speed;
    
    private int maxHp;
    private int maxMp;

    public String getName() {
        return this.name;
    }
    public int getHp() {
        return this.hp;
    }
    public int getMp() {
        return this.mp;
    }
    public int getAtk() {
        return this.atk;
    }
    public int getDef() {
        return this.def;
    }
    
    public void setHp(int hp) {
        if (hp < 0) {
            hp = 0;
        }
        this.hp = hp;
    }
    public void setMp(int mp) {
        if (mp < 0) {
            mp = 0;
        }
        this.mp = mp;
    }

    public Chara(String name, int hp, int mp, int atk, int def, int speed) {
        this.name  = name;
        
        this.hp    = hp;
        this.maxHp = hp;
        this.mp    = mp;
        this.maxMp = mp;

        this.atk   = atk;
        this.def   = def;
        this.speed = speed;
    }

    public void printStatus() {
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
    public void printDamage(Chara chara, int damage) {
        System.out.println("--------------------");
        System.out.print(this.name + "は" + chara.name + "に");
        ColorPrint.redPrintf("%d", damage);
        System.out.println("のダメージを与えた");
    }

    /* "AのHPは残りXXX"という表示を行う */
    public void printRestHP(Chara chara) {
        System.out.println(chara.name + "のHPは残り" + chara.hp);
        System.out.println("--------------------");
    }

    public abstract int calcDamage(Chara chara);

    public void attack(Chara chara) {
        int damage = calcDamage(chara);

        if (damage <= 0) {
            damage = 0;
        }
        
        chara.setHp(chara.getHp() - damage);

        printDamage(chara, damage);
        printRestHP(chara);
    }
}