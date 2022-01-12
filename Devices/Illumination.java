package Devices;

public class Illumination extends Device {
    private int electricity = 0;
    private int documentation = 0;
    private int functionality = 100;
    boolean deviceState = true;
    static int count = 0;

    public Illumination(){
        count++;
        this.electricity = electricity + count;
        this.documentation = documentation;
        this.functionality = functionality - count;
    }
    public boolean work(){
        if(this.functionality != 0){
            deviceState = true;
            return true;
        }
        else{
            deviceState = false;
            return false;
        }
    }

    public boolean stop(){
        deviceState = false;
        return false;
    }

    public String getDeviceName(){
        return "Illumination";
    }
}