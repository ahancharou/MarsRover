package NASA;

import Aliens.Scrap;

public class NasaRover implements RoverI {

    private Scrap alienScrap = new Scrap();

    private int currentX =startX;
    private int currentY =startY;

    public boolean move (int x, int y) {
        boolean found = false;

        do {
            if (!reachedX(x)) {
                if (currentX > x) {
                    currentX--;

                } else {
                    currentX++;
                }

                found = alienScrap.check(currentX, currentY);
                if (found) {
                    return found;
                }
            }

            if (!reachedY(y)) {
                if (currentY > y) {
                    currentY--;
                } else {
                    currentY++;
                }

                found = alienScrap.check(currentX, currentY);
                if (found) {
                    return found;
                }
            }
        } while (!(reachedX(x)&&(reachedY(y))));
        return false;
    }

    private boolean reachedX(int x){
        return x==currentX;
    }

    private boolean reachedY (int y){
        return y==currentY;
    }

    public int[] getCoordinates () {
        int[] coordinats = {currentX,currentY};
        return coordinats;
    }
}
