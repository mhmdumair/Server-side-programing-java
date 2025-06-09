<html>
<head>
    <title>Add Numbers</title>
</head>
<body>
<h2>Add Numbers</h2>

    <h1>
        <%@ page import="java.util.*, java.io.*" %>
        <%! int i = 5 ; %>
        <%
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            int total = num1+num2;
            out.println("Ans is : "+total);
            out.println(i);
         %>
         <%= "This is expression" %>
    </h1>
</body>
</html>
