public class Task implements Priority {
    
    private String name;

    private int priority;

    public Task(String name, int priority){
        this.name = name;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int level) {
        this.priority = level;
    }

    public String toString() {
        return "Task " + name + " with " + priority + " priority";
    }
}