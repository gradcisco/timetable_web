/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import timetable.pojos.Output;
import timetable.pojos.Period_Day;
import timetable.pojos.Subject;

/**
 *
 * @author cisco
 */
public class FakeGenerator1 {
    
    private static List<List<Output>> days_filtered_lists =  new ArrayList<>();
    
    
    public static void main(String args[]){
        
       allocateLessons();
            
           
            
            
    }
    
    
    public static List<Output> allocateLessons(){
        GlobalConstatts gc = new GlobalConstatts();
        //get required data
        String[] subjects = GlobalConstatts.subjectsArray;
        String[] days = GlobalConstatts.days;
        String[] periods = GlobalConstatts.periods;
        List<Period_Day> day_period_lst = GlobalConstatts.period_Day_LST;
        
        Init init = new Init();
        
        List<Subject> subjectsLst = GlobalConstatts.subjects;
        List<Output> outputList = new ArrayList<>();
        
        //System.out.println(subjectsLst);

        
            Collections.sort(subjectsLst, new Comparator<Subject>() {
            @Override
            public int compare(Subject s1, Subject s2) {
                    return (s1.getNo_per_week() > s2.getNo_per_week()) ? 1 : -1;
                }
            });
            
           // System.out.println(subjectsLst);
            
            //allocate time slots
            for( Subject subject : subjectsLst ){
                int added = 0;
                do{

                    System.out.println("Size:::" + day_period_lst.size());
                    int index = new Random().nextInt(day_period_lst.size());
                    Period_Day period_Day = day_period_lst.get(index);
                    day_period_lst.remove(period_Day);
                    String period = period_Day.getPeriod();
                    String day = period_Day.getDay();
                    
                    outputList.add(new Output(subject.getName(), period, day));
                    
                    added++;
                }while( added < subject.getNo_per_week());
            }
            
             System.out.println("\n\n--------" + outputList + "-------\n\n");
             
             return outputList;
    }
    
    public static Output getOutputwithperiod_day(String period , String day , List<Output> list){
        Output output = new Output();
        
        for( Output oPut : list ){
            if( oPut.getPeriod().equalsIgnoreCase(period) && oPut.getDay().equalsIgnoreCase(day)){
                output = oPut;
                break;
            }
        }
        
        
        return output;
    }
    

    //one period occupied by two lessons same day
    public static  boolean checkCollision( List<Output> outputs){
        boolean result = false;
        List<Output> filtered_Monday_outputs = new ArrayList<>();
        List<Output> filtered_Tuesday_outputs = new ArrayList<>();
        List<Output> filtered_Wedsday_outputs = new ArrayList<>();
        List<Output> filtered_Thursday_outputs = new ArrayList<>();
        List<Output> filtered_Friday_outputs = new ArrayList<>();

            for( Output output : outputs ){
                if( output.getDay().equalsIgnoreCase("Mon")){
                    filtered_Monday_outputs.add(output);
                }
                if( output.getDay().equalsIgnoreCase("Tue")){
                    filtered_Tuesday_outputs.add(output);
                }
                if( output.getDay().equalsIgnoreCase("Wed")){
                    filtered_Wedsday_outputs.add(output);
                }
                if( output.getDay().equalsIgnoreCase("Thurs")){
                    filtered_Thursday_outputs.add(output);
                }
                if( output.getDay().equalsIgnoreCase("Frid")){
                    filtered_Friday_outputs.add(output);
                }
            }
            
            days_filtered_lists.add(filtered_Monday_outputs);
            days_filtered_lists.add(filtered_Monday_outputs);
            days_filtered_lists.add(filtered_Monday_outputs);
            days_filtered_lists.add(filtered_Monday_outputs);
            days_filtered_lists.add(filtered_Monday_outputs);
            
            // System.out.println(days_filtered_lists);
            
//            System.out.println("MON:::" + filtered_Monday_outputs);
//            System.out.println(":::8-9:::" + Collections.frequency(filtered_Monday_outputs, new Output("", "8-9", "Mon", 0)));
//            System.out.println("TUE:::" + filtered_Monday_outputs);
//            System.out.println("WED:::" + filtered_Monday_outputs);
//            System.out.println("THU:::" + filtered_Monday_outputs);
//            System.out.println("FRI:::" + filtered_Monday_outputs);
     
        
        
        return result;
    }
}
