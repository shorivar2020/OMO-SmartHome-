package Maker;

import java.util.ArrayList;

public class Area {
    ArrayList<House> area = new ArrayList<>();

    /**
     * @return this area
     */
    public ArrayList<House> getArea() {
        return area;
    }

    /**
     * @param house - create new house in are
     */
    public void addHouse(House house) {
        this.area.add(house);
    }
}