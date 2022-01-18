package Strategy;

import Event.HouseAI;
import Maker.Room;

public class DoStrategy {
    public void DoStrategy(Room r, HouseAI doing, int NumberStrategy){
        switch (NumberStrategy){
            case 1:
                doing.Day(r.getHumans(), r);
                doing.DoHotter(r.getHumans(), r);
                break;
            case 2:
                doing.Day(r.getHumans(), r);
                doing.DoColder(r.getHumans(), r);
                break;
            case 3:
                doing.Night(r.getHumans(), r);
                doing.DoHotter(r.getHumans(), r);
                break;
            case 4:
                doing.Night(r.getHumans(), r);
                doing.DoColder(r.getHumans(), r);
                break;
            case 0:
                break;
        }
    }
}
