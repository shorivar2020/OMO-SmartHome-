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

        //for(int i = 0; i<(room.getDevices()).size(); i++){

        // f = (Fridge)(room.getDevices().get(0));
        //System.out.println(f);
        //for(Device d: room.getDevices()){

            //System.out.println((room.getDevices().get(0)));
            //System.out.println(d);
            //if(room.getDevices().get(i).equals("Devices.Fridge")){
//                f = (Fridge)d;

               // System.out.println("FRODGEEEEEEEEEEEEEEE");
            //}
//            if(d.equals("Microwave")){
//                if (d instanceof Microwave) {
//                    System.out.println("MICROVWA");
//                    m = (Microwave)d;
//                }
//            }
//            if(d.equals("Plate")){
//                System.out.println("PLATTTEE");
//                assert d instanceof Plate;
//                p = (Plate)d;
//
//            }if(d.equals("Teapot")){
//                System.out.println("TEAAAAAAAAAAAAAAAAAAAAA");
//                assert d instanceof Teapot;
//                t = (Teapot)d;
//
//            }
       // }

        for(Human h: Humans) {
            System.out.println("Eating:" + h);
            switch(rand.nextInt(3)){
                case 0:
                    if(f.work()){
                        continue;
                    }else{
                        broken.fix(f, h);
                    }
                    meal = f.removeSomethingIn("Food");
                    h.setUse(f);
                    f.addUsers(h);
                   // f.addSomethingIn("Food");
                    if(m.work()){
                        continue;
                    }else{
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
                        continue;
                    }else{
                        broken.fix(f, h);
                    }
                    meal = f.removeSomethingIn("Food");
                    h.setUse(f);
                    f.addUsers(h);
                    // f.addSomethingIn("Food");
                    if(p.work()){
                        continue;
                    }else{
                        broken.fix(p, h);
                    }
                    p.addSomethingOn(meal);
                    h.setUse(p);
                    p.addUsers(h);
                    p.removeSomethingOn(meal);
                    p.stop();
                    h.Eating();
                    break;
                case 2:
                    if(t.work()){
                        continue;
                    }else{
                        broken.fix(t, h);
                    }
                    h.DrinkTea();
                    h.setUse(t);
                    t.addUsers(h);
                    t.stop();
                    break;
            }
       }
    }
}
