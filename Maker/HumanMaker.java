//package Maker;
//
//import Devices.Device;
//import LivingBeing.Animal;
//import LivingBeing.Human;
//import Transport.Transport;
//
//public class HumanMaker extends Human{
//
//    public void useDevice(Human human, Device device){
//        human.getUse().add(device);
//    }
//
//    public void withAnimal(Human human, Animal animal){
//        human.getWithAnimal().add(animal);
//    }
//
//    public void outHome(Human human, Transport transport){
//        human.getUseTransport().add(transport);
//        human.setInArea(false);
//    }
//
//    public void backHome(Human human, Transport transport){
//        human.getUseTransport().remove(transport);
//        human.setInArea(true);
//    }
//
//    public void inRoom(Human human, Room room){
//        human.setWhatRoom(room);
//    }
//
//}
