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
public class Period {
    private int id;
    private int p_no;
    private int duration;
    private String start_time;
    private String end_time;
    private boolean is_break;

    public int getId() {
        return id;
    }

    public int getP_no() {
        return p_no;
    }

    public int getDuration() {
        return duration;
    }

    public String getStart_time() {
        return start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public boolean isIs_break() {
        return is_break;
    }

    @Override
    public String toString() {
        return "Period{" + "id=" + id + ", p_no=" + p_no + ", duration=" + duration + ", start_time=" + start_time + ", end_time=" + end_time + ", is_break=" + is_break + '}';
    }

    public Period(int id, int p_no, int duration, String start_time, String end_time, boolean is_break) {
        this.id = id;
        this.p_no = p_no;
        this.duration = duration;
        this.start_time = start_time;
        this.end_time = end_time;
        this.is_break = is_break;
    }
    
    
}
