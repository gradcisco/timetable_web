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
public class Output1 {
    private int dayId;
    private int periodId;
    private int teacherId;
    private int subjectId;
    private int streamId;
    private int classId;

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

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getStreamId() {
        return streamId;
    }

    public void setStreamId(int streamId) {
        this.streamId = streamId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public Output1(int dayId, int periodId, int teacherId, int subjectId, int streamId, int classId) {
        this.dayId = dayId;
        this.periodId = periodId;
        this.teacherId = teacherId;
        this.subjectId = subjectId;
        this.streamId = streamId;
        this.classId = classId;
    }

    public Output1() {
        
    }
    
    

    @Override
    public String toString() {
        return "Output1{" + "dayId=" + dayId + ", periodId=" + periodId + ", teacherId=" + teacherId + ", subjectId=" + subjectId + ", streamId=" + streamId + ", classId=" + classId + '}';
    }

    


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.dayId;
        hash = 23 * hash + this.periodId;
        hash = 23 * hash + this.teacherId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Output1 other = (Output1) obj;
        if (this.dayId != other.dayId) {
            return false;
        }
        if (this.periodId != other.periodId) {
            return false;
        }
        if (this.teacherId != other.teacherId) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
