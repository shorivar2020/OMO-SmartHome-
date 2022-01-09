import Transport.Car;
import Transport.Bicycle;

import java.util.ArrayList;
import java.util.List;

public class TransportRoom extends Room{
    List<Transport> transports = new ArrayList<>();

    public TransportRoom(){
        transports.add(new Car());
        transports.add(new Bicycle());
    }

    public List<Transport> getTransports() {
        return transports;
    }
}