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
public class Day_period {
    private int dayId;
    private int periodId;

    public int getDayId() {
        return dayId;
    }

    public void setDayId(int dayId) {
        this.dayId = dayId;
    }

    public int getPeriodId() {
        return periodId;
    }

    public void setPeriodId(int periodId) {
        this.periodId = periodId;
    }

    @Override
    public String toString() {
        return "Day_period{" + "dayId=" + dayId + ", periodId=" + periodId + '}';
    }

    public Day_period(int dayId, int periodId) {
        this.dayId = dayId;
        this.periodId = periodId;
    }
    
    
    
}
