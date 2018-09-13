public class Task {
    private int id;
    private String taskContent;
    private boolean isCompleted;

    public Task(int id, String taskContent, boolean isCompleted) {
        this.id = id;
        this.taskContent = taskContent;
        this.isCompleted = isCompleted;
    }

    public int getId() {
        return id;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
