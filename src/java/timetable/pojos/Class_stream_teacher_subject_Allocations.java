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
public class Class_stream_teacher_subject_Allocations {
    private int id;
    private int class_id;
    private int subject_id;
    private int teacher_id;
    private int stream_id;

    public int getId() {
        return id;
    }

    public int getClass_id() {
        return class_id;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public int getStream_id() {
        return stream_id;
    }

    @Override
    public String toString() {
        return "Class_stream_teacher_subject_Allocations{" + "id=" + id + ", class_id=" + class_id + ", subject_id=" + subject_id + ", teacher_id=" + teacher_id + ", stream_id=" + stream_id + '}';
    }

    public Class_stream_teacher_subject_Allocations(int id, int class_id, int subject_id, int teacher_id, int stream_id) {
        this.id = id;
        this.class_id = class_id;
        this.subject_id = subject_id;
        this.teacher_id = teacher_id;
        this.stream_id = stream_id;
    }
    
    
    
}
