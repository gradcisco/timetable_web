/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.subjects;

import java.util.ArrayList;
import java.util.List;
import timetable.pojos.Subject1;

/**
 *
 * @author cisco
 */
public class Subjects_initializer {
    
    public Subjects_initializer(){
        
        List<Subject1> subject_list = new ArrayList<>();
        String[] sarrays = {};
        
        //form 1 & 2
        subject_list.add(new Subject1(1, "Eng", 5, false, sarrays, 1));
        subject_list.add(new Subject1(2, "Kis", 5, false, sarrays, 1));
        subject_list.add(new Subject1(3, "Mat", 5, true, sarrays, 1));
        subject_list.add(new Subject1(4, "Chem", 4, true, sarrays, 1));
        subject_list.add(new Subject1(5, "Bio", 4, true, sarrays, 1));
        subject_list.add(new Subject1(6, "Phy", 4, true, sarrays, 1));
        subject_list.add(new Subject1(7, "Hist", 3, false, sarrays, 1));
        subject_list.add(new Subject1(8, "Cre", 3, false, sarrays, 1));
        subject_list.add(new Subject1(9, "Geo", 3, false, sarrays, 1));
        subject_list.add(new Subject1(10, "Agr_Hsc_Bs_comp", 4, true, sarrays, 1));
        
         //form 3 & 4
        subject_list.add(new Subject1(11, "Eng", 5, false, sarrays, 1));
        subject_list.add(new Subject1(12, "Kis", 5, false, sarrays, 1));
        subject_list.add(new Subject1(13, "Mat", 6, true, sarrays, 1));
        subject_list.add(new Subject1(14, "Chem", 4, true, sarrays, 1));
        subject_list.add(new Subject1(15, "Bio_Phy", 4, true, sarrays, 1));
        subject_list.add(new Subject1(16, "Hist_Geo", 3, false, sarrays, 1));
        subject_list.add(new Subject1(17, "Cre", 3, false, sarrays, 1));
        subject_list.add(new Subject1(18, "Agr_Hsc_Bs_comp", 4, true, sarrays, 1));
        
//        //form 2
//        subject_list.add(new Subject1(11, "Eng", 5, false, sarrays, 2));
//        subject_list.add(new Subject1(12, "Kis", 5, false, sarrays, 2));
//        subject_list.add(new Subject1(13, "Mat", 6, true, sarrays, 2));
//        subject_list.add(new Subject1(14, "Chem", 4, true, sarrays, 2));
//        subject_list.add(new Subject1(15, "Bio", 4, true, sarrays, 2));
//        subject_list.add(new Subject1(16, "Phy", 4, true, sarrays, 2));
//        subject_list.add(new Subject1(17, "Hist", 4, false, sarrays, 2));
//        subject_list.add(new Subject1(18, "Cre", 4, false, sarrays, 2));
//        subject_list.add(new Subject1(19, "Geo", 4, false, sarrays, 2));
//        subject_list.add(new Subject1(20, "Agr/Hsc", 4, true, sarrays, 2));
//        
//         //form 3
//        subject_list.add(new Subject1(21, "Eng", 7, false, sarrays, 3));
//        subject_list.add(new Subject1(22, "Kis", 7, false, sarrays, 3));
//        subject_list.add(new Subject1(23, "Mat", 7, true, sarrays, 3));
//        subject_list.add(new Subject1(24, "Chem", 5, true, sarrays, 3));
//        subject_list.add(new Subject1(25, "Bio/Phy", 5, true, sarrays, 3));
//        subject_list.add(new Subject1(26, "Hist", 4, false, sarrays, 3));
//        subject_list.add(new Subject1(27, "Cre/Geo", 4, false, sarrays, 3));
//        subject_list.add(new Subject1(28, "Agr/Hsc/Bs", 4, true, sarrays, 3));
//        
//         //form 4
//        subject_list.add(new Subject1(29, "Eng", 7, false, sarrays, 4));
//        subject_list.add(new Subject1(30, "Kis", 7, false, sarrays, 4));
//        subject_list.add(new Subject1(31, "Mat", 7, true, sarrays, 4));
//        subject_list.add(new Subject1(32, "Chem", 5, true, sarrays, 4));
//        subject_list.add(new Subject1(33, "Bio/Phy", 5, true, sarrays, 4));
//        subject_list.add(new Subject1(34, "Hist", 4, false, sarrays, 4));
//        subject_list.add(new Subject1(35, "Cre/Geo", 4, false, sarrays, 4));
//        subject_list.add(new Subject1(36, "Agr/Hsc/Bs", 4, true, sarrays, 4));
//        
//        //business form 1 form 2
//        subject_list.add(new Subject1(37, "Bs", 4, true, sarrays, 1));
//        subject_list.add(new Subject1(38, "Bs", 4, true, sarrays, 2));
        
        
        
    }
    
    public static List<Subject1> getSubjects(){
        List<Subject1> subject_list = new ArrayList<>();
        String[] sarrays = {};
        
        //form 1 & 2
        subject_list.add(new Subject1(1, "Eng", 5, false, sarrays, 1));
        subject_list.add(new Subject1(2, "Kis", 5, false, sarrays, 1));
        subject_list.add(new Subject1(3, "Mat", 5, true, sarrays, 1));
        subject_list.add(new Subject1(4, "Chem", 4, true, sarrays, 1));
        subject_list.add(new Subject1(5, "Bio", 4, true, sarrays, 1));
        subject_list.add(new Subject1(6, "Phy", 4, true, sarrays, 1));
        subject_list.add(new Subject1(7, "Hist", 3, false, sarrays, 1));
        subject_list.add(new Subject1(8, "Cre", 3, false, sarrays, 1));
        subject_list.add(new Subject1(9, "Geo", 3, false, sarrays, 1));
        subject_list.add(new Subject1(10, "Agr_Hsc_Bs_comp", 4, true, sarrays, 1));
        
         //form 3 & 4
        subject_list.add(new Subject1(11, "Eng", 5, false, sarrays, 1));
        subject_list.add(new Subject1(12, "Kis", 5, false, sarrays, 1));
        subject_list.add(new Subject1(13, "Mat", 5, true, sarrays, 1));
        subject_list.add(new Subject1(14, "Chem", 4, true, sarrays, 1));
        subject_list.add(new Subject1(15, "Bio_Phy", 4, true, sarrays, 1));
        subject_list.add(new Subject1(16, "Hist_Geo", 3, false, sarrays, 1));
        subject_list.add(new Subject1(17, "Cre", 3, false, sarrays, 1));
        subject_list.add(new Subject1(18, "Agr_Hsc_Bs_comp", 4, true, sarrays, 1));
        
        return subject_list;
    }
    
}
