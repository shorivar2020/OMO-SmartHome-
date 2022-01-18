package Maker;

import LivingBeing.Animal;
import LivingBeing.Human;
import Transport.Bicycle;
import Transport.Car;
import Transport.Ski;

public class AreaMaker {

    private static AreaMaker instance;
    private AreaMaker(){}
    public static AreaMaker getInstance(){
        if(instance == null){
            instance = new AreaMaker();
        }
        return instance;
    }
    public Area newHome(int rooms, int people, int animals, int skis, int bicycles, int cars){
        Area area = new Area();
        HouseMaker newHouse = new HouseMaker();
        House house = newHouse.newHouse(rooms);
        area.addHouse(house);
        for (int i = 0; i < people/2; i++){
            area.getArea().get(0).getRooms().get(i).addHuman(new Human());
        }
        for (int i = 0; i < animals; i++){
            area.getArea().get(0).getRooms().get(i).addAnimal(new Animal());
        }
        for (int i = 0; i < people/2; i++){
            area.getArea().get(0).getTrRooms().get(0).addHuman(new Human());
        }
        for (int i=0; i<skis; i++){
            area.getArea().get(0).getTrRooms().get(0).addSki(new Ski());
        }
        for(int i=0; i<bicycles; i++){
            area.getArea().get(0).getTrRooms().get(0).addBicycle(new Bicycle());
        }

        for (int i = 0; i<cars; i++){
            area.getArea().get(0).getTrRooms().get(0).addCar(new Car());
        }
        area.addParking(new Parking());
        return area;
    }
}
