package LivingBeing;

import Maker.Room;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    private List<Human> WithHuman = new ArrayList<>();

    /**
     * @return all Human who play with this animal
     */
    public List<Human> getWithHuman() {
        return WithHuman;
    }

    /**
     * @param human add all human who play with this animal
     */
    public void setWithHuman(Human human) {
        WithHuman.add(human);
    }

}