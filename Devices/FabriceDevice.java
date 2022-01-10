public enum DeviceType {
    BLINDS,
    COMPUTER,
    CONDITIONING,
    FRIDGE,
    HEATER,
    ILLUMINATION,
    MICROVAWE,
    PLATE,
    TEAPOT
}

public class DeviceFactory {
    public Device createDevice(DeviceType type){
        Device device = null;

        switch (type){
            case BLINDS:
                device = new Blinds(electricity, documentation, functionallity);
                break;
            case COMPUTER:
                device = new Computer(electricity, documentation, functionallity);
                break;
            case CONDITIONING:
                device = new Conditioning(electricity, documentation, functionallity);
            case FRIDGE:
                device = new Fridge(electricity, documentation, functionallity);
                break;
            case HEATER:
                device = new Heater(electricity, documentation, functionallity);
                break;
            case ILLUMINATION:
                device = new Illumination(electricity, documentation, functionallity);
                break;
            case MICROVAWE:
                device = new microvawe(electricity, documentation, functionallity);
                break;
            case PLATE:
                device = new plate(electricity, documentation, functionallity);
                break;
            case TEAPOT:
                device = new teapot(electricity, documentation, functionallity, water);
                break;
        }
        return device;
    }
}