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
public class Day {
    private int id;
    private String name;
    private int before_class_id;
    private int after_class_id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBefore_class_id() {
        return before_class_id;
    }

    public int getAfter_class_id() {
        return after_class_id;
    }

    @Override
    public String toString() {
        return "Day{" + "id=" + id + ", name=" + name + ", before_class_id=" + before_class_id + ", after_class_id=" + after_class_id + '}';
    }

    public Day(int id, String name, int before_class_id, int after_class_id) {
        this.id = id;
        this.name = name;
        this.before_class_id = before_class_id;
        this.after_class_id = after_class_id;
    }
    
    
    
}
