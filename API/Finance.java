//when fix by new -1000 money
import Devices.*;
public class Finance{
    int totalConsume;
    int consumptionBlinds = 2000;
    int totalBlinds = 0;
    int consumptionComputer = 4000;
    int totalComputer = 0;
    int consumptionConditioning = 7000;
    int totalConditioning = 0;
    int consumptionFridge = 5000;
    int totalFridge = 0;
    int consumptionHeater = 9000;
    int totalHeater = 0;
    int consumptionIllumination = 4000;
    int totalIllumination = 0;
    int consumptionMicrovawe = 5000;
    int totalMicrowave = 0;
    int consumptionPlate = 7000;
    int totalPlate = 0;
    int consumptionTeapot = 2000;
    int totalTeapot = 0;

    public int payConsumptionBlinds() {
        return totalBlinds += consumptionBlinds;
    }

    public int payConsumptionComputer() {
        return totalComputer += consumptionComputer;
    }

    public int payConsumptionConditioning() {
        return totalConditioning += consumptionConditioning;
    }

    public int payConsumptionFridge() {
        return totalFridge += consumptionFridge;
    }

    public int payConsumptionHeater() {
        return totalHeater += consumptionHeater;
    }

    public int payConsumptionIllumination() {
        return totalIllumination += consumptionIllumination;
    }

    public int payConsumptionMicrovawe() {
        return totalMicrowave += consumptionMicrovawe;
    }

    public int payConsumptionPlate() {
        return totalPlate += consumptionPlate;
    }

    public int payConsumptionTeapot() {
        return totalTeapot += consumptionTeapot;
    }
