<%-- 
    Document   : index
    Created on : Mar 17, 2017, 2:33:23 PM
    Author     : cisco
--%>

<%@page import="timetable.pojos.Output"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="timetable.FakeGenerator1"%>
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <table border ="1">
            <tr><th>Day_per</th><th>8-9</th><th>9-10</th><th>10-11</th><th>11-12</th><th>12-1</th>
                <th>1-2</th><th>2-3</th><th>3-4</th><th>4-5</th></tr>
      
        
    <%! 
           public String doSomething(String[] periods, String[] days) { 
              List<Output> list = FakeGenerator1.allocateLessons();
              System.out.println("------------------SIZEEE--------" + list.size());
              StringBuffer sbuff = new StringBuffer();

             
             
              for( String day : days ){
                    sbuff.append("<tr><td>" + day + "</td>");
                    for( String period : periods ){
                        Output output = FakeGenerator1.getOutputwithperiod_day(period, day, list);
                        System.out.println("----------------------OUTPUTTTTT-----" + output);
                        
                        sbuff.append("<td>" + output.getSubject() + "</td>");
                    }
                    sbuff.append("</tr>");
        }

              return sbuff.toString();
           } 


            String[] periods = {"8-9","9-10","10-11","11-12","12-1","1-2","2-3","3-4","4-5"};
            String days[] = {"Mon","Tue","Wed","Thurs","Frid"};

           
    %>
    
    <%
            out.print(doSomething(periods,days));
    %>
    
      </table>
    </body>
</html>
