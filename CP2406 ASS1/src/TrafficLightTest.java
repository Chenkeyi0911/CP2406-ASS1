public class TrafficLightTest {
    public static void main(String[] args){
        TrafficLights trafficlights = new TrafficLights(0.5, 3);
        int i = 0;
        while(i < 5){
            String light_colour = trafficlights.lightState();
            System.out.printf("Traffic Light x-position - %s\n" +
                              "Light Colour - %s\n\n", trafficlights.pos, light_colour);
            i++;
        }

    }
}

