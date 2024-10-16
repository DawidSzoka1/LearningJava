package University.lab01;

import java.util.Random;

public class ShipGame {
    int[][] map = new int[10][10];

    boolean checkOutOfLeft(int x, int y, int range) {
        if ((x < (range - 1)) || ((x + range) > 10 + 1)) {
            return false;
        }
        for (int i = x; i >= x - 3; i--) {
            if (map[i][y] == 1) {
                return false;
            }
        }
        return true;

    }

    void fourSpotShip() {
        Random rand = new Random();
        //0 - left
        //1 - right
        //2 - up
        //3 - down
        int direction = rand.nextInt(4);
        int pos_x = rand.nextInt(10);
        int pos_y = rand.nextInt(10);
        int range = 4;

        while (map[pos_x][pos_y] != 0) {
            break;
        }
    }

    public static void main(String[] args) {
        ShipGame game = new ShipGame();
        game.fourSpotShip();

    }
}