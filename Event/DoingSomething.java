package Event;

import Devices.Blinds;
import Devices.Computer;
import Devices.Illumination;
import Devices.Teapot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DoingSomething{
    Random rand = new Random();
    Illumination i = new Illumination();
    Blinds b = new Blinds();
    public void Night() {
        //System.out.println("Night");
        i.work();
        b.work();
    }
    public ArrayList<String> Work(){
        ArrayList<String> work = new ArrayList<>();
        i.stop();
        b.stop();
        //System.out.println("Work");
        return work;
    }
    public ArrayList<String> Chill(){
        ArrayList<String> chill = new ArrayList<>();
        //System.out.println("Chill");
        i.stop();
        b.stop();

        switch (rand.nextInt(4)) {
            case 0:
                chill.add("Ski/Bicycle");
                // case Ski/Bicycle //not night
                break;
            case 1:
                chill.add("DrinkTea");
                Teapot t = new Teapot();
                t.work();
                //person drink tea
                t.stop();
                break;
            case 2:
                chill.add("Computer");
                Computer c = new Computer();
                c.work();
                //person play computer games
                c.stop();
                break;
            case 3:
                chill.add("Eating");
                Eating eat = new Eating();
                switch(rand.nextInt(2)){
                    case 0:
                        eat.Fast();
                        break;
                    case 1:
                        eat.Slow();
                        break;
                }
                break;
        }
        return chill;
    }
}