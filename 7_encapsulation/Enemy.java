public class Enemy extends Chara {
    public Enemy(String name, int hp, int mp, int atk, int def, int speed) {
        super(name, hp, mp, atk, def, speed);
    }

    public int calcDamage(Chara chara) {
        return this.getAtk() - chara.getDef();
    }
}