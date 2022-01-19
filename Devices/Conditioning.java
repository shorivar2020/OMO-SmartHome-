package Devices;

import LivingBeing.Human;

import java.util.ArrayList;

public class Conditioning extends Device {
    static int count = 0;
    int consumptionElectricity = 70;
    int consumptionFunctionality = 14;
    private int functionality = 100;
    private final String documentation = "Documentation of Conditioning";
    boolean deviceState = false;
    private int buying = 0;
    private final int cost = 7000;
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
        return "Conditioning";
    }

    @Override
    public int getWater() {
        return 0;
    }
}