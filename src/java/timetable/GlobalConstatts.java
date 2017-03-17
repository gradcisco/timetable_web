/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import com.sun.xml.internal.ws.api.ha.HaInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedSet;
import java.util.TreeSet;
import timetable.pojos.Period_Day;
import timetable.pojos.Subject;

/**
 *
 * @author cisco
 */
public class GlobalConstatts {
   public static  String[] subjectsArray = {"Eng","Kis","Maths","Agr","Business","Hsc","Cre","Hist","Geo","Chem","Bio","Phy"};
    
    public static String[] periods = {"8-9","9-10","10-11","11-12","12-1","1-2","2-3","3-4","4-5"};
    
    public static String[] classes = {"1","2","3","4"};
    
    public static String days[] = {"Mon","Tue","Wed","Thurs","Frid"};
    
    public static String tmp_days[] = {"Mon","Tue","Wed","Thurs","Frid"};
    
    
    
    public static HashMap<String,Integer> lessonsPerWeek = new HashMap<String, Integer>();
    
    public static List<List<String>> output = new ArrayList<>();
    
    public static List<Subject> subjects = new ArrayList<Subject>();
    
    public static List<Period_Day> period_Day_LST = new ArrayList<Period_Day>();
    
    public GlobalConstatts(){
        lessonsPerWeek.put("Eng", 4);
        lessonsPerWeek.put("Kis", 5);
        lessonsPerWeek.put("Maths", 5);
        lessonsPerWeek.put("Agr", 0);
        lessonsPerWeek.put("Business", 4);
        lessonsPerWeek.put("Hsc", 4);
        lessonsPerWeek.put("Cre", 3);
        lessonsPerWeek.put("Hist", 3);
        lessonsPerWeek.put("Geo", 3);
        lessonsPerWeek.put("Chem", 4);
        lessonsPerWeek.put("Bio", 5);
        lessonsPerWeek.put("Phy", 4);
        Init init = new Init();
    }
    
    
    public static void main(String args[]){
        GlobalConstatts gc = new GlobalConstatts();
        System.out.println(lessonsPerWeek);
        
        System.out.println(sortMap(lessonsPerWeek));
        
    }
    
    public static HashMap<String,Integer> sortMap(HashMap<String,Integer> map){
        HashMap<String,Integer> sortedMap = new HashMap<>();
        HashMap<String,String> mmmap = new HashMap<>();
        mmmap.put("helos", "kenya");
        mmmap.put("heloss", "africa");
        mmmap.put("helosss", "world");
        
        System.out.println(mmmap);
        if(map.size() > 0){
            List<Integer> list = new ArrayList();
            list.addAll(lessonsPerWeek.values());
            System.out.println(list);
            Collections.sort(list);
            System.out.println(list);
            
            for(int value : list){
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                int val = (int) pair.getValue();
                String mykey = pair.getKey().toString();
                if(value == val){
                    sortedMap.put(mykey, value);
                    
                    map.remove(mykey, value);
                    System.out.println(sortedMap);
                    break;
                }
            }
            }
        }
        System.out.println("::::::OUTPUT::::: " + sortedMap);
        return sortedMap;
    }
    
}
