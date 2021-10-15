public class Game {
    public static void main(String[] args) {
        Mikata m1 = new Mikata("KNIGHT", 100, 20, 10, 15, 12);
        Mikata m2 = new Mikata("WIZARD",  85, 35,  5, 15, 20);
        Mikata m3 = new Mikata("TANK",   240,  0, 20, 40, 5);
        Enemy e1 = new Enemy("ENEMY1",  400, 30, 10, 0, 15);
        Enemy e2 = new Enemy("ENEMY2", 1200,  0, 50, 5, 1);

        m1.printStatus();
        m2.printStatus();
        m3.printStatus();
        e1.printStatus();
        e2.printStatus();
        System.out.println();

        m1.attack(e1);
        System.out.println();
        m2.attack(e1);
        System.out.println();
        m3.attack(e2);
        System.out.println();
        e1.attack(m2);
        System.out.println();
        e2.attack(m3);

        System.out.println();
        m1.printStatus();
        m2.printStatus();
        m3.printStatus();
        e1.printStatus();
        e2.printStatus();
    }
}
