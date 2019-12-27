public class Main {

    public static void main(String[] args) {
        Road road_1 = new Road(0, 5, 1);
        Road road_2 = new Road(5, 5, 1);  
        Car car_obj = new Car(0);
        TrafficLights traffic_lights = new TrafficLights(0.5, road_1.end_pos);

        int road_number;
        road_number = 0;
        int road_position;
        while (car_obj.car_pos < (road_1.length + road_2.length)) {
            String traffic_light_state = traffic_lights.lightState();
            road_position = road_1.roadPosition(car_obj.car_pos);
            if (car_obj.car_pos <= road_1.end_pos) {
                road_number = 1; }
            if (car_obj.car_pos > road_1.end_pos) {
                road_number = 2; }
            System.out.printf("Car on the road number %s at x-position:%s, position of road is :%s, Traffic signal is %s now\n", road_number, car_obj.car_pos, road_position, traffic_light_state);
            if ((car_obj.car_pos == (road_1.end_pos - 1)) && traffic_light_state.equals("red")) {
            assert true;
            }
            else{
                car_obj.drive();
            }
        }

    }
}

