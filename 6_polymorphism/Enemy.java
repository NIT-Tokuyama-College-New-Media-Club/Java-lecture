public class Enemy extends Chara {
    Enemy(String name, int hp, int mp, int atk, int def, int speed) {
        super(name, hp, mp, atk, def, speed);
    }
    
    void specialAttack(Chara target) {
        if (this.mp < 10) {
            System.out.println("MPが足りなかった");
            return;
        }
        this.mp -= 10;

        execAttack(target, this.atk);  // 防御力無視
    }
}