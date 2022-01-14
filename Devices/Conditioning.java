package Devices;

public class Conditioning extends Device {
    static int count = 0;
    int consumptionElectricity = 70;
    int consumptionFunctionality = 14;
    private int functionality = 100;
    private String documentation = "Documentation of Conditioning";
    boolean deviceState = false;
    private int buying = 0;
    private int cost = 7000;

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

    public String getDeviceName(){
        return "Conditioning";
    }
}