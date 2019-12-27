import java.util.Random;

public class TrafficLights {
    String state;
    double chance_signal;
    int pos;
    public TrafficLights(double chance_signal, int pos){
        this.chance_signal = chance_signal;
        this.pos = pos;
    }
    public String lightState(){
        Random rand = new Random();
        float random_selected_num = rand.nextFloat();
        if(random_selected_num < chance_signal){
            state = "red";
        }
        else{
            state = "green";
        }
        return state;
    }
}
