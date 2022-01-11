package Transport;

public class Bicycle extends Transport{
    private int documentation = 0;
    private int functionality = 100;
    boolean deviceState = true;
    static int count = 0;
    public Bicycle(){
        transport = "bicycle";
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