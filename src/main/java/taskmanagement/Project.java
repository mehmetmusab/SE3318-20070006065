package taskmanagement;

import java.util.*;

public class Project {
    private List<User> users;
    private List<Task> tasks;

    public Project() {
        users = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    public void addUser(User user) {
        if (user == null) throw new IllegalArgumentException();
        users.add(user);
    }

    public void addTask(Task task) {
        if (task == null) throw new IllegalArgumentException();
        tasks.add(task);
    }

    public Task getTaskByTitle(String title) {
        return tasks.stream().filter(t -> t.getTitle().equals(title)).findFirst().orElse(null);
    }
}
