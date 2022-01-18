package Devices;

import LivingBeing.Human;

import java.util.ArrayList;

public class Plate extends Device {
    static int count = 0;
    int consumptionElectricity = 70;
    int consumptionFunctionality = 14;
    private int functionality = 100;
    private String documentation = "Documentation of Plate";
    boolean deviceState = false;
    private int buying = 0;
    private int cost = 7000;
    ArrayList<String> somethingOn = new ArrayList<>();
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
        return somethingOn;
    }

    public String addSomethingOn(String somethingIn) {
        this.somethingOn.add(somethingIn);
        //System.out.println("On plate "+somethingIn);
        return somethingIn;
    }

    public String removeSomethingOn(String somethingIn) {
        this.somethingOn.remove(somethingIn);
        //System.out.println("In out " +somethingIn);
        return somethingIn;
    }

    public String getDeviceName(){
        return "Plate";
    }

    @Override
    public int getWater() {
        return 0;
    }
}