package Maker;

import Devices.Device;
import LivingBeing.Animal;
import LivingBeing.Human;
import Transport.Bicycle;
import Transport.Car;
import Transport.Ski;

import java.util.ArrayList;

public class Parking {
    String name;
    private ArrayList<Human> humans = new ArrayList<>();
    private ArrayList<Bicycle> bicycles = new ArrayList<>();
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Ski> skis = new ArrayList<>();
    int Human_Counter = 0;
    int Transport_Counter = 0;

    public ArrayList<Human> getHumans() {
        return humans;
    }
    public int getHuman_Counter(){
        return Human_Counter;
    }
    public void addHuman(Human human){
        humans.add(human);
        Human_Counter++;
    }

    public void addBicycle(Bicycle bicycle){
        bicycles.add(bicycle);
        Transport_Counter++;
    }

    public  void addCar(Car car){
        cars.add(car);
        Transport_Counter++;
    }

    public void addSki(Ski ski){
        skis.add(ski);
        Transport_Counter++;
    }

    public int getTransport_Counter() {
        return Transport_Counter;
    }

    public ArrayList<Bicycle> getBicycles() {
        return bicycles;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public ArrayList<Ski> getSkis() {
        return skis;
    }
}
