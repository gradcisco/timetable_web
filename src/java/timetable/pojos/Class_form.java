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
public class Class_form {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    

    @Override
    public String toString() {
        return "Class_form{" + "id=" + id + ", name=" + name + '}';
    }

    public Class_form(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
}
