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
    private final int cost = 2000;
    private final String documentation = "Documentation of Teapot";
    boolean deviceState = false;
    private ArrayList<Human> users = new ArrayList<>();

    @Override
    public void On(){
        deviceState = true;
    }
    @Override
    public void Off(){
        deviceState = false;
    }
    @Override
    public void addUsers(Human human){
        users.add(human);
    }
    @Override
    public ArrayList<Human> getUsers() {
        return users;
    }
    @Override
    public String getDocumentation(){
        return documentation;
    }
    @Override
    public int getElectricity() {
        return consumptionElectricity*count;
    }
    @Override
    public int getWater() {
        return consumptionWater*count;
    }
    @Override
    public void fixing(){
        functionality = 100;
    }
    @Override
    public void buyNew(){
        functionality = 100;
        buying++;
    }
    @Override
    public int getMoney(){
        return buying*cost;
    }
    @Override
    public int getFunctionality(){
        return functionality;
    }
    @Override
    public void setFunctionality() {
        count++;
        functionality = functionality - consumptionFunctionality*count;
    }
    @Override
    public String getDeviceName(){
        return "Teapot";
    }
}