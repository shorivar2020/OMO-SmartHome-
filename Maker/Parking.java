package Maker;

import LivingBeing.Human;
import Transport.Bicycle;
import Transport.Car;
import Transport.Ski;

import java.util.ArrayList;

public class Parking {
    private ArrayList<Human> humans = new ArrayList<>();
    private ArrayList<Bicycle> bicycles = new ArrayList<>();
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Ski> skis = new ArrayList<>();
    int Human_Counter = 0;
    int Transport_Counter = 0;

    /**
     * @return all humans in transport room
     */
    public ArrayList<Human> getHumans() {
        return humans;
    }

    /**
     * @return count of humans
     */
    public int getHuman_Counter(){
        return Human_Counter;
    }

    /**
     * @param human add in transport room and count humans
     */
    public void addHuman(Human human){
        humans.add(human);
        Human_Counter++;
    }

    /**
     * @param bicycle add and count transport
     */
    public void addBicycle(Bicycle bicycle){
        bicycles.add(bicycle);
        Transport_Counter++;
    }

    /**
     * @param car add and count transport
     */
    public  void addCar(Car car){
        cars.add(car);
        Transport_Counter++;
    }

    /**
     * @param ski add and count transport
     */
    public void addSki(Ski ski){
        skis.add(ski);
        Transport_Counter++;
    }

    /**
     * @return count of transport in Parking
     */
    public int getTransport_Counter() {
        return Transport_Counter;
    }

    /**
     * @return all bicycles in Parking
     */
    public ArrayList<Bicycle> getBicycles() {
        return bicycles;
    }

    /**
     * @return all cars in Parking
     */
    public ArrayList<Car> getCars() {
        return cars;
    }

    /**
     * @return all skis in Parking
     */
    public ArrayList<Ski> getSkis() {
        return skis;
    }
}
