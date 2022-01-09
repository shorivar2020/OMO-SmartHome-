package Devices;

public class Heater extends Device{
    static int Count = 0;

    public Heater(){
        Count++;
    }
    public String getDeviceName(){
        device = "heater";
    }
}