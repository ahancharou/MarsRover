package NASA;

public class Coordinate {

    private int value;

    public Coordinate(int start){
        value = start;
    }

    public void step(int target){
        if (!reached(target)) {
            if (value > target){
                value--;
            } else {
                value++;
            }
        }
    }

    public boolean reached (int target) {
        return target==value;
    }

    public int getCoordinate (){
        return value;
    }


}
