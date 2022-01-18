package Devices;

import LivingBeing.Human;

import java.util.ArrayList;

public class Blinds extends Device {
    static int count = 0;
    private int buying = 0;
    private final int cost = 2000;
    int consumptionElectricity = 20;
    int consumptionFunctionality = 4;
    private int functionality = 100;
    private final String documentation = "Documentation of Blinds";
    boolean deviceState = false;
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
        return "Blinds";
    }

    public int getWater() {
        return 0;
    }
}