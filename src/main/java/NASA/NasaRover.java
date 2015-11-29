package NASA;

import Aliens.Scrap;

import java.util.ArrayList;
import java.util.List;

public class NasaRover {

    private static final int START_X = 0;
    private static final int START_Y = 0;

    private Scrap alienScrap;
    private List<Coordinate> coordinates;

    public NasaRover (){
        alienScrap = new Scrap();
        coordinates = new ArrayList<Coordinate>();
        coordinates.add(new Coordinate(START_X));
        coordinates.add(new Coordinate(START_Y));
    }

    public boolean move (int[] target) {
        boolean found = false;

        for (int i=0; i!=2; i++){
            int m = target[i];

            while(!coordinates.get(i).reached(m)){
                coordinates.get(i).step(m);
                if (search()){
                    return true;
                }
            }
        }

        return false;
    }

    private boolean search(){
        int[] coordinates = getCoordinates();
        return alienScrap.check(coordinates[0],coordinates[1]);
    }

    public int[] getCoordinates () {
        int[] coordinats = {coordinates.get(0).getCoordinate(),coordinates.get(1).getCoordinate()};
        return coordinats;
    }
}
