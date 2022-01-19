import Maker.*;

import java.io.IOException;

public class Config {
    private static Config instance;
        private Config(){}

    /**
     * Config can only one by Singleton patter
     *
     * @return instance of Config
     */
    public static Config getInstance(){
        if(instance == null){
            instance = new Config();
        }
        return instance;
    }

    /**
     * Make new Home by Config
     * Do events by EventManager  in this home
     * Do reports from this home
     *
     * @param make - this AreaMaker
     * @param Rooms_Count - count of room in home by config
     * @param Humans_Count - count of humans in home by config
     * @param Animals_Count - count of animals in home by config
     * @param Ski_count - count of skis in home by config
     * @param Bicycle_count - count of bicycles in home by config
     * @param Car_count - count of cars in home by config
     * @throws IOException - if write in file was false
     */
    public void config(AreaMaker make, int Rooms_Count, int Humans_Count, int Animals_Count, int Ski_count, int Bicycle_count, int Car_count) throws IOException {
        Area home = make.newHome(Rooms_Count, Humans_Count, Animals_Count, Ski_count, Bicycle_count, Car_count);

        EventManager ev = new EventManager();
        ev.eventManager(home);

        Report report = new Report();
        report.report(home, ev);
    }

}