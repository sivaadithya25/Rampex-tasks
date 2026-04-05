package Calender.model;

public class ReminderEvent extends Event {
    private String reminderTime;

    public ReminderEvent(String title, String date, String time, String reminderTime) {
        super(title, date, time);
        this.reminderTime = reminderTime;
    }

    @Override
    public String getDetails() {
        return title + " on " + date + " at " + time + " (Reminder: " + reminderTime + ")";
    }
}