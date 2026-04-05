package Calender.model;

import Calender.util.Validator;

public class Event {
    protected String title;
    protected String date;
    protected String time;

    public Event(String title, String date, String time) {
        if (!Validator.isValidDate(date))
            throw new IllegalArgumentException("Invalid date. Use YYYY-MM-DD");
        if (!Validator.isValidTime(time))
            throw new IllegalArgumentException("Invalid time");
        this.title = title;
        this.date = date;
        this.time = time;
    }

    public String getDate() { return date; }

    public String getTime() { return time; }

    public String getDetails() {
        return title + " on " + date + " at " + time;
    }
}