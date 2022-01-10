package Devices;

public class Heater extends Device{
    boolean deviceState = 0;
    static int count = 0;

    public useHeater(int electricity, int documentation, int functionallity){
        count++;
        this.electricity = electricity;
        this.documentation = documentation;
        this.functionallity = functionallity - count;
    }
    public void work(){//how wait aaaaaaaaaaaa???
        if(this.deviceState == 0){
            this.On();
        }
        this.deviceState = 1;
    }

    public void stop(){//how wait aaaaaaaaaaaa???
        if(this.deviceState == 1){
            this.Off();
        }
        this.deviceState = 0;
    }

    public String getDeviceName(){
        device = "heater";
    }
}