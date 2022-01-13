package Maker;

import Devices.Device;
import Devices.FabriceDevice;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class RoomMaker {
    Random rand = new Random();
    private ArrayList<String> dev = new ArrayList<>();
    public Room newRoom(){
        Room room = new Room();

        FabriceDevice f = new FabriceDevice();
        switch (rand.nextInt(2)) {
            case 0:
                room.addName("Kitchen");
                dev.add("FRIDGE");
                dev.add("MICROWAVE");
                dev.add("PLATE");
                dev.add("TEAPOT");
                dev.add("HEATER");
                dev.add("ILLUMINATION");
                dev.add("CONDITIONING");
                dev.add("BLINDS");
                break;
            case 1:
                room.addName("LivingRoom");
                dev.add("COMPUTER");
                dev.add("HEATER");
                dev.add("ILLUMINATION");
                dev.add("CONDITIONING");
                dev.add("BLINDS");
                break;
        }
        Device device = null;
        ListIterator<String> listIterator = dev.listIterator();
        while (listIterator.hasNext()){
            device = f.createDevice(listIterator.next());
            room.addDevice(device);
        }
//        System.out.println(room.name);
//        System.out.println(room.getHumans());
//        System.out.println(room.getDevices());
        System.out.println("Made Maker.Room");
        System.out.println(room.name);
        return room;
    }
}
