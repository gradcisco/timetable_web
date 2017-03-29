/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.teachers;

import java.util.ArrayList;
import java.util.List;
import timetable.pojos.Teacher;

/**
 *
 * @author cisco
 */
public class Teacher_initializer {
    
    public Teacher_initializer(){
        List<Teacher> teacher_list = new ArrayList<>();
        
//        //sciences department
//        teacher_list.add(new Teacher(1, "Mr mbaka", "Sciences"));
//        teacher_list.add(new Teacher(2, "Mr nyagah", "Sciences"));
//        teacher_list.add(new Teacher(3, "Mr ndwiga", "Sciences"));
//        teacher_list.add(new Teacher(4, "Mr kimathi", "Sciences"));
//        teacher_list.add(new Teacher(5, "Mr kevin", "Sciences"));
//        
//        //languages
//        teacher_list.add(new Teacher(6, "Mr dubi", "Languages"));
//        teacher_list.add(new Teacher(7, "Mrs mucheke", "Languages"));
//        teacher_list.add(new Teacher(8, "Mr RR", "Languages"));
//        teacher_list.add(new Teacher(9, "Mr mbuba", "Languages"));
//        teacher_list.add(new Teacher(10, "Mr murithi", "Languages"));
//        
//        //Humanities
//         teacher_list.add(new Teacher(11, "Mrs njeru", "Humanities"));
//         teacher_list.add(new Teacher(12, "Mrs micheni", "Humanities"));
//         teacher_list.add(new Teacher(13, "Mr arithi", "Humanities"));
//         teacher_list.add(new Teacher(14, "mr njiru", "Humanities"));
//         
//         //Technicals
//         teacher_list.add(new Teacher(15, "Mrs mbaka", "Technicals"));
//         teacher_list.add(new Teacher(16, "Mrs ngai", "Technicals"));
//         teacher_list.add(new Teacher(17, "Mr ngai", "Technicals"));
//         teacher_list.add(new Teacher(18, "Mr Eg", "Technicals"));
//         teacher_list.add(new Teacher(19, "Mr Cc", "Technicals"));

           teacher_list.add(new Teacher(1, "Miss Karanga c", ""));
           teacher_list.add(new Teacher(2, "Miss Burene", ""));
           teacher_list.add(new Teacher(3, "Mrs Mugendi m", ""));
           teacher_list.add(new Teacher(4, "Mrs Nderi", ""));
           teacher_list.add(new Teacher(5, "Mr Njiru", ""));
           teacher_list.add(new Teacher(6, "Mr Munyi", ""));
           teacher_list.add(new Teacher(7, "Mr Murithi s", ""));
           teacher_list.add(new Teacher(8, "Mrs mugendi c", ""));
           teacher_list.add(new Teacher(9, "Mr mwenda", ""));
           teacher_list.add(new Teacher(10, "Mr Munya", ""));
           teacher_list.add(new Teacher(11, "Miss Njagi p", ""));
           teacher_list.add(new Teacher(12, "Mrs njagi", ""));
           teacher_list.add(new Teacher(13, "Miss Mutegi F", ""));
           teacher_list.add(new Teacher(14, "Miss maingi", ""));
           teacher_list.add(new Teacher(15, "Mrs Nyaga", ""));
    }
    
    public static List<Teacher> getTeachers(){
        List<Teacher> teacher_list = new ArrayList<>();
        
        teacher_list.add(new Teacher(1, "Miss Karanga c", ""));
           teacher_list.add(new Teacher(2, "Miss Burene", ""));
           teacher_list.add(new Teacher(3, "Mrs Mugendi m", ""));
           teacher_list.add(new Teacher(4, "Mrs Nderi", ""));
           teacher_list.add(new Teacher(5, "Mr Njiru", ""));
           teacher_list.add(new Teacher(6, "Mr Munyi", ""));
           teacher_list.add(new Teacher(7, "Mr Murithi s", ""));
           teacher_list.add(new Teacher(8, "Mrs mugendi c", ""));
           teacher_list.add(new Teacher(9, "Mr mwenda", ""));
           teacher_list.add(new Teacher(10, "Mr Munya", ""));
           teacher_list.add(new Teacher(11, "Miss Njagi p", ""));
           teacher_list.add(new Teacher(12, "Mrs njagi", ""));
           teacher_list.add(new Teacher(13, "Miss Mutegi F", ""));
           teacher_list.add(new Teacher(14, "Miss maingi", ""));
           teacher_list.add(new Teacher(15, "Mrs Nyaga", ""));
           
           return teacher_list;
    }
    
}
