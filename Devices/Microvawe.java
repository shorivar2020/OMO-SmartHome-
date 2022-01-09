package Devices;

public class Microvawe extends Device{
    static int Count = 0;

    public Microvawe(){
        Count++;
    }
    public String getDeviceName(){
        device = "microvawe";
    }
}