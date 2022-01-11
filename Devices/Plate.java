package Devices;

import java.util.ArrayList;

public class Plate {
    private int electricity = 0;
    private int documentation = 0;
    private int functionality = 100;
    boolean deviceState = true;
    static int count = 0;
    ArrayList<String> somethingOn = new ArrayList<>();

    public Plate(){
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

    public ArrayList<String> getSomethingIn() {
        return somethingOn;
    }

    public String addSomethingOn(String somethingIn) {
        this.somethingOn.add(somethingIn);
        //System.out.println("On plate "+somethingIn);
        return somethingIn;
    }

    public String removeSomethingOn(String somethingIn) {
        this.somethingOn.remove(somethingIn);
        //System.out.println("In out " +somethingIn);
        return somethingIn;
    }

    public String getDeviceName(){
        return "Plate";
    }
}