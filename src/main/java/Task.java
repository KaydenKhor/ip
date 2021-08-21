public class Task {
    protected String description;
    protected boolean isDone;
    protected char type;

    public Task (String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon(){
        return (isDone ? "X" : " ");
    }

    public String getFullStatus(){
        return ("[" + this.getStatusIcon() + "] " + this.getDescription() + "\n");
    }

    public String getDescription(){
        return (description);
    }
}