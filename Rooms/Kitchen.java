package Rooms;

import Devices.Teapot;
import Event.Eating;

import java.util.Random;
import java.util.ArrayList;

public class Kitchen {
    Random rand = new Random();
    Eating eat = new Eating();
    public void Eating(){
        switch(rand.nextInt(3)){
            case 0:
                eat.Fast();
                break;
            case 1:
                eat.Slow();
                break;
            case 2:
                Teapot t = new Teapot();
                t.work();
                //person drink tea
                t.stop();
                break;
        }
    }
}
