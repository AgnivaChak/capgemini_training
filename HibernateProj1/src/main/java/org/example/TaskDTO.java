package org.example;

public class TaskDTO {
    private int id;
    private String task;
    private String description;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




    //Default Constructor
    public TaskDTO(){

    }

    @Override
    public String toString() {
        return "TaskDTO{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public TaskDTO(int id, String task, String description){
        this.id = id;
        this.task = task;
        this.description = description;
    }

}