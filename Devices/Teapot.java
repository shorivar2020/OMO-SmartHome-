package Devices;

public class Teapot extends Device{
    static int Count = 0;

    public Teapot(){
        Count++;
    }
    public String getDeviceName(){
        device = "plate";
    }
}
