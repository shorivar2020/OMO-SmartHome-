package Devices;

public class Teapot extends Device{
    int deviceState = 0;
    static int count = 0;

    public Teapot(int electricity, int documentation, int functionallity, int water){
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
        device = "plate";
    }
}
