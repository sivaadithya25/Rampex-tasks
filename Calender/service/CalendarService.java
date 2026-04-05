package Calender.service;

import Calender.model.Event;
import Calender.notification.NotificationService;
import java.util.*;

public class CalendarService {

    private List<Event> events = new ArrayList<>();
    private NotificationService notify = new NotificationService();

    public void addEvent(Event e) {

        // Conflict detection (Extra Feature)
        for (Event ev : events) {
            if (ev.getDate().equals(e.getDate()) && ev.getTime().equals(e.getTime())) {
                System.out.println("❌ Conflict on " + e.getDate() + " at " + e.getTime());
                return;
            }
        }

        events.add(e);
        notify.send("Event Added: " + e.getDetails());
    }

    public void showEvents() {
        System.out.println("\n--- Events ---");
        for (Event e : events) {
            System.out.println(e.getDetails()); // Polymorphism
        }
    }
}