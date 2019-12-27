import java.util.ArrayList;
import java.util.List;

public class Road {
    int end_pos;
    int length;
    int width;

    public Road(int start_pos, int length, int width){
        int[] car_poss = new int[2];
        car_poss[0] = start_pos;
        car_poss[1] = (start_pos + length) -1;
        end_pos = car_poss[1];
        this.length = length;
        this.width = width;
    }
    public int roadPosition(int car_pos){
        int road_pos;
        if(car_pos < this.length){
            road_pos = car_pos;
        }
        else{
            road_pos = (car_pos - this.length);
        }
        return road_pos;
        }
}

