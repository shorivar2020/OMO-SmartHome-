import Devices.Device;
import Event.HouseAI;
import Event.EventKitchen;
import Event.EventLivingRoom;
import LivingBeing.Human;
import Maker.*;
import Transport.Bicycle;
import Transport.Car;
import Transport.Ski;
import Transport.Transport;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {

        int Humans_Count = 6;
        int Rooms_Count = 6;
        int Animals_Count = 3;
        int Ski_count = 1;
        int Bicycle_count = 1;
        int Car_count = 1;
        Config home = new Config();
        home.config(6, 6, 3, 1, 1, 1);
        //Config home2 = new Config();
        home.config(12, 12, 6, 2, 2, 2);
        //Config home3 = new Config();
        home.config(24, 24, 12, 4, 4, 4);
        //config(6, 6, 3, 1, 1, 1);
        //HumanMaker hm = new HumanMaker();
        //NOT NEED


    }
}
