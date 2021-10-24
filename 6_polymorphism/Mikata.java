import java.lang.Math;

public class Mikata extends Chara {
    Mikata(String name, int hp, int mp, int atk, int def, int speed) {
        super(name, hp, mp, atk, def, speed);
    }
    
    void specialAttack(Chara target) {
        if (this.mp < 5) {
            System.out.println("MPが足りなかった");
            return;
        }
        this.mp -= 5;

        int damage = this.atk - target.def;
        if (damage <= 0) {
            damage = 0;
        }

        damage += (int)(Math.random() * 10 + 5);
        
        execAttack(target, damage);  // 運に左右される
    }
}