//package Devices;
//
//public class Fridge extends Device{
//    boolean deviceState = 1;
//    static int count = 0;
//    List<Something> somethingIn = new ArrayList<>();
//
//    public useFridge(int electricity, int documentation, int functionallity){
//        count++;
//        this.electricity = electricity;
//        this.documentation = documentation;
//        this.functionallity = functionallity - count;
//    }
//    public boolean work(){
//        if(this.functionallity != 0){
//            return 1;
//        }
//        else{
//            return 0;
//        }
//    }
//
//    public boolean stop(){
//        return 0;
//    }
//
//    public int getSomethingIn() {
//        return somethingIn;
//    }
//
//    public int addSomethingIn(SomethingIn somethingIn) {
//        this.somethingIn.add(somethingIn);
//    }
//
//    public int removeSomethingIn(SomethingIn somethingIn) {
//        this.somethingIn.remove(somethingIn);
//    }
//
//    public String getDeviceName(){
//        device = "Fridge";
//    }
//}