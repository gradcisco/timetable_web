/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.pojos;

import java.util.Comparator;

/**
 *
 * @author cisco
 */
public class Subject implements Comparator<Subject> {
    private String name;
    private int no_per_week;

    public String getName() {
        return name;
    }

    public int getNo_per_week() {
        return no_per_week;
    }

    public Subject(String name, int no_per_week) {
        this.name = name;
        this.no_per_week = no_per_week;
    }

    @Override
    public String toString() {
        return "Subject{" + "name=" + name + ", no_per_week=" + no_per_week + '}';
    }

    @Override
    public int compare(Subject o1, Subject o2) {
        return (o1.getNo_per_week() > o2.getNo_per_week()) ? 1 : -1;
    }
    
    
    
    
    
}
