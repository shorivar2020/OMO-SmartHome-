package Devices;

public class Plate extends Device{
    static int Count = 0;

    public Plate(){
        Count++;
    }
    public String getDeviceName(){
        device = "plate";
    }
}