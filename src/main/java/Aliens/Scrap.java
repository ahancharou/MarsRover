package Aliens;

import java.util.Random;
public class Scrap {

    private int[] place = {0,0};

    public Scrap() {
        Random random = new Random();
        place[0] = random.nextInt(10); // 0 to 9
        place[1] = random.nextInt(10);
    }

    public boolean check(int[] spot){
        return (place[0]==spot[0]&&place[1]==spot[1]);
    }
}
