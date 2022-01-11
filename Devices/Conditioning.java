//package Devices;
//import API.*;
//public class Conditioning extends Device{
//    boolean deviceState = 0;
//    static int count = 0;
//
//    public useConditioning(int electricity, int documentation, int functionallity){
//        count++;
//        this.electricity = electricity;
//        this.documentation = documentation;
//        this.functionallity = functionallity - count;
//    }
//    public boolean work(){
//        if(this.functionallity != 0){
//            Electricity.getConsumptionConditioning();
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
//    public String getDeviceName(){
//        device = "Conditioning";
//    }
//}