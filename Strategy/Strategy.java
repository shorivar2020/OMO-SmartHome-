package Strategy;

import java.util.Random;

public class Strategy {
    public int Strategy(){
        Random rand = new Random();
        Sensor s = new Sensor();
        switch (rand.nextInt(4)){
            case 0: s.HotDay();
                return 1;
            case 1: s.ColdDay();
                return 2;
            case 2: s.HotNight();
                return 3;
            case 3: s.ColdNight();
                return 4;
        }
        return 0;
    }
}
