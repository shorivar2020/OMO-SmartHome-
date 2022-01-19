package Devices;

import LivingBeing.Human;

import java.util.ArrayList;

public class Fridge extends Device {
    static int count = 0;
    int consumptionElectricity = 50;
    int consumptionFunctionality = 5;
    private int functionality = 0;//Was using where was buying
    private final String documentation = "Documentation of Fridge";
    boolean deviceState = true;
    private int buying = 0;
    private final int cost = 5000;
    ArrayList<String> somethingIn = new ArrayList<>();
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

    public ArrayList<String> getSomethingIn() {
        return somethingIn;
    }

    public void addSomethingIn(String somethingIn) {
        this.somethingIn.add(somethingIn);
    }

    public String removeSomethingIn(String somethingIn) {
        this.somethingIn.remove(somethingIn);
        return somethingIn;
    }
    @Override
    public String getDeviceName(){
        return "Fridge";
    }

    @Override
    public int getWater() {
        return 0;
    }
}