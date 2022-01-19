package Devices;

import LivingBeing.Human;

import java.util.ArrayList;

public class Computer extends Device {
    static int count = 0;
    int consumptionElectricity = 40;
    int consumptionFunctionality = 8;
    private int functionality = 100;
    private final String documentation = "Documentation of Computer";
    boolean deviceState = false;
    private int buying = 0;
    private final int cost = 4000;
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
    public int getFunctionality(){
        return functionality;
    }
    @Override
    public void setFunctionality() {
        count++;
        functionality = functionality - consumptionFunctionality*count;

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
    public String getDeviceName(){
        return "Computer";
    }

    @Override
    public int getWater() {
        return 0;
    }
}