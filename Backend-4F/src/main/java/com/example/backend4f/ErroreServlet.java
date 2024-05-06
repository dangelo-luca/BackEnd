import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Errore", value = "/Errore")
public class ErroreServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(true);
        String attributoSalvato = (String) session.getAttribute("error");
        System.out.println(attributoSalvato)
        response.setContentType("text/html");
        PrintWriter oggetto = response.getWriter();
        oggetto.println("<html><body>");
        oggetto.println("<h1>" + attributoSalvato + "</h1>");
        oggetto.println("</body></html>");
    }


}
