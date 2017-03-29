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
public class Break {
    private int id;
    private String start_time;
    private String end_time;
    private String description;
    private int duration;
    private int lessons_before;

    public int getId() {
        return id;
    }

    public String getStart_time() {
        return start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    public int getLessons_before() {
        return lessons_before;
    }

    @Override
    public String toString() {
        return "Break{" + "id=" + id + ", start_time=" + start_time + ", end_time=" + end_time + ", description=" + description + ", duration=" + duration + ", lessons_before=" + lessons_before + '}';
    }

    public Break(int id, String start_time, String end_time, String description, int duration, int lessons_before) {
        this.id = id;
        this.start_time = start_time;
        this.end_time = end_time;
        this.description = description;
        this.duration = duration;
        this.lessons_before = lessons_before;
    }
    
    
    
}
