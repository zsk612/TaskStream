package se.edu.inclass.task;

public class Deadline extends Task {

    public Deadline(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "(Deadline: " + description + ')';
    }

}
