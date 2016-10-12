package servletHTML;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletRes extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        ServletOutputStream out = res.getOutputStream();
        double resultado = Double.parseDouble(req.getParameter("Resp")) ;
        out.println("<html>");
        out.println("<head><title>El Resultado</title><link href=\"CSS/Estilos.css\" rel=\"stylesheet\" type=\"text/css\"></head>");
        out.println("<body>");
        out.println("<h1><center>Resultado</center></h1>");
        
        out.println("<br><center>El resultado es: " + resultado + "</center>");
        out.println("</body></html>");
        
        out.close();
    }
}