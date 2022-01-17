//import Event.Event;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class EventManager implements EventM {
//    private List<Event> events;
//    private String newsChurch;
//
//    public EventManager() {
//        events = new ArrayList<>();
//    }
//
//    public void setNewsChurch(String news) {
//        this.newsChurch = news;
//        notifyEvent();
//    }
//
//    @Override
//    public void registerEvent(Event event) {
//        events.add(event);
//    }
//
//    @Override
//    public void removeEvent(Event event) {
//        events.remove(event);
//    }
//
//    @Override
//    public void notifyEvent() {
//        for (Event e: events)
//           e.update(newsChurch);
//
//    }
//}