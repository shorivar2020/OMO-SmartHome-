package LivingBeing;

import Devices.Device;
import Event.BrokenDevice;
import Transport.Transport;


import java.util.ArrayList;
import java.util.Random;

public class Human {
    Random rand = new Random();
    private ArrayList<Device> Use = new ArrayList<>();
    private ArrayList<Transport> UseTransport = new ArrayList<>();
    private ArrayList<Animal> WithAnimal = new ArrayList<>();
    private ArrayList<String> Doings = new ArrayList<>();

    /**
     * @return all device what use this human
     */
    public ArrayList<Device> getUse() {
        return Use;
    }

    /**
     * @param device add device what use this human
     */
    public void setUse(Device device) {
        Use.add(device);
    }

    /**
     * @return all transport what use this human
     */
    public ArrayList<Transport> getUseTransport() {
        return UseTransport;
    }

    /**
     * @param transport add transport what use this human
     */
    public void setUseTransport(Transport transport) {
        UseTransport.add(transport);
    }

    /**
     * @return all animas who play with this human
     */
    public ArrayList<Animal> getWithAnimal() {
        return WithAnimal;
    }

    /**
     * @param animal add animals who play with this human
     */
    public void setWithAnimal(Animal animal) {
        WithAnimal.add(animal);
    }

    public void Shopping(){
        Doings.add("SHOPPING");
    }

    public void Eating(){
        Doings.add("EATING");
    }

    public void Waiting(){
        Doings.add("WAITING");
    }

    public void DrinkTea(){
        Doings.add("DRINK_TEA");
    }

    /**
     * Human find documentation whit probability 1/4 and 3/4 not find
     *
     * @return true if found, false if not find
     */
    public boolean Find(){
        Doings.add("FIND_DOCUMENTATION");
        switch(rand.nextInt(4)){
            case 0:
                Doings.add("FIND_DOCUMENTATION");
                return true;
            case 1:
                Doings.add("NOT_FIND_DOCUMENTATION");
                return false;
            case 2:
                Doings.add("NOT_FIND");
                return false;
            case 3:
                Doings.add("FORGET_DOCUMENTATION");
                return false;
        }
        return false;
    }
    public void PlayComputerGames(){
        Doings.add("PLAY_COMPUTER_GAMES");
    }

    public void Sleeping(){
        Doings.add("SLEEPING");
    }

    /**
     * @return all what do humans
     */
    public ArrayList<String> getDoings() {
        return Doings;
    }

    /**
     * Send notify about broken device to human
     *
     * @param d - device that was broken
     * @param h - h who was notified and then fix device
     */
    public void getNotify(Device d, Human h){
        BrokenDevice broken = new BrokenDevice();
        broken.fix(d, h);
        Doings.add("GetNotifyAboutFix");
    }
}