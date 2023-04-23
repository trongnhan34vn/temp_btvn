package com.example.bai1_servertime;

import java.io.*;
import java.util.Date;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ServerTimeServlet", value = "/ServerTimeServlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        Date today = new Date();

        writer.println("<h1>" + today + "</h1>");
        writer.println("</html>");

    }

    public void destroy() {
    }
}