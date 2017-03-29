/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.days;

import java.util.ArrayList;
import java.util.List;
import timetable.pojos.Day;

/**
 *
 * @author cisco
 */
public class Days_Initializer {
    
    public Days_Initializer(){
        List<Day> days_list = new ArrayList();
        
        days_list.add(new Day(1, "Mon", 1, 6));
        days_list.add(new Day(2, "Tue", 2, 7));
        days_list.add(new Day(3, "Wed", 3, 8));
        days_list.add(new Day(4, "Thurs", 4, 9));
        days_list.add(new Day(5, "Frid", 5, 10));
                
    }
    
    public static List<Day> getDays(){
         List<Day> days_list = new ArrayList(); 
         
        days_list.add(new Day(1, "Mon", 1, 6));
        days_list.add(new Day(2, "Tue", 2, 7));
        days_list.add(new Day(3, "Wed", 3, 8));
        days_list.add(new Day(4, "Thurs", 4, 9));
        days_list.add(new Day(5, "Frid", 5, 10));
        
        return days_list;
    }
    
}
