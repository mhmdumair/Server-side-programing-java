package com.umair.serverlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/display")
public class DisplayServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter pr = res.getWriter();
        System.out.println("Display servlet");
//        int total = (int)req.getAttribute("total");
//        pr.print("Total : "+ total);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        int total = Integer.parseInt(req.getParameter("total"));
        PrintWriter pr = res.getWriter();
        pr.println("<html><head><title>Display</title></head><body>");
        pr.println("<h1>Total : "+total+"</h1>");
        pr.println("</body></html>");
    }

}
