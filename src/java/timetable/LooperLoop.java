/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author cisco
 */
public class LooperLoop {
    private static int i = 4;
    private static int i2 = 5;
    
    public static int loop1(int x){
 
        return x * 2;
    }
    
    public static int loop2(int y){

        while(loop1(15) != loop2(60)){
            
        }
        return y / 2;
    }
    
    public static void main(String args[]){
           List<String> words = new ArrayList<>();
           words.add("Peter mikas");
           words.add("Peter gikas");
           words.add("Dennis");
           words.add("Adams");
           Collections.sort(words);
            for (String word : words) {
                 System.out.println(String.format("- %s",word));
            }
            }
    
}
