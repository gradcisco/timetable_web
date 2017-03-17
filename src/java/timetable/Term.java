/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.util.Comparator;

/**
 *
 * @author cisco
 */
public class Term implements Comparable<Term>{
    private String Query;
    private long weight;
    public Term(String query , long weight) throws NullPointerException,IllegalArgumentException{
        
        if( query.equals("") ){
            throw new NullPointerException();
        }
        
        if( weight < 0 ){
            throw new IllegalArgumentException();
        }
        this.Query = query;
        this.weight = weight;
    }

    public String getQuery() {
        return Query;
    }


    public long getWeight() {
        return weight;
    }
    



    @Override
    public int compareTo(Term o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
