package com.example.android.takehomeassignment08_doraj;

public class Project {

    public int name;
    public int level;
    public int time;
    public int photoID;

    public Project(int name, int level, int time, int photoID) {
        this.name = name;
        this.level = level;
        this.time = time;
        this.photoID = photoID;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }
}
