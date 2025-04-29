package taskmanagement;

import java.util.*;

public class User {
    private String username;
    private String email;
    private List<Task> tasks;

    public User(String username, String email) {
        if (username == null || email == null || username.isEmpty() || email.isEmpty()) throw new IllegalArgumentException();
        this.username = username;
        this.email = email;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        if (task == null) throw new IllegalArgumentException();
        tasks.add(task);
    }

    public boolean hasTask(String title) {
        return tasks.stream().anyMatch(t -> t.getTitle().equals(title));
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
