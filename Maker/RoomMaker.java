package Maker;

import Devices.Device;
import Devices.FabriceDevice;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class RoomMaker {
    Random rand = new Random();
    private ArrayList<String> device = new ArrayList<>();
    public Room newRoom(){
        Room room = new Room();
        FabriceDevice f = new FabriceDevice();
        switch (rand.nextInt(2)) {
            case 0:
                room.addName("Kitchen");
                device.add("ILLUMINATION");
                device.add("BLINDS");
                device.add("HEATER");
                device.add("CONDITIONING");
                device.add("FRIDGE");
                device.add("MICROWAVE");
                device.add("PLATE");
                device.add("TEAPOT");
                break;
            case 1:
                room.addName("LivingRoom");
                device.add("ILLUMINATION");
                device.add("BLINDS");
                device.add("HEATER");
                device.add("CONDITIONING");
                device.add("COMPUTER");
                break;
        }
        Device device;
        ListIterator<String> listIterator = this.device.listIterator();
        while (listIterator.hasNext()){
            device = f.createDevice(listIterator.next());
            room.addDevice(device);
        }
        return room;
    }
}
