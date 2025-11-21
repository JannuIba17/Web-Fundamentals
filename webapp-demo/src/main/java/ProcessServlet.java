import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/ProcessServlet")
public class ProcessServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        String email=request.getParameter("email");

        request.setAttribute("name",name);
        request.setAttribute("email",email);

        RequestDispatcher rd=request.getRequestDispatcher("confirm.jsp");
        rd.forward(request,response);

    }
}

