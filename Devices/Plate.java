package Devices;

public class Plate extends Device{
    boolean deviceState = 0;
    static int count = 0;
    List<Something> somethingIn = new ArrayList<>();

    public usePlate(int electricity, int documentation, int functionallity){
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

    public int getSomethingIn() {
        return somethingIn;
    }

    public int addSomethingIn(SomethingIn somethingIn) {
        this.somethingIn.add(somethingIn);
    }

    public int removeSomethingIn(SomethingIn somethingIn) {
        this.somethingIn.remove(somethingIn);
    }

    public String getDeviceName(){
        device = "plate";
    }
}