package Maker;

import Devices.Device;
import LivingBeing.Animal;
import LivingBeing.Human;
import Transport.Transport;

public class HumanMaker extends Human{

    public void useDevice(Human human, Device device){
        human.getUse().add(device);
    }

    public void withAnimal(Human human, Animal animal){
        human.getWithAnimal().add(animal);
    }

    public void outHome(Human human, Transport transport){
        human.getUseTransport().add(transport);
        human.setInArea(false);
    }

    public void backHome(Human human, Transport transport){
        human.getUseTransport().remove(transport);
        human.setInArea(true);
    }

    public void setFather(Human human, Area home){

        for (House f : home.getArea()){
           // f.addHuman(human);
            for (Room r : f.getRooms()){
                //r.addHuman(human);
                for(Device d : r.getDevices()){
                    d.addUsers(human);
                }
            }
        }
    }

    public void inRoom(Human human, Room room){
        human.setWhatRoom(room);
    }

}
