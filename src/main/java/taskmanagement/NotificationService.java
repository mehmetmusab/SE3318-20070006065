package taskmanagement;

import java.util.*;

public class NotificationService {
    private Map<String, List<String>> userNotifications = new HashMap<>();

    public void sendNotification(User user, String message) {
        if (user == null || message == null) throw new IllegalArgumentException();
        userNotifications.computeIfAbsent(user.getUsername(), k -> new ArrayList<>()).add(message);
    }

    public List<String> getNotifications(User user) {
        return userNotifications.getOrDefault(user.getUsername(), new ArrayList<>());
    }
}
