package Devices;

public class Household extends Device{
    int deviceState = 0;
    public useMicrovawe(int electricity, int documentation, int functionallity, int water){
        count++;
        this.electricity = electricity;
        this.documentation = documentation;
        this.functionallity-count = functionallity;
        this.water = water;
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
        device = "household";
    }
}