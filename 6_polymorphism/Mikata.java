public class Mikata extends Chara {
    Mikata(String name, int hp, int mp, int atk, int def, int speed) {
        super(name, hp, mp, atk, def, speed);
    }

    void attack(Chara chara) {
        int damage = (this.atk * 2) - chara.def;

        if (damage <= 0) {
            damage = 0;
        }
        
        chara.hp = chara.hp - damage;
        if (chara.hp <= 0) {
            chara.hp = 0;
        }

        printDamage(chara, damage);
        printRestHP(chara);
    }
}