import java.util.Random;

public class Sensor {
    Random rand = new Random();
    public String SensorTemperature(){
        String temperature;
        switch (rand.nextInt(2)) {
            case 0:
                return  "HOT";
            case 1:
                return  "COLD";
            default:
                return  "";
        }
    }
    public int SensorClock(){
        int clock;
        String temperature;
        switch (rand.nextInt(2)) {
            case 0:
                return  12;
            case 1:
                return  1;
            default:
                return  0;
        }
    }
}
