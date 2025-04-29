package taskmanagement;

import java.util.*;

public class TaskManager {
    public void assignTask(User user, Task task) {
        if (user == null || task == null) throw new IllegalArgumentException();
        user.addTask(task);
    }

    public void removeTask(User user, String title) {
        if (user == null || title == null) throw new IllegalArgumentException();
        user.getAllTasks().removeIf(t -> t.getTitle().equals(title));
    }

    public List<Task> listTasks(User user) {
        if (user == null) throw new IllegalArgumentException();
        return user.getAllTasks();
    }
}
