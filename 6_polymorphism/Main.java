public class Main {
    public static void main(String[] args) {

        Chara[] charas = new Chara[5];

        charas[0] = new Mikata("KNIGHT", 100, 100, 100, 15, 12);
        charas[1] = new Mikata("WIZARD",  85, 35,  5, 15, 20);
        charas[2] = new Mikata("TANK",   0,  100, 20, 40, 5);
        charas[3] = new Enemy("ENEMY1",  400, 30, 10, 0, 15);
        charas[4] = new Enemy("ENEMY2", 1200,  0, 50, 5, 1);

        for (int i = 0; i < charas.length; i++) {
            charas[i].printStatus();
        }

    }
}
