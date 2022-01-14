package Devices;

public class Illumination extends Device {
    static int count = 0;
    int consumptionElectricity = 40;
    int consumptionFunctionality = 8;
    private int functionality = 100;
    private String documentation = "Documentation of Illumination";
    boolean deviceState = true;
    private int buying = 0;
    private int cost = 4000;

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
        return "Illumination";
    }
}