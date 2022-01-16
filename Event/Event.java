package Event;

import LivingBeing.Human;
import Maker.Room;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Event{
    ArrayList<String> EventsKitchen = new ArrayList<>();
    ArrayList<String> EventsLiving = new ArrayList<>();
   // public HashMap<ArrayList<String>, HashMap<String, String>> Eating(ArrayList<Human> Humans, Room room){return EventsKitchen;}
  //  public HashMap<ArrayList<String>, HashMap<String, String>> Chilling(ArrayList<Human> Humans, Room room){return EventsLiving;}
    ArrayList<String> source = new ArrayList<>();
    ArrayList<String> purpose = new ArrayList<>();
    public ArrayList<String> source(){
        return source;
    }
    public ArrayList<String> purpose(){
        return purpose;
    }

}
