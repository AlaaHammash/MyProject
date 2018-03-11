<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 3/6/2018
  Time: 8:33 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<center>
    <h1>
        Available Brands
    </h1>
        <%
List result= (List) request.getAttribute("brands");
Iterator it = result.iterator();
out.println("<br>We have <br><br>");
while(it.hasNext()){
out.println(it.next()+"<br>");
}
%>

        <%
String content= (String) request.getAttribute("content");
out.println("<br>");
out.println(content+"<br>");

%>
</body>
</html>
