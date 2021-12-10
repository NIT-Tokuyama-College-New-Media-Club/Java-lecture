public class Mikata extends Chara {
    public Mikata(String name, int hp, int mp, int atk, int def, int speed) {
        super(name, hp, mp, atk, def, speed);
    }

    public int calcDamage(Chara chara) {
        return (this.getAtk() * 2) - chara.getDef();
    }
}