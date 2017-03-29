<%-- 
    Document   : index
    Created on : Mar 17, 2017, 2:33:23 PM
    Author     : cisco
--%>

<%@page import="timetable.pojos.Output"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="timetable.FakeGenerator1"%>
<%@page import="timetable.GlobalConstatts"%>
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    </head>
    <body>
        <h1>My Time Table v 1.0</h1>
        
        <table border ="1">
      
        
    <%!
           public String doSomething(String[] periods, String[] days) { 
              List<Output> list = FakeGenerator1.allocateLessons();
              System.out.println("------------------SIZEEE--------" + list.size());
              StringBuffer sbuff = new StringBuffer();
              

             
              int index = 0;
              for( String day : days ){
      
                                        //print headers
                    if( index == 0 ){
                       

                    }
                    else{

                            sbuff.append("<tr><td><b>" + day + "</b></td>"); 
                    }
                    for( String period : periods ){

                        //print headers
                        if( index == 0 ){
                            sbuff.append("<tr><th>Day_period</th>");
                            for( String periodin : periods ){
                                    sbuff.append("<th>" + periodin + "</th>");
                           }
                           sbuff.append("</tr>");
                           sbuff.append("<tr><td><b>" + day + "</b></td>"); 
                           Output output = FakeGenerator1.getOutputwithperiod_day(period, day, list);
                           System.out.println("----------------------OUTPUTTTTT-----" + output);

                           sbuff.append("<td>" + output.getSubject() + "</td>");



                        }
                        else{
                              String resultStr = "";
                              if( period.equalsIgnoreCase("9:20 - 9:30")){
                                    resultStr = "<b>SHORT BREAK</b>";
                              }  // "9:20 - 9:30", ,  "1:15 - 2:00",

                              else if( period.equalsIgnoreCase("10:50 - 11:15")){
                                    resultStr = "<b>TEA BREAK</b>";
                              } 

                              else if( period.equalsIgnoreCase("1:15 - 2:00")){
                                     resultStr = "<b>LUNCH BREAK</b>";
                              } 
                              
                              else{
                                    Output output = FakeGenerator1.getOutputwithperiod_day(period, day, list);
                                    resultStr = output.getSubject();
                              }

                             sbuff.append("<td>" + resultStr + "</td>");
                        }
                        index++;
                        
                    }
                    sbuff.append("</tr>");
                    
        }

              return sbuff.toString();
           } 


            String[] periods = GlobalConstatts.raw_periods;
            String days[] = GlobalConstatts.days;

           
    %>
    
    <%
            out.print(doSomething(periods,days));
    %>
    
      </table>
    </body>
</html>
