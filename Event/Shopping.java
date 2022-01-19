package Event;

import Devices.Fridge;

public class Shopping {
    /**
     * If in fridge no food, take food in fridge
     *
     * @param fridge in what add Food
     */
    public void shopping(Fridge fridge){
        fridge.addSomethingIn("Food");
        fridge.addSomethingIn("Food");
        fridge.addSomethingIn("Food");
        fridge.addSomethingIn("Food");
    }
}