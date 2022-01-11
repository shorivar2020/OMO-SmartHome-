package API;

class Water {
    int consumptionTeapot = 10;
    int totalTeapot = 0;
    int consumptionHousehold = 90;
    int totalHousehold = 0;

    public int getConsumptionTeapot() {
        return totalTeapot += consumptionTeapot;
    }

    public int getConsumptionHousehold() {
        return totalHousehold += consumptionHousehold;
    }

    public int TotalWater(){
        return totalHousehold+totalTeapot;
    }
}