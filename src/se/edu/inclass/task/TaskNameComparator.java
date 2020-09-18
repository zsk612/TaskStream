package se.edu.inclass.task;

import java.util.Comparator;

public class TaskNameComparator implements Comparator<Task> {

    @Override
    public int compare(Task t1, Task t2) {
        return t1.getDescription().toLowerCase().compareTo(t2.getDescription().toLowerCase());
    }
}
