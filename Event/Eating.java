package Event;

import Devices.Fridge;
import java.util.ArrayList;
import java.util.List;

class Eating {
    public ArrayList<String> Fast() {
        ArrayList<String> fast = new ArrayList<>();
        String meal;
        System.out.println("Work with Fridge");
        Fridge f = new Fridge();
        meal = f.addSomethingIn("Cheese");
        System.out.println(meal);
        meal = f.removeSomethingIn("Cheese");
        System.out.println(meal);
        //    removeSomething Fridge
        //    work(); Microvawe
        //    remove Microvawe
        //     eat it
        return fast;
    }
    public ArrayList<String> Slow() {
        ArrayList<String> slow = new ArrayList<>();
        //     else if  {
        //    removeSomething Fridge
        //    work(); Plate
        //    remove Plate
        //     eat it
        return slow;
    }
   // System.out.println("Eating");
    //(has(Fast){
    // if has Plate
}