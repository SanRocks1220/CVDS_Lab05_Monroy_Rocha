

package edu.eci.cvds.servlet.model;

public class Todo {

    private int userId;
    private int id;
    private String title;
    private boolean completed;

    public int getUserId(){
        return userId;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }

    public int getId(){
        return id;
    }

    public void setUserId(int id){
        this.id = id;
    }

    public int getTitle(){
        return id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getCompleted(){
        return completed;
    }

    public void setCompleted(boolean completed){
        this.completed = completed;
    }


}