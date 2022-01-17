package Maker;

import LivingBeing.Animal;
import LivingBeing.Human;
import Transport.Bicycle;
import Transport.Car;
import Transport.Ski;

import java.util.Random;

public class AreaMaker {

    //    private static Area instance;
//    private Area(){}
//    public static Area getInstance(){
//        if(instance == null){
//            instance = new Area();
//        }
//        return instance;
    //   }
    private static AreaMaker instance;
    private AreaMaker(){}
    public static AreaMaker getInstance(){
        if(instance == null){
            instance = new AreaMaker();
        }
        return instance;
    }
    public Area newHome(int rooms, int people, int animals, int skis, int bicycles, int cars){
       // Area area = Area.getInstance();
       Area area = new Area();
        HouseMaker newHouse = new HouseMaker();
        Random rand = new Random();
        //DO FLOOR
        House house = newHouse.newHouse(rooms, people);

        area.addHouse(house);
        //DO Human
        for (int i = 0; i < people/2; i++){//v odnu komanatu jeden clovece
            area.getArea().get(0).getRooms().get(i).addHuman(new Human());
            //area.getArea().get(0).getRooms().get(i).getHumans().get(0).setWhatRoom(area.getArea().get(0).getRooms().get(0));
        }
        for (int i = 0; i < animals; i++){//v odnu komanatu jeden zvere
            area.getArea().get(0).getRooms().get(i).addAnimal(new Animal());
            //area.getArea().get(0).getRooms().get(i).getHumans().get(0).setWhatRoom(area.getArea().get(0).getRooms().get(0));
        }
        for (int i = 0; i < people/2; i++){//v  komanatu transporta
            //area.getArea().get(0).getTrRooms().get(i).addHuman(new Human());
            area.getArea().get(0).getTrRooms().get(0).addHuman(new Human());
            //area.getArea().get(0).getRooms().get(i).getHumans().get(0).setWhatRoom(area.getArea().get(0).getRooms().get(0));
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
//        for (int i = 0; i<rooms; i++){
//            System.out.println( "loo" + area.getArea().get(0).getRooms().get(i).getHumans());
//            System.out.println( "noo" + area.getArea().get(0).getRooms().get(0).getName());
//
//        }
        //DO TRANSPORT ROOM
        area.addParking(new Parking());


        return area;
    }
}
