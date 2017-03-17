/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author cisco
 */
public class ArrayUtils {
    public static String days[] = {"Mon","Tue","Wed","Thurs","Frid"};
    
    public static void main(String args[]){
        
        System.out.println(days.length);
        System.out.println(removeElement(days, "Tue").length);
    }
    
    public static String[] removeElement(String[] original, String elements){
    
    
            List list = Arrays.asList(original);
            int element = list.indexOf(elements);
            String[] n = new String[original.length - 1];
            System.arraycopy(original, 0, n, 0, element );
            System.arraycopy(original, element+1, n, element, original.length - element-1);
            return n;
}
    
}
