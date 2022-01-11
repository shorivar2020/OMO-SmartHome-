package Transport;

public class Car extends Transport{
    private int documentation = 0;
    private int functionality = 100;
    boolean deviceState = true;
    static int count = 0;
    public Car(){
        transport = "Car";
        count++;
        this.documentation = documentation;
        this.functionality = functionality - count;
    }

    public boolean use(){
        if(this.functionality != 0){
            return true;
        }
        else{
            return false;
        }
    }
}