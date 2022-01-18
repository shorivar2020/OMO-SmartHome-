package Devices;

import LivingBeing.Human;

import java.util.ArrayList;

public class Teapot extends Device {
    static int count = 0;
    int consumptionElectricity = 20;
    int consumptionWater = 10;
    int consumptionFunctionality = 4;
    private int functionality = 100;
    private int buying = 0;
    private int cost = 2000;
    private String documentation = "Documentation of Teapot";
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

    public int getWater() {
        return consumptionWater*count;
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

    public int getFunctionality(){
        return functionality;
    }
    public void setFunctionality() {
        count++;
        functionality = functionality - consumptionFunctionality*count;

    }

    public String getDeviceName(){
        return "Teapot";
    }
}