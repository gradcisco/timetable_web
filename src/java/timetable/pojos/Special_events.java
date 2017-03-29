/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.pojos;

/**
 *
 * @author cisco
 */
public class Special_events {
    private int id;
    private String name;
    private int duration;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Special_events{" + "id=" + id + ", name=" + name + ", duration=" + duration + '}';
    }

    public Special_events(int id, String name, int duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }
    
    
    
}
