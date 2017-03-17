/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.pojos;

import java.util.Objects;

/**
 *
 * @author cisco
 */
public class Output {
    
    private String subject;
    private String period;
    private String day;
    private int code;

    public String getSubject() {
        return subject;
    }

    public String getPeriod() {
        return period;
    }

    public String getDay() {
        return day;
    }
    
    public int getCode(){
        return this.code;
    }
    

    public Output(){
        
    }
    
    public Output(String subject, String period, String day, int code) {
        this.subject = subject;
        this.period = period;
        this.day = day;
        this.code = code;
    }
    
     public Output(String subject, String period, String day) {
        this.subject = subject;
        this.period = period;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Output{" + "subject=" + subject + ", period=" + period + ", day=" + day + ", code=" + code + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.subject);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        Output out = (Output) obj;
       // System.out.println("------" + this);
        if(this.getCode() == 1){
        return this.getSubject().equalsIgnoreCase(out.getSubject());
        }
        else{
            return this.getPeriod().equalsIgnoreCase(out.getPeriod()) && this.getDay().equalsIgnoreCase(out.getDay());
        }
    }
    
    
    
}
