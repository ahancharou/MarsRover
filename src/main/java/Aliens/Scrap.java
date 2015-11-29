package Aliens;

import java.util.Random;
public class Scrap {

    private int x;
    private int y;

    public Scrap() {
        Random random = new Random();
        this.x = random.nextInt(10); // 0 to 9
        this.y = random.nextInt(10);
    }

    public boolean check(int x, int y){
        return (this.x == x)&&(this.y == y);
    }
}
