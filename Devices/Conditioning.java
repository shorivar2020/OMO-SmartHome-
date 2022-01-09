package Devices;

public class Conditioning extends Device{
    static int Count = 0;

    public Conditioning(){
        Count++;
    }
    public String getDeviceName(){
        device = "Conditioning";
    }
}