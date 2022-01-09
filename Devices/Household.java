package Devices;

public class Household extends Device{
    static int Count = 0;

    public Household(){
        Count++;
    }
    public String getDeviceName(){
        device = "household";
    }
}