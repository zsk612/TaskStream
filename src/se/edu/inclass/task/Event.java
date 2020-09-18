package se.edu.inclass.task;

public class Event extends Task {

    public Event(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "[Event: " + description + ']';
    }

}
