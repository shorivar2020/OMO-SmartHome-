package Devices;

public class Illumination extends Device{
    boolean deviceState = 0;
    static int Count = 0;
    public useIllumination(int electricity, int documentation, int functionallity){
        count++;
        this.electricity = electricity;
        this.documentation = documentation;
        this.functionallity = functionallity - count;
    }
    public boolean work(){
        if(this.functionallity != 0){
            return 1;
        }
        else{
            return 0;
        }
    }

    public boolean stop(){
        return 0;
    }

    public String getDeviceName(){
        device = "illumination";
    }
}