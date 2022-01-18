import Maker.*;

import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        AreaMaker make = AreaMaker.getInstance();
        Config c = Config.getInstance();
        c.config(make, 6, 6, 3, 1, 1, 1);
        c.config(make, 24, 24, 12, 4, 4, 4);
    }
}
