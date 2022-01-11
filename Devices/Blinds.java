package Devices;

public class Blinds {
    private int electricity = 0;
    private int documentation = 0;
    private int functionality = 100;
    boolean deviceState = true;
    static int count = 0;

    public Blinds(){
        count++;
        this.electricity = electricity + count;
        this.documentation = documentation;
        this.functionality = functionality - count;
    }
    public boolean work(){
        if(this.functionality != 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean stop(){
        return false;
    }

    public String getDeviceName(){
        return "Blinds";
    }
}