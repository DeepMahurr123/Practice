import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/MyServlet")

public class Calculate extends HttpServlet {
    String na,dob;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
    {
        res.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = res.getWriter()) 
        {
            na = req.getParameter("name");
            String dob = req.getParameter("dob");

            // Redirect to loading page
            res.sendRedirect("loading.html");

            // NOTE: Any output after sendRedirect won't be sent
            // So "Hello ji" won't be shown
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
    {
        // Optional: You can redirect to a form or show a message
        res.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = res.getWriter()) {
            out.println("<html><head><title>Mind Reader</title><style>");
            out.println(".container{height: 500px;width: 300px; background-color: pink;border: 1px solid yellow;border-radius: 5px; display: flex;align-items: center;justify-content: center;margin:40px auto;}");
            out.println("</style>");
            out.println("<body style='background-color:blue'>");
            out.println("<div class='container'");
            if(na.equals("Deep"))
            {
                
                out.println("<div>Sorry: "+na+" you Are "+((int)(Math.random()*(100-90+1))+90)+"% Mental..<div>");
                
            }
            else
            {
                out.print("<div>Great According to My Prediction You Mentally Strong</div>");
                out.print("<div>"+na+ " Your Avg Score is: "+((int)(Math.random()*(10-1+1))+1)+"%</div>");
            }
           // out.println("<h3>Please submit the form using POST method.</h3>");
           out.println("</div>");
            out.println("</body></html>");
        }
    }
}
