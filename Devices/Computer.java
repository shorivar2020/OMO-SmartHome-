package Devices;

public class Computer extends Device{
    static int Count = 0;

    public Computer(){
        Count++;
    }
    public String getDeviceName(){
        device = "Computer";
    }
}