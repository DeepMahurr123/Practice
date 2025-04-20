import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class cal extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
      res.setContentType("text/html");
      PrintWriter out=res.getWriter();
      String option=req.getParameter("select");
      String number1=req.getParameter("number1");
      String number2=req.getParameter("number2");
      Integer a=Integer.parseInt(number1);
      Integer b=Integer.parseInt(number2);
      if(option.equals("Addition"))
      {
         
       RequestDispatcher re=req.getRequestDispatcher("index.html");
                          re.include(req, res);
                          out.println("<br><br><br>");
                          out.println("<br><br><br>");
                           out.println("<h1>Addition = "+(a+b)+"</h1>");
      }
      else 
          if(option.equals("Subtraction"))
          {
     
          RequestDispatcher re=req.getRequestDispatcher("index.html");
                          re.include(req, res);
                          out.println("<br><br><br>");
                          out.println("<br><br><br>");
                                   out.println("<h1>Subtraction = "+(a-b)+"</h1>");
                          out.println(".......................");
          }
      else
              if(option.equals("Mulitiplication"))
              {
               
                  RequestDispatcher re=req.getRequestDispatcher("index.html");
                          re.include(req, res);
                          out.println("<br><br><br>");
                          out.println("<br><br><br>");
                          out.println("<h1>Multiplication= "+(a*b)+"</h1>");
              }
      else
                  if(option.equals("Division"))
                          {
                             
                          RequestDispatcher re=req.getRequestDispatcher("index.html");
                          re.include(req, res);
                          out.println("<br><br><br>");
                          out.println("<br><br><br>");
                          out.println("<h1>Division= "+(a/b)+"</h1>"); 
                          }
      else
                      if(option.equals("Modulas"))
                      {
                     
                    RequestDispatcher re=req.getRequestDispatcher("index.html");
                          re.include(req, res);
                          out.println("<br><br><br>");
                          out.println("<br><br><br>");
                               out.println("<h1>Modulas= "+(a%b)+"</h1>");
                      }
      else
                      {
                          
                    RequestDispatcher re=req.getRequestDispatcher("index.html");
                          re.include(req, res);
                          out.println("<br><br><br>");
                          out.println("<h1>Plese select valit option.....</h1>");
                      }
    }
}