package Devices;

public class Illumination extends Device{
    static int Count = 0;

    public Illumination(){
        Count++;
    }
    public String getDeviceName(){
        device = "plate";
    }
}