package com.example.projectclass;

public class Project {
    String name;
    String description;

    public Project() {

    }

    public Project(String name) {

        this.name = name;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public void elevatorPitch(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String setDescription(String description) {
        this.description = description;
        return  description;
    }
}
