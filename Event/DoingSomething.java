package Event;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DoingSomething{
    Random rand = new Random();
    public ArrayList<String> Work(){
        ArrayList<String> work = new ArrayList<>();
        System.out.println("Work");
        return work;
    }
    public ArrayList<String> Chill(){
        ArrayList<String> chill = new ArrayList<>();
        System.out.println("Chill");
        Eating eat = new Eating();
        switch (rand.nextInt(4)) {
            case 0:
                chill.add("Ski/Bicycle");
                // case Ski/Bicycle //not night
                break;
            case 1:
                chill.add("DrinkTea");
                // case DrinkTea (Teapot)
                break;
            case 2:
                chill.add("Computer");
                // cas Computer games (Computer)
                break;
            case 3:
                chill.add("Eating");
                switch(rand.nextInt(2)){
                    case 0:
                        eat.Fast();
                        break;
                    case 1:
                        eat.Slow();
                        break;
                }
                // case Cooking (Plate, Fridge) Event Eating
                break;
        }
        return chill;
    }
    //System.out.println("Work");
    //rand
    //work computer
    //use Car

    //System.out.println("Chill");
    //int flag = 0;
    //random (4)




}