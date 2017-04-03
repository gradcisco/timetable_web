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
public class Day_Double_Periods {
    
    private int dayId;
    private int period1Id;
    private int period2Id;

    public int getDayId() {
        return dayId;
    }

    public int getPeriod1Id() {
        return period1Id;
    }

    public int getPeriod2Id() {
        return period2Id;
    }

    public Day_Double_Periods(int dayId, int period1Id, int period2Id) {
        this.dayId = dayId;
        this.period1Id = period1Id;
        this.period2Id = period2Id;
    }

    
    
    @Override
    public String toString() {
        return "Day_Double_Periods{" + "dayId=" + dayId + ", period1Id=" + period1Id + ", period2Id=" + period2Id + '}';
    }

        
    
    
}
