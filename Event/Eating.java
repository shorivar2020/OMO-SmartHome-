package Event;

import Devices.Fridge;
import Devices.Microwave;
import Devices.Plate;

class Eating {
    String meal;
    Fridge f = new Fridge();
    public void Fast() {
        Microwave m = new Microwave();
        f.addSomethingIn("Food");
        meal = f.removeSomethingIn("Food");
        m.addSomethingIn(meal);
        if(m.work()){
            m.removeSomethingIn(meal);
        }
        //Person eat it
    }
    public void Slow() {
        Plate p = new Plate();
        f.addSomethingIn("Food");
        meal = f.removeSomethingIn("Food");
        p.addSomethingOn(meal);
        if(p.work()){
            p.removeSomethingOn(meal);
        }
        //     eat it
    }
}