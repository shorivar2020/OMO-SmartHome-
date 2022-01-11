import API.DATETIME;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("AAA");
        Random rand = new Random();
        ArrayList<List<String>> Events = new ArrayList<>();
        List<String> ListEvent;
        DATETIME day = new DATETIME();
        for(int i = 0; i<=10; i++){
            switch (rand.nextInt(3)) {
                case 0:
                    ListEvent = day.ListEvents("HOT", 12);
                    //System.out.println("HD");
                    break;
                case 1:
                    ListEvent = day.ListEvents("HOT", 0);
                    //System.out.println("HN");
                    break;

                case 2:
                    ListEvent = day.ListEvents("COLD", 15);
                    //System.out.println("CD");
                    break;
                case 3:
                    ListEvent = day.ListEvents("COLD", 21);
                    //System.out.println("CN");
                    break;
                default:
                    ListEvent = day.ListEvents("HOT", 12);
                    System.out.println("default");

            }
            Events.add(ListEvent);

        }
        System.out.println("The List is "+Events);
        //Make house + take DATETIME
        //DO Event
    }
}