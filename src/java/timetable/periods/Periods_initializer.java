/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.periods;

import java.util.ArrayList;
import java.util.List;
import timetable.days.Days_Initializer;
import timetable.pojos.Day;
import timetable.pojos.Day_period;
import timetable.pojos.Period;

/**
 *
 * @author cisco
 */
public class Periods_initializer {
    
    public Periods_initializer(){
        List<Period> period_list = new ArrayList<>();
        String[] raw_periods = {"11:15 - 11:55","11:55 - 12:35","12:35 - 1:15","1:15 - 2:00","2:00 - 2:40","2:40 - 3:20","3:20 - 4:00"};
    
        String[] periods = {"8:00 - 8:40" , "8:40 - 9:20","9:30 - 10:10","10:10 - 10:50", "11:15 - 11:55","11:55 - 12:35","12:35 - 1:15","2:00 - 2:40","2:40 - 3:20","3:20 - 4:00"};
        
        
        period_list.add(new Period(1, 1, 40, "8:00", "8:40", false));
        period_list.add(new Period(2, 2, 40, "8:40", "9:20", false));
        period_list.add(new Period(3, 3, 40, "9:20", "9:30", true));
        period_list.add(new Period(4, 4, 40, "9:30", "10:10", false));
        period_list.add(new Period(5, 5, 40, "10:10", "10:50", false));
        period_list.add(new Period(1, 1, 40, "10:50", "11:15", true));
        period_list.add(new Period(1, 1, 40, "11:15", "11:55", false));
        period_list.add(new Period(1, 1, 40, "11:55", "12:35", false));
        period_list.add(new Period(1, 1, 40, "12:35", "1:15", false));
        period_list.add(new Period(1, 1, 40, "1:15", "2:00", true));
        period_list.add(new Period(1, 1, 40, "2:00", "2:40", false));
        period_list.add(new Period(1, 1, 40, "2:40", "3:20", false));
        period_list.add(new Period(1, 1, 40, "3:20", "4:00", false));
        
    }
    
    public static List<Period> getPeriods(){
        List<Period> period_list = new ArrayList<>();
         
        period_list.add(new Period(1, 1, 40, "8:00", "8:40", false));
        period_list.add(new Period(2, 2, 40, "8:40", "9:20", false));
        period_list.add(new Period(3, 3, 40, "9:20", "9:30", true));
        period_list.add(new Period(4, 4, 40, "9:30", "10:10", false));
        period_list.add(new Period(5, 5, 40, "10:10", "10:50", false));
        period_list.add(new Period(6, 1, 40, "10:50", "11:15", true));
        period_list.add(new Period(7, 1, 40, "11:15", "11:55", false));
        period_list.add(new Period(8, 1, 40, "11:55", "12:35", false));
        period_list.add(new Period(9, 1, 40, "12:35", "1:15", false));
        period_list.add(new Period(10, 1, 40, "1:15", "2:00", true));
        period_list.add(new Period(11, 1, 40, "2:00", "2:40", false));
        period_list.add(new Period(12, 1, 40, "2:40", "3:20", false));
        period_list.add(new Period(13, 1, 40, "3:20", "4:00", false));
        
        return period_list;
    }
    
    public static List<Period> getPeriodsNotBreaks(){
        List<Period> period_list = new ArrayList<>();
         
        period_list.add(new Period(1, 1, 40, "8:00", "8:40", false));
        period_list.add(new Period(2, 2, 40, "8:40", "9:20", false));
        period_list.add(new Period(4, 4, 40, "9:30", "10:10", false));
        period_list.add(new Period(5, 5, 40, "10:10", "10:50", false));
        period_list.add(new Period(7, 1, 40, "11:15", "11:55", false));
        period_list.add(new Period(8, 1, 40, "11:55", "12:35", false));
        period_list.add(new Period(9, 1, 40, "12:35", "1:15", false));
        period_list.add(new Period(11, 1, 40, "2:00", "2:40", false));
        period_list.add(new Period(12, 1, 40, "2:40", "3:20", false));
        period_list.add(new Period(13, 1, 40, "3:20", "4:00", false));
        
        
        return period_list;
    }
    
    public static List<Day_period> getDay_periods(){
        //initialize periods
        List<Period> period_lists = getPeriodsNotBreaks();
        List<Day> day_lists = Days_Initializer.getDays();
        
        List<Day_period> dayPeriod_lists = new ArrayList<>();
        
        for( Day day : day_lists ){
            for( Period period : period_lists ){
                Day_period day_Period = new Day_period(day.getId(), period.getId());
                dayPeriod_lists.add(day_Period);
            }
        }
        
        return dayPeriod_lists;
    }
    
    public static void main(String args[]){
        List<Day_period> dayPeriod_lists = getDay_periods();
        System.out.println("Size---" + dayPeriod_lists.size());
        System.out.println(dayPeriod_lists.toString());
    }
    
}
