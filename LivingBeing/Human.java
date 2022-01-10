package LivingBeing;

import java.util.ArrayList;
import java.util.List;

public class Human {
    Room In;
    InHome;
    private List<Device> useDevices = new ArrayList<>();
    private List<Pet> usePets = new ArrayList<>();
    private List<Transport> useTransports = new ArrayList<>();
    private List<API> getNotifikated = new ArrayList<>();


    public Room getIn() {
        return In;
    }

    public void setIn(Room in) {
        this.In = in;
    }

    public List<API> getGetNotifikated() {
        return getNotifikated;
    }

    public List<Pet> getUsePets() {
        return usePets;
    }

    public List<Device> getUseDevices() {
        return useDevices;
    }

    public List<Transport> getUseTransports() {
        return useTransports;
    }
}