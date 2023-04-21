package lt.viko.eif.o.sharapova.service.jetty;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class JettyMainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getRequestURI().contains("/static")) {
            servePdfFile(resp);
        } else {
            PrintWriter out = resp.getWriter();
            out.println("<html><body>");
            out.println("<a href='/pdf/static'> Test PDF </a>");
            out.println("</body></html>");
        }
    }

    private void servePdfFile(HttpServletResponse response) throws IOException {
        response.sendRedirect("/pdf/");
    }
}
