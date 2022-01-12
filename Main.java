import Maker.Area;
import Maker.AreaMaker;

public class Main {
    public static void main(String[] args)
    {
        AreaMaker make = new AreaMaker();
        Area home = make.newHome(6, 6, 5);

        /////////////////////////////////////////////////////
//        Random rand = new Random();
//        ArrayList<List<String>> Events = new ArrayList<>();
//        List<String> ListEvent;
//        DATETIME day = new DATETIME();
//        for(int i = 0; i<=10; i++){
//            switch (rand.nextInt(3)) {
//                case 0:
//                    ListEvent = day.ListEvents("HOT", 12);
//                    break;
//                case 1:
//                    ListEvent = day.ListEvents("HOT", 0);
//                    break;
//
//                case 2:
//                    ListEvent = day.ListEvents("COLD", 15);
//                    break;
//                case 3:
//                    ListEvent = day.ListEvents("COLD", 21);
//                    break;
//                default:
//                    ListEvent = day.ListEvents("HOT", 12);
//                    System.out.println("default Error Main");
//            }
//            Events.add(ListEvent);
//        }
//        System.out.println("Report about Events "+Events);
        //Make house + take DATETIME
        //DO Event
    }
}