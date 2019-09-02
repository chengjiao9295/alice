<%@ page import="impl.helloworld" %>
>
<%--
  Created by IntelliJ IDEA.
  User: Chengjiao
  Date: 2019/8/11
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
<%helloworld hello = new helloworld(); %>
<%=hello.hello("hello world")%>
</body>
</html>
