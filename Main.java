import Maker.*;

import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        AreaMaker make = AreaMaker.getInstance();
        Config c = Config.getInstance();
        Random rand = new Random();
        switch (rand.nextInt(3))
        {
            case 0:
                System.out.println("Small house");
                c.config(make, 6, 6, 3, 1, 1, 1);
                break;
            case 1:
                System.out.println("Medium house");
                c.config(make, 24, 24, 12, 4, 4, 4);
                break;
            case 2:
                System.out.println("Big house");
                c.config(make, 48, 48, 24, 8, 8, 8);
                break;
        }
    }
}
