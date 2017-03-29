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
public class Stream {
    
    private int id;
    private int class_id;
    private String name;

    public int getId() {
        return id;
    }

    public int getClass_id() {
        return class_id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Stream{" + "id=" + id + ", class_id=" + class_id + ", name=" + name + '}';
    }

    public Stream(int id, int class_id, String name) {
        this.id = id;
        this.class_id = class_id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id;
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
        final Stream other = (Stream) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    
    
    
}
