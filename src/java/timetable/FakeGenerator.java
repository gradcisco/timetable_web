/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author cisco
 */
public class FakeGenerator {
    
    private static HashMap<String, Integer> respectiveCount = new HashMap<>();
    private static int initialcount = 0;
    
    private static int control = 0;
    
    public static void main(String args[]){
        
        //initialize some variables
        GlobalConstatts gc = new GlobalConstatts();
        
        HashMap<String, List<List<String>>> mapResults = new HashMap<>();
        
        
        //loop through classes
        for( String klass : GlobalConstatts.classes ){
            
            String[] myarray  = GlobalConstatts.subjectsArray;
            
            List<List<String>> result = new ArrayList<>();
            
            //reinitiaize all thru
        respectiveCount.put("Eng", initialcount);
        respectiveCount.put("Kis", initialcount);
        respectiveCount.put("Maths", initialcount);
        respectiveCount.put("Agr", initialcount);
        respectiveCount.put("Business", initialcount);
        respectiveCount.put("Hsc", initialcount);
        respectiveCount.put("Cre", initialcount);
        respectiveCount.put("Hist", initialcount);
        respectiveCount.put("Geo", initialcount);
        respectiveCount.put("Chem", initialcount);
        respectiveCount.put("Bio", initialcount);
        respectiveCount.put("Phy", initialcount);
            
        //loop through days
        for( String day : GlobalConstatts.days ){
            
              //loop through periods
              List<String> daysSelectedSubjectsList = new ArrayList<String>();
              
              for ( String period : GlobalConstatts.periods){
                  String selectedSubject = "";
  

                  selectedSubject = (myarray[new Random().nextInt(myarray.length)]);
                  //check whether subject already selected ---randomize again

                             
                  while(selectedSearch(daysSelectedSubjectsList, selectedSubject)){
                      
                       selectedSubject = (myarray[new Random().nextInt(myarray.length)]);
                       
                  }
                  
                  while( isLessonsExceeded(selectedSubject) ){
                      
                      selectedSubject = (myarray[new Random().nextInt(myarray.length)]);
                      
                     //remove element from array
                      removeElement(myarray , selectedSubject);
                      
                       while(selectedSearch(daysSelectedSubjectsList, selectedSubject)){
                      
                       selectedSubject = (myarray[new Random().nextInt(myarray.length)]);
                       
                  }
                       
                  }

                  daysSelectedSubjectsList.add(selectedSubject);
                  respectiveCount = updateCounts(respectiveCount, selectedSubject);
                  
                  

                  
              }//end periods loop
              //System.out.println(daysSelectedSubjectsList);
              //check for lessons exceeded
              result.add(daysSelectedSubjectsList);
            
        }//end days loop
        
        mapResults.put(klass, result);
        
    }//end classes loop


    List<List<List<String>>> lstt = new ArrayList<>();
    Iterator it = mapResults.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        Object lst = pair.getValue();
        List<List<String>> ls = (List<List<String>>) lst;

         printOccurences(ls);
        for( List<String> lss : ls ){
            System.out.println("::::KEY:::" + pair.getKey() + ":::VALUES:::" + lss  + ":::LSPDAY:::" + Collections.frequency(lss, "bat"));
           
        }

    }

    }
    
    public static boolean selectedSearch(List<String> result, String selectedSubject){
        if(result.contains(selectedSubject) || isLessonsExceeded( selectedSubject )){
            return true;
        }

        return false;
    }

    
    public static boolean isLessonsExceeded( String subject ){

        if( control == 0){
        //subject = "Cre";
        control++;
        }
        int   occurences = respectiveCount.get(subject);
        
        
 
        int requiredOccurences = GlobalConstatts.lessonsPerWeek.get(subject);
        
        
        if( occurences > requiredOccurences){
            
            return true;
            
        }
        
        return false;
        
    }
    
    public static void printOccurences( List<List<String>> result){
        
        int count = 0;
        //loop through all subjects
        for( String subject : GlobalConstatts.subjectsArray){
            //loop through lists
        for ( List<String> lst : result ){
            int occurrences = Collections.frequency(lst, subject);
            count += occurrences;
            
        }
        System.out.println("----" + subject + "-----" + "=====" + count + "====");
        count = 0;
            
        }

        
    }

    public static HashMap<String, Integer> updateCounts(HashMap<String, Integer> map , String subject) {
        //int count = map.get(subject);
        map.computeIfPresent(subject, (k, v) -> v + 1);
        return map;
    }
    
        public static void removeElement(String[] original, String elements){
    
    
            List list = Arrays.asList(original);
            int element = list.indexOf(elements);
            String[] n = new String[original.length - 1];
            System.arraycopy(original, 0, n, 0, element );
            System.arraycopy(original, element+1, original, element, original.length - element-1);
            //return n;
}
    
}

