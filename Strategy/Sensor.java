package Strategy;

/**
 * Sensor have methods with different temperature and clock
 */
class Sensor{
    String temperature;
    int clock;
    public void HotDay(){
        temperature = "HOT";
        clock =  12;
    }

    public void ColdDay(){
        temperature = "Cold";
        clock =  12;
    }

    public void HotNight(){
        temperature = "HOT";
        clock =  0;
    }

    public void  ColdNight(){
        temperature = "COLD";
        clock =  0;
    }
}
