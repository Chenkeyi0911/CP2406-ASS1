public class Car {
    private int car_length = 2;
    private int car_width = car_length / 2;
    int car_pos = 0;

    public Car(int car_pos) {
        this.car_pos = car_pos;
    }

    public void drive() {
        car_pos++;
    }
} 
