package NASA;

public interface RoverI {

    int startX = 0;
    int startY = 0;

    public boolean move (int x, int y);

    public int[] getCoordinates();
}
