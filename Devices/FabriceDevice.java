//public enum DeviceType {
//    BLINDS,
//    COMPUTER,
//    CONDITIONING,
//    FRIDGE,
//    HEATER,
//    ILLUMINATION,
//    MICROVAWE,
//    PLATE,
//    TEAPOT
//}
//
//public class DeviceFactory {
//    public Device createDevice(DeviceType type){
//        Device device = null;
//
//        switch (type){
//            case BLINDS:
//                device = new useBlinds(electricity, documentation, functionallity);
//                break;
//            case COMPUTER:
//                device = new useComputer(electricity, documentation, functionallity);
//                break;
//            case CONDITIONING:
//                device = new useConditioning(electricity, documentation, functionallity);
//            case FRIDGE:
//                device = new useFridge(electricity, documentation, functionallity);
//                break;
//            case HEATER:
//                device = new useHeater(electricity, documentation, functionallity);
//                break;
//            case ILLUMINATION:
//                device = new useIllumination(electricity, documentation, functionallity);
//                break;
//            case MICROVAWE:
//                device = new useMicrovawe(electricity, documentation, functionallity);
//                break;
//            case PLATE:
//                device = new usePlate(electricity, documentation, functionallity);
//                break;
//            case TEAPOT:
//                device = new useTeapot(electricity, documentation, functionallity, water);
//                break;
//        }
//        return device;
//    }
//}