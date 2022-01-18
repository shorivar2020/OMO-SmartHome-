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

    public String getDeviceName(){
        return "Fridge";
    }

    @Override
    public int getWater() {
        return 0;
    }
}