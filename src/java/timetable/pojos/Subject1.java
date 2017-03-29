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
public class Subject1 implements Comparator<Subject1>{
    
    private int id;
    private String name;
    private int no_per_week;
    private boolean is_double;
    private String[] stroked_with;
    private int class_id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNo_per_week() {
        return no_per_week;
    }

    public boolean isIs_double() {
        return is_double;
    }

    public String[] getStroked_with() {
        return stroked_with;
    }

    public int getClass_id() {
        return class_id;
    }

    

    @Override
    public String toString() {
        return "Subject1{" + "id=" + id + ", name=" + name + ", no_per_week=" + no_per_week + ", is_double=" + is_double + ", stroked_with=" + stroked_with + ", class_id=" + class_id + '}';
    }

    public Subject1(int id, String name, int no_per_week, boolean is_double, String[] stroked_with, int class_id) {
        this.id = id;
        this.name = name;
        this.no_per_week = no_per_week;
        this.is_double = is_double;
        this.stroked_with = stroked_with;
        this.class_id = class_id;
    }

    @Override
    public int compare(Subject1 o1, Subject1 o2) {
        return (o1.getNo_per_week() > o2.getNo_per_week()) ? 1 : -1;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Subject1 other = (Subject1) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public Subject1(int id) {
        this.id = id;
    }
    
    
    
    
    
}
