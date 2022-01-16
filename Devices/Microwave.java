package Devices;

import LivingBeing.Human;

import java.util.ArrayList;

public class Microwave extends Device {
    static int count = 0;
    int consumptionElectricity = 50;
    int consumptionFunctionality = 100;//Very bad microwave
    private int functionality = 0;//Was using where was buying
    private String documentation = "Documentation of Microwave";
    boolean deviceState = false;
    private int buying = 0;
    private int cost = 5000;
    ArrayList<String> somethingIn = new ArrayList<>();
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
        System.out.println("BUYING");
    }

    public int getMoney(){
        return buying*cost;
    }

    public boolean work(){
        if(this.functionality != 0){
            count++;
            functionality = functionality - consumptionFunctionality*count;
            deviceState = true;
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
    public ArrayList<String> getSomethingIn() {
        return somethingIn;
    }

    public String addSomethingIn(String somethingIn) {
        this.somethingIn.add(somethingIn);
        //System.out.println("In microwave "+somethingIn);
        return somethingIn;
    }

    public String removeSomethingIn(String somethingIn) {
        this.somethingIn.remove(somethingIn);
        //System.out.println("In out " +somethingIn);
        return somethingIn;
    }

    public String getDeviceName(){
        return "Microwave";
    }

    @Override
    public int getWater() {
        return 0;
    }
}