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
                device = new Blinds();
                break;
            case COMPUTER:
                device = new Computer();
                break;
            case CONDITIONING:
                device = new Conditioning();
            case FRIDGE:
                device = new Fridge();
                break;
            case HEATER:
                device = new Heater();
                break;
            case ILLUMINATION:
                device = new Illumination();
                break;
            case MICROVAWE:
                device = new microvawe();
                break;
            case PLATE:
                device = new plate();
                break;
            case TEAPOT:
                device = new teapot();
                break;
        }
        return device;
    }
}