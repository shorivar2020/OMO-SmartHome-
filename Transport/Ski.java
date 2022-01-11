package Transport;

import java.util.ArrayList;

public class Ski extends Transport{
    private int documentation = 0;
    private int functionality = 100;
    boolean deviceState = true;
    static int count = 0;

    public Ski(){
        transport = "ski";
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