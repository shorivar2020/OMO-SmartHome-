package Devices;

import java.util.ArrayList;

public class Microwave {
    private int electricity = 0;
    private int documentation = 0;
    private int functionality = 100;
    boolean deviceState = true;
    static int count = 0;
    ArrayList<String> somethingIn = new ArrayList<>();

    public Microwave(){
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
        return somethingIn;
    }

    public String addSomethingIn(String somethingIn) {
        this.somethingIn.add(somethingIn);
        //System.out.println("In microwave "+somethingIn);
        return somethingIn;
    }

    public String removeSomethingIn(String somethingIn) {
        this.somethingIn.remove(somethingIn);
        //System.out.println("In out " +somethingIn);
        return somethingIn;
    }

    public String getDeviceName(){
        return "Microwave";
    }
}