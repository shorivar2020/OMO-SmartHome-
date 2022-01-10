package Devices;

public class Computer extends Device{
    int deviceState = 0;
    static int count = 0;

    public Computer(int electricity, int documentation, int functionallity){
        count++;
        this.electricity = electricity;
        this.documentation = documentation;
        this.functionallity-count = functionallity;
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

    public int getSomethingIn() {
        return somethingIn;
    }
    public String getDeviceName(){
        device = "Computer";
    }
}