/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.util.ArrayList;
import java.util.List;
import timetable.pojos.Period_Day;
import timetable.pojos.Subject;

/**
 *
 * @author cisco
 */
public class Init {
    List<Subject> subject_List = new ArrayList();
    
    public Init(){
        
        subject_List.add(new Subject("Eng", 5));
        subject_List.add(new Subject("Cre", 3));
        subject_List.add(new Subject("Mat", 5));
        subject_List.add(new Subject("Agr", 4));
        subject_List.add(new Subject("Kis", 5));
        subject_List.add(new Subject("Hist", 3));
        subject_List.add(new Subject("Bio", 4));
        subject_List.add(new Subject("Geo", 3));
        subject_List.add(new Subject("Phy", 4));
        subject_List.add(new Subject("Chem", 4));
        subject_List.add(new Subject("Hsc", 4));
        
        GlobalConstatts.subjects = subject_List;
        
        GlobalConstatts.period_Day_LST = populate_Period_day();
        
    }
    
    //create period_day list
    private static List<Period_Day> populate_Period_day(){
        List<Period_Day> resultList = new ArrayList<>();
        for( String day : GlobalConstatts.days ){
            for( String period : GlobalConstatts.periods ){
                resultList.add(new Period_Day(period, day));
            }
        }
        System.out.println("SIZE:::" + resultList.size() + resultList);
        return resultList;
    }
    
    public static void main(String args[]){
        Init init = new Init();
    }
    
}
