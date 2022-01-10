package Devices;

public class Blinds extends Device{
    static int count = 0;

    public useBlinds(int electricity, int documentation, int functionallity){
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
        device = "blinds";
    }
}