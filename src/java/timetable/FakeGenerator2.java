/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import timetable.Classes.Classes_initializer;
import timetable.Streams.Streams_initializer;
import timetable.allocations.Allocation_initializer;
import timetable.days.Days_Initializer;
import timetable.periods.Periods_initializer;
import timetable.pojos.Class_form;
import timetable.pojos.Class_stream_teacher_subject_Allocations;
import timetable.pojos.Day;
import timetable.pojos.Day_period;
import timetable.pojos.Output1;
import timetable.pojos.Period;
import timetable.pojos.Period_Day;
import timetable.pojos.Stream;
import timetable.pojos.Subject;
import timetable.pojos.Subject1;
import timetable.pojos.Teacher;
import timetable.subjects.Subjects_initializer;
import timetable.teachers.Teacher_initializer;

/**
 *
 * @author cisco
 */
public class FakeGenerator2 {
    
    public static List<List<Output1>> encodeOutputs(){
        String filename = "/home/cisco/NetBeansProjects/Timetable_web/logs/";
        BufferedWriter bw = null;
        FileWriter fw = null;
        List<List<Output1>> olist = new ArrayList<>();
        //output objects
        List<Output1> output_list = new ArrayList<>();
        //get all streams
        List<Stream> streams_list = Streams_initializer.getStreams();
       // System.out.println("Streams -----" + streams_list.toString());
        
        //get all subjects
        List<Subject1> subject_list = Subjects_initializer.getSubjects();
        
        //get all periods
       // List<Period> period_list = Periods_initializer.getPeriodsNotBreaks();
        List<Period> period_list = Periods_initializer.getPeriods();
        //System.out.println("Periods------" + period_list.toString());
        
        //get all allocatios
        List<Class_stream_teacher_subject_Allocations> allocation_list = Allocation_initializer.getAllocations();
       // System.out.println("Allocations------" + allocation_list.toString());
        
        //get all days
        List<Day> day_list = Days_Initializer.getDays();
        
        
             
             //loop through streams
             for(Stream s : streams_list){
                 //get all day periods
                 List<Day_period> day_periodList = Periods_initializer.getDay_periods();
                 System.out.println(s + "****************************************************");
                         //get subjects
                         List<Subject1> newList = new ArrayList<>(subject_list.subList(10,18));
                         if(s.getClass_id() == 1 || s.getClass_id() == 2){
                             newList = new ArrayList<>(subject_list.subList(0,10));
                             System.out.println("Subjects--------" + newList.toString());
                         }

                             //sort the subject list
                       Collections.sort(newList, new Comparator<Subject1>() {

                        @Override
                        public int compare(Subject1 s1, Subject1 s2) {
                           return (s1.getNo_per_week() > s2.getNo_per_week()) ? -1 : 1;
                        }
                        });

                        //System.out.println("Sorted list------" + newList);

                         //loop through subjects
                        int ind = 0;
                        for( Subject1 subject : newList ){
                            System.out.println("------------------" + subject);
                            String filenames = "";
                            filenames =   filename + s.getId() + s.getName() + s.getClass_id() + subject.getName() + "log.txt";
                                 int added = 0;
                                 ind++;
                                 Day day = null;
                                 Day_period dayPeriod = null;
                                 List<Day> tmp_day_list = Days_Initializer.getDays();
                                 //get responsibe teacher
                                 Teacher t = getTeacher(s.getId() , subject.getId() , allocation_list , s.getClass_id());
                                 System.out.println("Teacher----" + t);
                                 if(t == null){
                                     System.out.println("SID----" + s.getId() + "SUID---" + subject.getId());
                                 }
                                 //list of days selected
                                 List<Day> daysSelected_list = new ArrayList<>();
                                 
                                 do{
                                     
                                     int try_counter = 0;
                                     Output1 oput1 = null;
                                     boolean not_allocated = true;

                                     while(not_allocated && try_counter > -1){
                                             //pick a period at random
                                             int index = new Random().nextInt(period_list.size());
                                             Period period = period_list.get(index);

                                             //pick a day at random
                                             int index1 = new Random().nextInt(tmp_day_list.size());
                                             day = tmp_day_list.get(index1);
                                             
                                             //new analogy----pick a day period
                                             int index2 = new Random().nextInt(day_periodList.size());
                                             dayPeriod = day_periodList.get(index2);
                                             //oput1 = new Output1(day.getId(), period.getId(), t.getId(), subject.getId(), s.getId(), s.getClass_id());
                                             oput1 = new Output1(dayPeriod.getDayId(), dayPeriod.getPeriodId(), t.getId(), subject.getId(), s.getId(), s.getClass_id());

                                             if(output_list.contains(oput1)){
                                                 System.out.println("===============================I caught a bug ========================");
                                             }
                                             //check that teacher is free as selected time 
                                             if(output_list.contains(oput1) || daysSelected_list.contains(day)){//teacher not free need to loop
                                                   System.out.println("-------retrying--------" + try_counter);
                                                   try_counter++;
                                             }
                                             else{
                                                  not_allocated = false;

                                             }

                                            
                                     }

                                     
                                     output_list.add(oput1);
                                     System.out.println("----------------------ORIGINAL SIZE-----------" + day_periodList.size());
                                     day_periodList.remove(dayPeriod);
                                     System.out.println("====================REMOVED+++++" + dayPeriod.toString() + "=============");
                                     System.out.println("----------------------New SIZE-----------" + day_periodList.size());
                                     writeLog(oput1.toString(), filenames);
                                     daysSelected_list.add(day);
                                     added++;
                                     
                                     //remove day from days list for nice randomness
                                     tmp_day_list.remove(day);
                                     //System.out.println("*******************************************************" + subject);



                                  }while(added < subject.getNo_per_week());
                                 writeLog("================================================\n" , filenames);
                                 writeLog("Allocated ---" + subject.getName() + "****" + output_list.toString() + "\n" , filenames);
                                 writeLog("================================================\n" , filenames);
                                 //olist.add(output_list);
                                 //output_list.clear();
                            }
                        olist.add(output_list);
                 }
                 System.out.println("------------------------------------------------------------------");
                 System.out.println(output_list);
                 
                 System.out.println("========================" + olist.size());
                 try {

			String content = "This is the content to write into file\n";

			fw = new FileWriter("/home/cisco/NetBeansProjects/Timetable_web/logs/log.txt");
			bw = new BufferedWriter(fw);
                        bw.write("DayId\t PeriodId\t TeacherId\t SubjectId\t StreamId \n\n");
                        for(List<Output1> oputlist : olist){
                        bw.write("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n\n"); 
                        for(Output1 out1 : oputlist){
                            bw.write(out1.getDayId() + "\t" + out1.getPeriodId() + "\t" + out1.getTeacherId() + "\t" + out1.getSubjectId() + "\t" + out1.getStreamId() + "\n");
                        }
			//bw.write(oputlist.toString() + "\n\n");
                        bw.write("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n\n");  
                        }

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		}  finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
                 
        return olist;                 
    }
    
    
    public static void main(String args[]){
       System.out.println(decodeOutputs(encodeOutputs()));
       //decodeOutputs(encodeOutputs());

    }
    
    public static Teacher getTeacher(int streamId , int subjectId , List<Class_stream_teacher_subject_Allocations> list , int classId){
        Teacher tcha = null;
        List<Teacher> tList = Teacher_initializer.getTeachers();
        List<Class_form> classes_list = Classes_initializer.getClasses();
        int cId = 0;
        int sid = 0;
        int subid = 0;

        for(Class_stream_teacher_subject_Allocations allocation : list){
            cId = allocation.getClass_id();
            sid = allocation.getStream_id();
            subid = allocation.getSubject_id();
            if(allocation.getStream_id() == streamId && allocation.getSubject_id() == subjectId && allocation.getClass_id() == classId){
                Teacher t = new Teacher(allocation.getTeacher_id(), "", "");
                int index = tList.indexOf(t);
                tcha = tList.get(index);
                return tcha;
                
            }

        }
                    
            if(tcha == null){
            System.out.println("StreamId-----" + streamId + "++++++" + sid);
            System.out.println("subjectId-----" + subjectId + "++++++" + subid);
            System.out.println("classId-----" + classId + "+++++++" + cId);
            System.out.println("list-----" + list);
            
        }
       return tcha; 
    }
    
    public static String decodeOutputs(List<List<Output1>> olist){
        StringBuffer outputBuffer = new StringBuffer();
        int count = 1;
       
        //get all periods
        List<Period> periodList = Periods_initializer.getPeriods();
       // outputBuffer.append("<tr><th>Day/Period</th>");
       // int index = 0;
       // for(Period p : periodList){
          // outputBuffer.append("<th>" + p.getStart_time() + "-" + p.getEnd_time() + "</th>");
       // }
        outputBuffer.append("</tr>");
   
                //loop through streams 
                List<Stream> streamsList = Streams_initializer.getStreams();
                for(Stream st : streamsList){
                     outputBuffer.append("<h1>TT for stream---" + st.getClass_id() + "--" + st.getName() + "</h1>");
                     outputBuffer.append("<table border='1'>");
                    //loop through days
                    List<Day> daysList = Days_Initializer.getDays();
                    int loopCount = 0;
                    for(Day d : daysList){
                        //loop through periods
                        List<Period> periodLists = Periods_initializer.getPeriods();
                        if( loopCount != 0){
                            outputBuffer.append("<tr><td>" + d.getName() + "</td>");
                        }
                        for(Period p : periodLists){
                            if(loopCount == 0){
                                loopCount++;
                                outputBuffer.append("<tr><th>Day/Period</th>");
                                for(Period p1 : periodList){
                                    outputBuffer.append("<th>" + p1.getStart_time() + "-" + p1.getEnd_time() + "</th>");
                                }
                                outputBuffer.append("</tr>");
                                outputBuffer.append("<tr><td>" + d.getName() + "</td>");
                            }
                            
                            
                            if(p.isIs_break()){
                              outputBuffer.append("<td>" + "BREAK" + "</td>"); 
                              continue;
                            }
                          
                            //Output1 o1 = new Output1(d.getId(), p.getId(), 0, 0, st.getId());
                            Output1 o1 = new Output1(d.getId(), p.getId(), 0, 0, st.getId(), st.getClass_id());
                            String subj = getSubject(d, p, st, olist);
                            outputBuffer.append("<td>" + subj + "</td>");
                            
                          
                            
                        }
                        outputBuffer.append("</tr>");
                    }
                    
                    outputBuffer.append("</table>");
                }
                
            return outputBuffer.toString();

    }
    
    public static String getSubject(Day d, Period p, Stream st, List<List<Output1>> olist){
                 String sdesc = "";
                 for(List<Output1> out1List : olist){
                     for( Output1 out1 : out1List){
                         if(out1.getDayId() == d.getId() && out1.getPeriodId() == p.getId() && out1.getStreamId() == st.getId() && out1.getClassId() == st.getClass_id()){
                             int subjectId = out1.getSubjectId();
                             Subject1 s1 = new Subject1(subjectId);
                            
                             List<Subject1> sList = Subjects_initializer.getSubjects();
                              s1 = sList.get(sList.indexOf(s1));
                              sdesc = s1.getName();
                              
                             // return sdesc + "--dayId" + d.getId() + "--PId" + p.getId() + "---Sid" + st.getId() + "subid" + subjectId;
                             return sdesc;
                         }
                     }
                 }
                 return sdesc;
            }
    
    
    public static void writeLog(String log , String filename){
          BufferedWriter bw = null;
          FileWriter fw = null;
          
                  try {

                String content = "This is the content to write into file\n";

                fw = new FileWriter(filename , true);
                bw = new BufferedWriter(fw);
               
                bw.write("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n\n"); 
                bw.write(log + "\n");
                bw.write("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n\n");  


        } catch (IOException e) {

                e.printStackTrace();

        }  finally {

                try {

                        if (bw != null)
                                bw.close();

                        if (fw != null)
                                fw.close();

                } catch (IOException ex) {

                        ex.printStackTrace();

                }

        }
    }
    
}
