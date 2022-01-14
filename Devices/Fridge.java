package Devices;

import java.util.ArrayList;

public class Fridge extends Device {
    static int count = 0;
    int consumptionElectricity = 50;
    int consumptionFunctionality = 5;
    private int functionality = 100;
    private String documentation = "Documentation of Fridge";
    boolean deviceState = true;
    private int buying = 0;
    private int cost = 5000;
    ArrayList<String> somethingIn = new ArrayList<>();

    public String getDocumentation(){
        return documentation;
    }

    public int getElectricity() {
        return consumptionElectricity*count;
    }

    public int getConsumptionFunctionality() {
        return functionality;
    }

    public void fixing(){
        functionality = 100;
    }

    public void buyNew(){
        functionality = 100;
        buying++;
    }

    public int getMoney(){
        return buying*cost;
    }

    public boolean work(){
        if(this.functionality != 0){
            deviceState = true;
            count++;
            functionality = functionality - consumptionFunctionality*count;
            return true;
        }
        else{
            deviceState = false;
            return false;
        }
    }

    public boolean stop(){
        deviceState = false;
        return false;
    }

    public ArrayList<String> getSomethingIn() {
        return somethingIn;
    }

    public String addSomethingIn(String somethingIn) {
        this.somethingIn.add(somethingIn);
        //System.out.println("In fridge "+somethingIn);
        return somethingIn;
    }

    public String removeSomethingIn(String somethingIn) {
        this.somethingIn.remove(somethingIn);
        //System.out.println("In out " +somethingIn);
        return somethingIn;
    }

    public String getDeviceName(){
        return "Fridge";
    }
}