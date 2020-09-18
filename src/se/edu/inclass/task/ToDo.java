package se.edu.inclass.task;

public class ToDo extends Task {

    public ToDo(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{ToDo: " + description + '}';
    }

}
