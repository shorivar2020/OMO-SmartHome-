package Devices;

public class Fridge extends Device{
    static int Count = 0;

    public Fridge(){
        Count++;
    }
    public String getDeviceName(){
        device = "Fridge";
    }
}