package taskmanagement;

import java.time.LocalDate;

public class Task {
    private String title;
    private LocalDate dueDate;
    private boolean isCompleted;

    public Task(String title, LocalDate dueDate) {
        if (title == null || title.isEmpty() || dueDate == null) throw new IllegalArgumentException();
        this.title = title;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    public boolean isOverdue() {
        return !isCompleted && dueDate.isBefore(LocalDate.now());
    }

    public void markCompleted() {
        isCompleted = true;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }
}
