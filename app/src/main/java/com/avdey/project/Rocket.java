package com.avdey.project;



public class Rocket {

    private String image;
    private String name;
    private String time;
    private String details;
    private String missompath;

    public Rocket(
            String image,String name, String time, String details, String missompath) {
        this.name = name;
        this.time = time;
        this.details = details;
        this.missompath = missompath;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getMissompath() {
        return missompath;
    }

    public void setMissompath(String missompath) {
        this.missompath = missompath;
    }
}
