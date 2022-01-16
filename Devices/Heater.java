package Devices;

import LivingBeing.Human;

import java.util.ArrayList;

public class Heater extends Device {
    static int count = 0;
    int consumptionElectricity = 90;
    int consumptionFunctionality = 18;
    private int functionality = 100;
    private String documentation = "Documentation of Heater";
    boolean deviceState = false;
    private int buying = 0;
    private int cost = 9000;
    private ArrayList<Human> users = new ArrayList<>();

    public void addUsers(Human human){
        users.add(human);
    }

    public ArrayList<Human> getUsers() {
        return users;
    }

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

    public String getDeviceName(){
        return "Heater";
    }
}