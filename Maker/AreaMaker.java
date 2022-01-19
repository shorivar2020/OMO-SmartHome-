package Maker;

import LivingBeing.Animal;
import LivingBeing.Human;
import Transport.Bicycle;
import Transport.Car;
import Transport.Ski;

public class AreaMaker {

    private static AreaMaker instance;
    private AreaMaker(){}

    /**
     * Do that area can only one in program by pattern Singleton
     *
     * @return instance of Area.
     */
    public static AreaMaker getInstance(){
        if(instance == null){
            instance = new AreaMaker();
        }
        return instance;
    }

    /**
     * Make new Home with rooms and then add in it Human and Animals.
     * Half of Human add in rooms with device and half in transport rooms with transport.
     * In transport rooms add skis, bicycles and cars
     *
     * @param rooms count of rooms in house
     * @param people count of people in house
     * @param animals count of animal in house
     * @param skis count of skis in house
     * @param bicycles count of bicycles in house
     * @param cars count of cars in house
     * @return Area of home with this configuration
     */
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
        return area;
    }
}
