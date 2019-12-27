public class RoadTest {
    public static void main(String[] args){
        Road road = new Road(0, 6, 2);
        int car_pos_test = 3;
        int car_road_pos = road.roadPosition(car_pos_test);
        int end_pos = road.end_pos;
        System.out.printf("Car x-position - %s\n" +
                          "Car road-position - %s\n" +
                          "Road end x-position - %s", car_pos_test, car_road_pos, end_pos);
        }
    }

