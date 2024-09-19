package task2.Task;

import java.util.ArrayList;
import java.util.Comparator;

public class TaskManager {
    ArrayList<Task> tasks = new ArrayList<>();

    public TaskManager(){
        tasks = new ArrayList<>();
    }

    public void addTask(Task task){
        tasks.add(task);
    }
    public void deleteTask(Task task){
        tasks.remove(task);
    }
    public void sort(){
        tasks.sort(Comparator.comparing(Task::getPriority));
    }
}
