package Devices;

import java.util.ArrayList;
import java.util.List;

public abstract class Device{

    private boolean deviceState; //0-off 1 - on
    private int electricity = 0; //1-...
    private int water = 0; //1-...
    private int documentation = 0; //??
    private int emloyed = 0; //was used
    private int functionallity = 100; //0-100%
    private int somethingIn; //0-no 1-yes
    private List<User> users = new ArrayList<>();

    //Musim vyresit
//    ⦁  Jednotlivá zařízení v domu mají API na ovládání.
//    Zařízení mají stav, který lze měnit pomocí API na jeho ovládání.
//    Akce z API jsou použitelné podle stavu zařízení.
//    Vybraná zařízení mohou mít i obsah - lednice má jídlo, CD přehrávač má CD.
//    ⦁  Spotřebiče mají svojí spotřebu v aktivním stavu, idle stavu, vypnutém stavu
//    ⦁  Jednotlivá zařízení mají API na sběr dat o tomto zařízení.
//    O zařízeních sbíráme data jako spotřeba elektřiny, plynu, vody a funkčnost (klesá lineárně s časem)
//    ⦁  ConsumptionReport: Kolik jednotlivé spotřebiče spotřebovaly elektřiny, plynu, vody.
//    Včetně finančního vyčíslení.
//    ⦁  Při rozbití zařízení musí obyvatel domu prozkoumat dokumentaci k zařízení - najít záruční list, projít manuál
//    na opravu a provést nápravnou akcí (např. Oprava svépomocí, koupě nového atd.).
//    Manuály zabírají mnoho místa a trvá dlouho než je najdete.
//    Hint: Modelujte jako jednoduché akce ...dokumentace je přístupná jako proměnná přímo v zařízení,
//    nicméně se dotahuje až, když je potřeba.

    public void work();
    public void stop();

    public int getDeviceState() {
        return deviceState;
    }

    public int getDocumentation() {
        return documentation;
    }

    public int getElectricity() {
        return electricity;
    }

    public int getWater() {
        return water;
    }

    public int getFunctionallity() {
        return functionallity;
    }

    public int getSomethingIn() {
        return somethingIn;
    }

    public String getDeviceName(){
        return device;
    }
}