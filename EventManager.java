import Devices.Device;
import Event.EventKitchen;
import Event.EventLivingRoom;
import Event.HouseAI;
import LivingBeing.Animal;
import LivingBeing.Human;
import Maker.Area;
import Maker.House;
import Maker.Parking;
import Maker.Room;
import Strategy.DoStrategy;
import Strategy.Strategy;
import Transport.Bicycle;
import Transport.Car;
import Transport.Ski;
import Transport.Transport;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EventManager {
    ArrayList<String> events = new ArrayList<>();
    ArrayList<Device> deviceInEvents = new ArrayList<>();
    ArrayList<Human> SourceEvents = new ArrayList<>();
    ArrayList<Animal> animalsInEvents= new ArrayList<>();
    ArrayList<Transport> transportInEvents = new ArrayList<>();
    public ArrayList<String> EventManager(Area home) throws IOException {

        EventKitchen ek = new EventKitchen();
        EventLivingRoom el = new EventLivingRoom();
        ArrayList<String> rooms = new ArrayList<>();
        Strategy s = new Strategy();
        DoStrategy doStrategy = new DoStrategy();
        HouseAI doing = new HouseAI();
        Human HomeAI = new Human();
        int NumberStrategy;
        for(House h: home.getArea()){
            for(Room r: h.getRooms()){
                if((r.getHumans()).size() == 1){
                    NumberStrategy = s.Strategy();
                    doStrategy.DoStrategy(r, doing, NumberStrategy);
                    for(Device device: doStrategy.getDeviceInEvents()){
                        deviceInEvents.add(device);
                        events.add("SettingsOfHome");
                        animalsInEvents.add(null);
                        SourceEvents.add(null);
                        transportInEvents.add(null);
                    }

                    if (r.getName().equals("Kitchen")) {
                        ek.Eating(r.getHumans(), r);
//                        events.add(food);
                    //    ek.getAnimalsInEvents.

                    } else {
                        el.Chilling(r.getHumans(), r, r.getAnimals());
//                        events.add(food);
//                        setEvents("Play_Computer_Games");

                    }
                    animalsInEvents.addAll(ek.getAnimalsInEvents());
                    events.addAll(ek.getEvents());
                    SourceEvents.addAll(ek.getSourceEvents());
                    deviceInEvents.addAll(ek.getDeviceInEvents());
                    animalsInEvents.addAll(el.getAnimalsInEvents());
                    transportInEvents.addAll(ek.getTransportInEvents());
                    events.addAll(el.getEvents());
                    SourceEvents.addAll(el.getSourceEvents());
                    deviceInEvents.addAll(el.getDeviceInEvents());
                    transportInEvents.addAll(el.getTransportInEvents());
                    rooms.add(r.getName());
                }
            }
            //File file = new File("C://zzz", "tt.txt");
            File file = new File("C:\\Users\\User\\omo-smart-home\\Reports", "EventReport.txt");
            FileWriter writEvent = new FileWriter(file, false);

            writEvent.write("Event     | Source     | Device    | Animal    ");
            writEvent.append('\n');


            int count_wait = 0;
            for(Parking tr: h.getTrRooms()){
                if(tr.getTransport_Counter()< tr.getHuman_Counter()){
                    count_wait = tr.getTransport_Counter() - tr.getHuman_Counter();
                }
                int count_tr = 0;
                for(Ski ski: tr.getSkis()){
                    tr.getHumans().get(count_tr).setUseTransport(ski);
                    events.add("Use_Ski");
                    animalsInEvents.add(null);
                    SourceEvents.addAll(tr.getHumans());
                    deviceInEvents.add(null);
                    transportInEvents.add(ski);
                    count_tr +=1;
                }
                for (Bicycle b: tr.getBicycles()){
                    tr.getHumans().get(count_tr).setUseTransport(b);
                    events.add("Use_Bicycle");
                    animalsInEvents.add(null);

                    SourceEvents.addAll(tr.getHumans());
                    deviceInEvents.add(null);
                    transportInEvents.add(b);
                    count_tr +=1;
                }
                for (Car c: tr.getCars()){
                    tr.getHumans().get(count_tr).setUseTransport(c);
                    animalsInEvents.add(null);
                    events.add("Use_Car");
                    SourceEvents.addAll(tr.getHumans());
                    deviceInEvents.add(null);
                    transportInEvents.add(c);
                    count_tr +=1;

                }
                for(int w=0; w<count_wait; w++){
                    tr.getHumans().get(count_tr).Waiting();
                    animalsInEvents.add(null);
                    SourceEvents.addAll(tr.getHumans());
                    deviceInEvents.add(null);
                    transportInEvents.add(null);
                    events.add("Wait");
                }
            }
            int i = 0;
            int j = 0;
            int z = 0;
            int y = 0;
            for(String event:events){
                writEvent.write("--------------------------------------------------------------------");
                writEvent.append('\n');
                writEvent.write(String.valueOf(event));
                writEvent.write(" | " + String.valueOf(SourceEvents.get(i++)));
                writEvent.write(" | " + String.valueOf(deviceInEvents.get(j++)));
                writEvent.write(" | " + String.valueOf(animalsInEvents.get(z++)));
                //writEvent.write(String.valueOf(getAnimalsInEvents().get(z)));
                writEvent.write(" | " + String.valueOf(transportInEvents.get(y++)));
                writEvent.append('\n');
            }
            writEvent.append('\n');
            writEvent.flush();
            //
        }

        return events;
    }
    public ArrayList<Animal> getAnimalsInEvents() {
        return animalsInEvents;
    }

    public void setAnimalsInEvents(Animal animals) {
        animalsInEvents.add(animals);
    }

    public ArrayList<String> getEvents(){
        return events;
    }

    public ArrayList<Device> getDeviceInEvents() {
        return deviceInEvents;
    }

    public ArrayList<Human> getSourceEvents() {
        return SourceEvents;
    }

    public void setTransportInEvents(Transport transport) {
        transportInEvents.add(transport);
    }

    public ArrayList<Transport> getTransportInEvents() {
        return transportInEvents;
    }

    public void setDeviceInEvents(Device d) {
        deviceInEvents.add(d);
    }

    public void setEvents(String s) {
        events.add(s);
    }

    public void setSourceEvents(Human h) {
        SourceEvents.add(h);
    }
}
