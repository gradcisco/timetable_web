/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.allocations;

import java.util.ArrayList;
import java.util.List;
import timetable.pojos.Class_stream_teacher_subject_Allocations;

/**
 *
 * @author cisco
 */
public class Allocation_initializer {
    
    
    public Allocation_initializer(){
        List<Class_stream_teacher_subject_Allocations> allocation_list = new ArrayList<>();
        
        //----------------------------------HUMANITIES-------------------------------------------
//        //english form 1
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(1, 1, 1, 6, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(2, 1, 1, 7, 2));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(3, 1, 1, 8, 3));
//        
//        //kiswali form 1
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(3, 1, 2, 10, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(4, 1, 2, 10, 2));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(5, 1, 2, 9, 3));
//        
//        //mathematics form 1
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(6, 1, 3, 4, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(7, 1, 3, 1, 2));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(8, 1, 3, 5, 3));
//        
//        
//        //biology form 1
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(9, 1, 5, 2, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(10, 1, 5, 3, 2));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(11, 1, 5, 2, 3));
//        
//        //chemistry form 1
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(12, 1, 4, 3, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(13, 1, 4, 2, 2));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(14, 1, 4, 3, 3));
//        
//        //physics form 1
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(15, 1, 6, 5, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(16, 1, 6, 4, 2));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(17, 1, 6, 1, 3));
//        
//        //business form 1
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(18, 1, 37, 18, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(19, 1, 37, 19, 2));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(20, 1, 37, 18, 3));
//        
//        //cre form 1
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(21, 1, 8, 11, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(22, 1, 8, 12, 2));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(23, 1, 8, 11, 3));
//        
//        //geog form 1
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(24, 1, 9, 13, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(25, 1, 9, 14, 2));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(26, 1, 9, 13, 3));
//        
//         //hist form 1
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(27, 1, 7, 12, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(28, 1, 7, 11, 2));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(29, 1, 7, 12, 3));
//        
//        //agri form 1
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(30, 1, 10, 16, 1));
//        
//        //hsc form 1
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(31, 1, 10, 15, 2));
//        
//        //----------------------------------END FORM 1----------------------------------------------------
//        
//        
//        //form 2 english
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(32, 2, 1, 6, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(34, 2, 1, 8, 2));
//        
//        //form 3 english
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(35, 3, 1, 8, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(36, 3, 1, 7, 2));
//        
//        //form 4 english
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(37, 4, 1, 7, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(38, 4, 1, 6, 2));
//        
//        
//        //form 2 kisw
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(39, 2, 2, 9, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(40, 2, 2, 10, 2));
//        
//        //form 3 kisw
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(41, 3, 2, 10, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(42, 3, 2, 9, 2));
//        
//         //form 4 kisw
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(43, 4, 2, 10, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(44, 4, 2, 9, 2));
//        
//        //form 2 maths
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(45, 2, 3, 5, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(46, 2, 3, 1, 2));
//        
//        //form 3 maths
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(47, 3, 3, 4, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(48, 3, 3, 5, 2));
//        
//         //form 4 maths
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(49, 4, 3, 1, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(50, 4, 3, 4, 2));
//        
//         //form 2 bio
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(51, 2, 5, 3, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(52, 2, 5, 2, 2));
//        
//         //form 3 bio
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(53, 3, 5, 2, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(54, 3, 5, 3, 2));
//        
//         //form 4 bio
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(55, 4, 5, 3, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(56, 4, 5, 2, 2));
//        
//         //form 2 chem
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(57, 2, 4, 2, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(58, 2, 4, 3, 2));
//        
//        //form 3 chem
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(59, 3, 4, 2, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(60, 3, 4, 3, 2));
//        
//        //form 4 chem
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(61, 4, 4, 2, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(62, 4, 4, 3, 2));
//        
//        //form 2 phyc
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(63, 2, 6, 1, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(64, 2, 6, 4, 2));
//        
//        //form 3 phyc
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(65, 3, 6, 5, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(66, 3, 6, 4, 2));
//        
//        //form 4 phyc
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(67, 4, 6, 4, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(68, 4, 6, 5, 2));
//        
//        //form 2 bus
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(69, 2, 38, 18, 1));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(70, 2, 38, 19, 2));
//        
//        //form 3 bus
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(71, 3, 38, 18, 2));
//        
//         //form 4 bus
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(72, 4, 38, 19, 2));
//        
//         //form 2 cre
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(73, 2, 38, 18, 2));
//        allocation_list.add(new Class_stream_teacher_subject_Allocations(74, 2, 38, 18, 2));


          allocation_list.add(new Class_stream_teacher_subject_Allocations(1, 1, 1, 14, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(2, 1, 2, 13, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(3, 1, 3, 6, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(4, 1, 4, 10, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(5, 1, 6, 7, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(6, 1, 5, 3, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(7, 1, 7, 11, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(8, 1, 9, 12, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(9, 1, 10, 5, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(10, 1, 8, 12, 1));
          //allocation_list.add(new Class_stream_teacher_subject_Allocations(10, 1, 8, 12, 1));
          //allocation_list.add(new Class_stream_teacher_subject_Allocations(10, 1, 8, 12, 1));
          
          
          //form 2
          allocation_list.add(new Class_stream_teacher_subject_Allocations(11, 2, 1, 14, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(12, 2, 2, 13, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(13, 2, 3, 15, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(14, 2, 4, 6, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(15, 2, 6, 7, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(16, 2, 5, 3, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(17, 2, 7, 11, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(18, 2, 9, 12, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(19, 2, 10, 5, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(20, 2, 8, 12, 1));
          
          //form 3 w
          allocation_list.add(new Class_stream_teacher_subject_Allocations(21, 3, 11, 2, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(22, 3, 12, 13, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(23, 3, 13, 15, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(24, 3, 14, 6, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(25, 3, 15, 7, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(26, 3, 16, 11, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(27, 3, 18, 5, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(28, 3, 17, 11, 1));
          
          //form 3 v
          allocation_list.add(new Class_stream_teacher_subject_Allocations(29, 3, 11, 2, 2));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(30, 3, 12, 8, 2));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(31, 3, 13, 9, 2));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(32, 3, 14, 10, 2));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(33, 3, 15, 7, 2));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(34, 3, 16, 11, 2));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(35, 3, 18, 5, 2));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(36, 3, 17, 12, 2));
          
          
          //form 4
          allocation_list.add(new Class_stream_teacher_subject_Allocations(37, 4, 11, 2, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(38, 4, 12, 8, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(39, 4, 13, 15, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(40, 4, 14, 10, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(41, 4, 15, 7, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(42, 4, 16, 13, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(43, 4, 18, 5, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(44, 4, 17, 12, 1));
      
          

    }
    
    public static List<Class_stream_teacher_subject_Allocations> getAllocations(){
        List<Class_stream_teacher_subject_Allocations> allocation_list = new ArrayList<>();
        
         allocation_list.add(new Class_stream_teacher_subject_Allocations(1, 1, 1, 14, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(2, 1, 2, 13, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(3, 1, 3, 6, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(4, 1, 4, 10, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(5, 1, 6, 7, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(6, 1, 5, 3, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(7, 1, 7, 11, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(8, 1, 9, 12, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(9, 1, 10, 5, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(10, 1, 8, 12, 1));
          
          
          //form 2
          allocation_list.add(new Class_stream_teacher_subject_Allocations(11, 2, 1, 14, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(12, 2, 2, 13, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(13, 2, 3, 15, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(14, 2, 4, 6, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(15, 2, 6, 7, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(16, 2, 5, 3, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(17, 2, 7, 11, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(18, 2, 9, 12, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(19, 2, 10, 5, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(20, 2, 8, 12, 1));
          
          //form 3 w
          allocation_list.add(new Class_stream_teacher_subject_Allocations(21, 3, 11, 2, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(22, 3, 12, 13, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(23, 3, 13, 15, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(24, 3, 14, 6, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(25, 3, 15, 7, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(26, 3, 16, 11, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(27, 3, 18, 5, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(28, 3, 17, 11, 1));
          
          //form 3 v
          allocation_list.add(new Class_stream_teacher_subject_Allocations(29, 3, 11, 2, 2));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(30, 3, 12, 8, 2));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(31, 3, 13, 9, 2));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(32, 3, 14, 10, 2));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(33, 3, 15, 7, 2));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(34, 3, 16, 11, 2));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(35, 3, 18, 5, 2));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(36, 3, 17, 12, 2));
          
          
          //form 4
          allocation_list.add(new Class_stream_teacher_subject_Allocations(37, 4, 11, 2, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(38, 4, 12, 8, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(39, 4, 13, 15, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(40, 4, 14, 10, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(41, 4, 15, 7, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(42, 4, 16, 13, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(43, 4, 18, 5, 1));
          allocation_list.add(new Class_stream_teacher_subject_Allocations(44, 4, 17, 12, 1));
          
          return allocation_list;
    }
    
}
