/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import classes.Placeorder;
import java.io.IOException;
import java.io.PrintWriter;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import java.sql.*;
/**
 *
 * @author Karan
 */
@WebServlet(name="buytry", urlPatterns={"/buytry"})
public class buytry extends HttpServlet {
    @Resource(name = "abc")
    private DataSource abc;
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<style> body {background-image: url(chomecopy.jpg);}");
 out.println("h2{font-family: Calligrapher; font-face: Calligrapher;font-weight: bold}");
       out.println("h4{font-family: Calligrapher; font-face: Calligrapher;font-weight:bold;color:#753A00;}</style></head>");
            out.println("<br><br><br><br><br><br><br><br><br><br>");
            HttpSession cur=request.getSession(true);
            String cuser=(String)cur.getAttribute("username");
            if(cuser==null)
            {
                response.sendRedirect("loginmod.html");
            }
 else
            {
           Connection con=abc.getConnection();
         Statement stat=con.createStatement();
                ResultSet rs = null;
            //ResultSet rs = stat.executeQuery("select * from APP.placeorder where username ='"+cuser+"'");
                Placeorder p = new Placeorder();
            rs = p.Select(cuser);
            String s=new String();
            while(rs.next())
            {
                s =s + rs.getString("song");
            }
            String song[]=s.split(",");
            out.println("<body><center>");
            out.println("<table><tr><td colspan=2 align=center><h4>Your cart contains</h4></tr>");
            out.println("<tr><td colspan=2 align=center>");
            //for(int i=0;i<song.length;i++)
            //{

                //}
ResultSet rs1 ;
int costpi = 0;
for(int i=0;i<song.length;i++)
    {
    
        rs1 = stat.executeQuery("select * from APP.music where name = '"+song[i]+"'");
        out.println("<tr><td align=center><h4>"+song[i]+"</h4>");
       // out.println("test this");
        if(rs1.next())
        {
            String imid=rs1.getString("imageid");
        out.println("<td valign=center><img src=img/"+imid+".jpg height=75 width=75></tr>");
            costpi += Integer.parseInt(rs1.getString("price"));
        }
     }
 out.println("<tr><td><h4>Your Total cost </h4></td><td>"+ costpi+"</td></tr>");
 out.println("<tr><td colspan=2 align=center><h4>Enter your pass key to buy the above objects</h4></tr>");
 out.println("<form name=passkey action=verifypasskey method=post>");
            out.println("<tr><td><h4>passkey:</h4></td><td><input id=\"passkey\" type=password name=\"passkey\"/></td></tr>");
            out.println("<input type=hidden name=hidden1 value="+costpi+">");
            out.println("<tr><td colspan=2 align=center><input type=submit value=verify></tr>");
            out.println("</table></form></center></body></html>");
        }
        }
        catch(Exception e)
        {}
        finally {
            out.close();
        }
    } 
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
