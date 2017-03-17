/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.pojos;

/**
 *
 * @author cisco
 */
public class Period_Day {
    private String period;
    private String day;

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Period_Day(String period, String day) {
        this.period = period;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Period_Day{" + "period=" + period + ", day=" + day + '}';
    }
    
    
    
    
    
}
