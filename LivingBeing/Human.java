package LivingBeing;

import Devices.Device;
import Transport.Transport;


import java.util.ArrayList;
import java.util.List;

public class Human {
    boolean InHouse;
    private List<Device> useDevices = new ArrayList<>();
    private List<Transport> useTransports = new ArrayList<>();

    public List<Device> getUseDevices() {
        return useDevices;
    }

    public List<Transport> getUseTransports() {
        return useTransports;
    }
}