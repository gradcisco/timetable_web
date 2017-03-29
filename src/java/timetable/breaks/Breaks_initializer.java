/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.breaks;

import java.util.ArrayList;
import java.util.List;
import timetable.pojos.Break;

/**
 *
 * @author cisco
 */
public class Breaks_initializer {
    
    public Breaks_initializer(){
        List<Break> break_list = new ArrayList<>();
        
        break_list.add(new Break(1, "", "", "Before classes", 0, 2));
        break_list.add(new Break(2, "9:20", "9:30", "Short break", 0, 2));
        break_list.add(new Break(3, "10:50", "11:15", "Tea break", 0, 2));
        break_list.add(new Break(4, "1:15", "2:00", "Lunch", 0, 3));
        break_list.add(new Break(5, "", "", "After classes", 0, 3));
    }
    
}
