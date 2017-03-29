<%-- 
    Document   : index2
    Created on : Mar 28, 2017, 4:40:12 PM
    Author     : cisco
--%>

<%@page import="timetable.FakeGenerator2"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            String sout = FakeGenerator2.decodeOutputs(FakeGenerator2.encodeOutputs());
            out.print(sout);
        %>    
    </body>
</html>
