import Devices.*;
public class Electricity {
    int totalConsume;
    int consumptionBlinds = 20;
    int totalBlinds = 0;
    int consumptionComputer = 40;
    int totalComputer = 0;
    int consumptionConditioning = 70;
    int totalConditioning = 0;
    int consumptionFridge = 50;
    int totalFridge = 0;
    int consumptionHeater = 90;
    int totalHeater = 0;
    int consumptionHousehold = 10;
    int totalHousehold = 0;
    int consumptionIllumination = 40;
    int totalIllumination = 0;
    int consumptionMicrovawe = 50;
    int totalMicrowave = 0;
    int consumptionPlate = 70;
    int totalPlate = 0;
    int consumptionTeapot = 20;
    int totalTeapot = 0;

    public int getConsumptionBlinds() {
        return totalBlinds += consumptionBlinds;
    }

    public int getConsumptionComputer() {
        return totalComputer += consumptionComputer;
    }

    public int getConsumptionConditioning() {
        return totalConditioning += consumptionConditioning;
    }

    public int getConsumptionFridge() {
        return totalFridge += consumptionFridge;
    }

    public int getConsumptionHeater() {
        return totalHeater += consumptionHeater;
    }

    public int getConsumptionHousehold() {
        return totalHousehold += consumptionHousehold;
    }

    public int getConsumptionIllumination() {
        return totalIllumination += consumptionIllumination;
    }

    public int getConsumptionMicrovawe() {
        return totalMicrowave += consumptionMicrovawe;
    }

    public int getConsumptionPlate() {
        return totalPlate += consumptionPlate;
    }

    public int getConsumptionTeapot() {
        return totalTeapot += consumptionTeapot;
    }
}