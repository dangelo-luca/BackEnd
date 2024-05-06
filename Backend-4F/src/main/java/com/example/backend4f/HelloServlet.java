package com.example.backend4f;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "home", value = "/home")
public class HelloServlet extends HttpServlet {

    @Override
    public void init(){

    }

    @Override
    public void destroy(){

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        System.out.println(request.getHeader("User-Agent"));
        String Username(request.getParameter("Username"));
        String Password(request.getParameter("Password"));

        if (Username.equals("gino") and Password.equals("Pasquale")){
            response.setContentType("text/html");
            printWriter out = response.getWriter();
            out.println("<html>>body><h1>Ciao</h1></body></html>")
        }else{
            HttpSession session = request.getSession(true);
            String messaggio = "Hai Sbagliato";
            session.setAttribute("error",messaggio);
            response.sendRedirect("/Errore")
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        System.out.println(request.getHeader("host"));
        System.out.println(request.getHeader("Accept-Encoding"));
        System.out.println(request.getHeader("If-None-Match"));
        response.setContentType("text/txt");
        printWriter out = response.getWriter();
        out.println("Buongiorno Galvani!")
    }

}