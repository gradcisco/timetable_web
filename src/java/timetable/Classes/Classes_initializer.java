/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.Classes;

import java.util.ArrayList;
import java.util.List;
import timetable.pojos.Class_form;

/**
 *
 * @author cisco
 */
public class Classes_initializer {
    
    public Classes_initializer(){
        List<Class_form> classes_list = new ArrayList<>();
        
        classes_list.add(new Class_form(1, "Form 1"));
        classes_list.add(new Class_form(2, "Form 2"));
        classes_list.add(new Class_form(3, "Form 3"));
        classes_list.add(new Class_form(4, "Form 4"));
    }
    
    public static List<Class_form> getClasses(){
        
        List<Class_form> classes_list = new ArrayList<>();
        
        classes_list.add(new Class_form(1, "Form 1"));
        classes_list.add(new Class_form(2, "Form 2"));
        classes_list.add(new Class_form(3, "Form 3"));
        classes_list.add(new Class_form(4, "Form 4"));
        
        return classes_list;
        
    }
}
