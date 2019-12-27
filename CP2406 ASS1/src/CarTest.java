public class CarTest {
    public static void main(String[] args){
        Car car = new Car(0);
        while(car.car_pos < 5){
            car.drive();
            System.out.printf("Car position - %s\n", car.car_pos);
        }
    }
}
