package com.example.wehrdscience;

import androidx.annotation.NonNull;

public class Event {
    private String name;
    private String location;
    private String time;

    public Event(String name, String location, String time) {
        this.name = name;
        this.location = location;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @NonNull
    @Override
    public String toString() {
        return location + " ● " + time;
    }
}