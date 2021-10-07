public class Game {
    public static void main(String[] args) {

        Mikata m1 = new Mikata();
        m1.name  = "AAAA";
        m1.hp    = 100;
        m1.mp    = 20;
        m1.atk   = 10;
        m1.def   = 15;
        m1.speed = 5;
        
        Enemy e1  = new Enemy();
        e1.name  = "ENEMY";
        e1.hp    = 300;
        e1.mp    = 0;
        e1.atk   = 15;
        e1.def   = 5;
        e1.speed = 7;

        System.out.println("name : "  + e1.name);
        System.out.println("hp : "    + e1.hp);
        System.out.println("mp : "    + e1.mp);
        System.out.println("atk : "   + e1.atk);
        System.out.println("def : "   + e1.def);
        System.out.println("speed : " + e1.speed);
        
    }
}
