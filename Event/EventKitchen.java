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
                    h.setUse(f);
                    f.addUsers(h);
                    h.setUse(m);
                    m.addUsers(h);
                    f.work(f);
                    if(f.getSomethingIn().size() != 0){
                        meal = f.removeSomethingIn("Food");
                    }
                    else{
                        Shoping shop = new Shoping();
                        shop.Shoping(f);
                        meal = f.removeSomethingIn("Food");
                    }

                    // f.addSomethingIn("Food");
                    //(m.work(m));
                    m.work(m);
//                    }else{
//                        //System.out.println("fix");
//                        broken.fix(m, h);

                    m.addSomethingIn(meal);

                    m.removeSomethingIn(meal);
                    m.stop();
                    h.Eating();

                    break;
                case 1:
                    h.setUse(f);
                    f.addUsers(h);
                    h.setUse(p);
                    p.addUsers(h);
                    f.work(f);
                    if(f.getSomethingIn().size() != 0){
                        meal = f.removeSomethingIn("Food");
                    }
                    else{
                        Shoping shop = new Shoping();
                        shop.Shoping(f);
                        h.Shopping();
                        meal = f.removeSomethingIn("Food");
                    }

//                    System.out.println("QQQQQ" + f.getUsers());
                    // f.addSomethingIn("Food");
                    p.work(p);
                    p.addSomethingOn(meal);

                    p.removeSomethingOn(meal);
                    p.stop();
                    h.Eating();
//                    System.out.println("QQQQQ" + p.getUsers());
                    break;
                case 2:
                    h.setUse(t);
                    t.addUsers(h);
                    t.work(t);
//                    }else{
//                        broken.fix(t, h);

                    h.DrinkTea();

                    //System.out.println("TeaTime");
                    t.stop();
                    break;
            }
        }
    }
}
