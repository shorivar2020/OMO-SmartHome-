package Devices;

public class Household extends Device{
    boolean deviceState = 0;
    public useMicrovawe(int electricity, int documentation, int functionallity, int water){
        count++;
        this.electricity = electricity;
        this.documentation = documentation;
        this.functionallity = functionallity - count;
        this.water = water;
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
        device = "household";
    }
}