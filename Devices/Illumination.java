package Devices;

public class Illumination extends Device{
    int deviceState = 0;
    static int Count = 0;
    public useIllumination(int electricity, int documentation, int functionallity){
        count++;
        this.electricity = electricity;
        this.documentation = documentation;
        this.functionallity = functionallity - count;
    }
    public void work(){//how wait aaaaaaaaaaaa???
        if(this.deviceState == 0){
            this.On();
        }
        this.deviceState = 2;
    }

    public void stop(){//how wait aaaaaaaaaaaa???
        if(this.deviceState == 2){
            this.Off();
        }
        this.deviceState = 0;
    }

    public String getDeviceName(){
        device = "illumination";
    }
}