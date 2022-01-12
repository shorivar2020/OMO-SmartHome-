package Devices;

public class FabriceDevice {
    public Device createDevice(String type){
        switch (type){
            case "BLINDS":
                return new Blinds();
            case "COMPUTER":
                return new Computer();
            case "CONDITIONING":
                return new Conditioning();
            case "FRIDGE":
                return new Fridge();
            case "HEATER":
                return new Heater();
            case "ILLUMINATION":
                return new Illumination();
            case "MICROWAVE":
                return new Microwave();
            case "PLATE":
                return new Plate();
            case "TEAPOT":
                return new Teapot();
        }
        return null;
    }

}