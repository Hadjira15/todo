package com.milanwittpohl.playgroundwebbackend.data;

import org.springframework.data.annotation.Id;

public class ToDo {

    @Id
    private String id;

    private String title;
    private String var;
    private Boolean completed;

    public ToDo(String title, Boolean completed){
        this.title = title;
        this.completed = completed;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getCompleted() {
        return completed;
    }

}
