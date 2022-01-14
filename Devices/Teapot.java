package Devices;

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

    public int getConsumptionFunctionality() {
        return functionality;
    }
    public boolean work(){
        if(this.functionality != 0){
            deviceState = true;
            count++;
            functionality = functionality - consumptionFunctionality*count;
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
        return "Teapot";
    }
}