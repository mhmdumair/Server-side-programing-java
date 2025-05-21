package com.umair.serverlet;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

public class AddNumbers extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
//        String[] values = request.getParameterValues("fieldName");
//        Writer wr = res.getWriter();
//        wr.write("Total : "+(num1+num2));

        int total = num1+num2;
        req.setAttribute("total",total);

        RequestDispatcher rd = req.getRequestDispatcher("display");
        rd.forward(req,res);
    }
}
