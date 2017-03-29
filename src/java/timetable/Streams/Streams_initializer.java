/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.Streams;

import java.util.ArrayList;
import java.util.List;
import timetable.pojos.Stream;

/**
 *
 * @author cisco
 */
public class Streams_initializer {
    
    public Streams_initializer(){
        
    }
    
    public static List<Stream> getStreams(){
        List<Stream> stream_list = new ArrayList<>();
        
        stream_list.add(new Stream(1, 1, "East"));
       // stream_list.add(new Stream(2, 1, "West"));
       // stream_list.add(new Stream(3, 1, "South"));
        stream_list.add(new Stream(1, 2, "East"));
       // stream_list.add(new Stream(5, 2, "West"));
        stream_list.add(new Stream(1, 3, "W"));
        stream_list.add(new Stream(2, 3, "V"));
        stream_list.add(new Stream(1, 4, "East"));
       // stream_list.add(new Stream(9, 4, "West"));
       
       return stream_list;
    }
    
}
