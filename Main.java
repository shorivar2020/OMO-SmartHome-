public class Main {
    public static void main(){
        //private List<Event> EventList = new ArrayList<>();
        System.out.println("AAA");
        DATETIME day;
        for(int i = 0; i<=10; i++){
            switch (rand.nextInt(3)){
                case 0:
                    day = new DATETIME("HOT", "DAY");
                    System.out.println("HD");
                    break;
                case 1:
                    day = new DATETIME("HOT", "NIGHT");
                    System.out.println("HN");
                    break;
                case 2:
                    day = new DATETIME("COLD", "DAY");
                    System.out.println("CD");
                    break;
                case 3:
                    day = new DATETIME("COLD", "NIGHT");
                    System.out.println("CN");
                    break;
            }
            List ListEvent = day.EventList();
            System.out.println("The List is "+ListEvent);
        }
        //Make house + take DATETIME
        //DO Event
    }
}