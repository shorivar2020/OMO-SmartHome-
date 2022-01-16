package Event;

import Devices.*;
import LivingBeing.Human;
import Maker.Room;

import java.util.Random;
import java.util.ArrayList;

public class EventKitchen {
    Random rand = new Random();
    BrokenDevice broken = new BrokenDevice();
    public void Eating(ArrayList<Human> Humans, Room room){
        String meal;
        Fridge f = (Fridge)(room.getDevices().get(4));
        Microwave m = (Microwave) (room.getDevices().get(5));
        Plate p = (Plate) (room.getDevices().get(6));
        Teapot t = (Teapot) (room.getDevices().get(7));

        for(Human h: Humans) {
            System.out.println("Eating:" + h);
            switch(rand.nextInt(3)){
                case 0:
                    if(f.work()){
                    }else{
                        broken.fix(f, h);
                    }
                    if(f.getSomethingIn().size() != 0){
                        meal = f.removeSomethingIn("Food");
                    }
                    else{
                        Shoping shop = new Shoping();
                        shop.Shoping(f);
                        meal = f.removeSomethingIn("Food");
                    }
                    h.setUse(f);
                    f.addUsers(h);
                    // f.addSomethingIn("Food");
                    if(m.work()){
                        continue;
                    }else{
                        //System.out.println("fix");
                        broken.fix(m, h);
                    }
                    m.addSomethingIn(meal);
                    h.setUse(m);
                    m.addUsers(h);
                    m.removeSomethingIn(meal);
                    m.stop();
                    h.Eating();

                    break;
                case 1:
                    if(f.work()){
                    }else{
                        broken.fix(f, h);
                    }
                    if(f.getSomethingIn().size() != 0){
                        meal = f.removeSomethingIn("Food");
                    }
                    else{
                        Shoping shop = new Shoping();
                        shop.Shoping(f);
                        h.Shopping();
                        meal = f.removeSomethingIn("Food");
                    }
                    h.setUse(f);
                    f.addUsers(h);
//                    System.out.println("QQQQQ" + f.getUsers());
                    // f.addSomethingIn("Food");
                    if(p.work()){
                    }else{
                        broken.fix(p, h);
                    }
                    p.addSomethingOn(meal);
                    h.setUse(p);
                    p.addUsers(h);
                    p.removeSomethingOn(meal);
                    p.stop();
                    h.Eating();
//                    System.out.println("QQQQQ" + p.getUsers());
                    break;
                case 2:
                    if(t.work()){
                    }else{
                        broken.fix(t, h);
                    }
                    h.DrinkTea();
                    h.setUse(t);
                    t.addUsers(h);
                    //System.out.println("TeaTime");
                    t.stop();
                    break;
            }
        }
    }
}
