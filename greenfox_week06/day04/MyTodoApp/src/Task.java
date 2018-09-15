import java.time.LocalDateTime;
import java.time.ZoneOffset;

import static java.time.temporal.ChronoUnit.HOURS;

public class Task {
    private int id;
    private String taskContent;
    private boolean isCompleted;
    private LocalDateTime createdAt;
    private LocalDateTime completedAt;
    long duration;

    public Task(int id, String taskContent, boolean isCompleted) {
        this.id = id;
        this.taskContent = taskContent;
        this.isCompleted = isCompleted;
    }

    public Task() {
        return;
    }


    // GETTEREK - SETTEREK

    public long getDuration() {
        return duration;
    }

    public int getId() {
        return id;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public boolean getisCompleted() { return isCompleted; }

    public void setId(int id) {
        this.id = id;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public void setCreatedAt() {
        this.createdAt = LocalDateTime.now((ZoneOffset.UTC));
    }

    public void setComplatedAt() {
        this.completedAt = LocalDateTime.now((ZoneOffset.UTC));
    }


    // TOSTRING LÉTREHOZÁSA

    @Override
    public String toString() {
        if (isCompleted == true) {
            return String.format("%s - [%s] %s in %s", id, getXIfCompleted(), getTaskContent(), getDuration());
        }
        return String.format("%s - [%s] %s", id, getXIfCompleted(), getTaskContent());
    }

    private String getXIfCompleted() {
        if (isCompleted) {
            return "X";
        }

        return " ";
    }

    // TASK ELVÉGZÉSI IDEJÉNEK KIIRATÁSA

    public long completionTime(LocalDateTime first, LocalDateTime second) {
        long duration = first.until(second, HOURS);
        return duration;
    }

}


