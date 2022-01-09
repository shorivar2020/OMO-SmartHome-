package Devices;

public class Blinds extends Device{

    static int Count = 0;

    public Blinds(){
        Count++;
    }

    public String getDeviceName(){
        device = "blinds";
    }
}