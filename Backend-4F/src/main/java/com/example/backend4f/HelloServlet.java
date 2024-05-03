package com.example.backend4f;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "home", value = "/home")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("User Agent:" + request.getHeader("User-Agent"));
        request.getParameter("Usename");
        request.getParameter("Password");

        if (Usename.equals ("gino") and Password.equals("pasquale")){
            response.setContentType("text/html");
            PrintWriter oggetto = response.getWriter();
            oggetto.println("<html><body>");
            oggetto.println("<h1>" + Benvenuto + "</h1>");
            oggetto.println("</body></html>");
        } else{
            HttpSession session = request.getSession(true);
            session.setAttribute("Errore", 'Errore credenziali Sbagliate';
            response.sendRedirect("/Errore");
        }


    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Host: " + request.getHeader("Host"));
        System.out.println("Accept-Encoding: " + request.getHeader("Accept-Encoding"));
        System.out.println("If-None-Match: " + request.getHeader("If-None-Match"));

        response.setContentType("text/plain");

        PrintWriter oggetto = response.getWriter();

        oggetto.println("Buongiorno Galvani!");

    }

    public void destroy() {
    }
}