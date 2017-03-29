/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.special_events;

import java.util.ArrayList;
import java.util.List;
import timetable.pojos.Special_events;

/**
 *
 * @author cisco
 */
public class Special_events_initializer {
    
    public Special_events_initializer(){
        List<Special_events> special_events_list = new ArrayList<>();
        
        special_events_list.add(new Special_events(1, "Assembly", 40));
        special_events_list.add(new Special_events(2, "Class_meeting", 0));
        special_events_list.add(new Special_events(3, "communal", 0));
        special_events_list.add(new Special_events(4, "Dorm_meeting", 0));
        special_events_list.add(new Special_events(5, "Assembly", 0));
        special_events_list.add(new Special_events(6, "Games", 0));
        special_events_list.add(new Special_events(7, "communal", 0));
        special_events_list.add(new Special_events(8, "clubs", 0));
        special_events_list.add(new Special_events(9, "religion", 0));
        special_events_list.add(new Special_events(10, "Games", 40));
    }
    
}
