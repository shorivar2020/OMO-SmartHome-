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

    public void On(){
        deviceState = true;
    }

    public void Off(){
        deviceState = false;
    }

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

    public int getFunctionality(){
        return functionality;
    }
    public void setFunctionality() {
        count++;
        functionality = functionality - consumptionFunctionality*count;

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


    public String getDeviceName(){
        return "Heater";
    }

    @Override
    public int getWater() {
        return 0;
    }
}