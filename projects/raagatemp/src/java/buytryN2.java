/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import classes.Music;
import classes.Placeorder;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tanvim
 */
@WebServlet(name = "buytryN2", urlPatterns = {"/buytryN2"})
public class buytryN2 extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            
            out.println("<html>");
            out.println("<head>");
            HttpSession cur=request.getSession(true);
            String cuser=(String)cur.getAttribute("username");
            if(cuser==null)
            {
                response.sendRedirect("loginmod.html");
            }
 else
            {
             Placeorder p = new Placeorder();
           ResultSet rs = p.Select(cuser);
            String s=new String();
            while(rs.next())
            {
                s =s + rs.getString("song");
            }
            String song[]=s.split(",");
            out.println("<body><center>");
            out.println("<table><tr><td colspan=2 align=center><h4>Your cart contains</h4></tr>");
           // out.println("<tr><td colspan=2 align=center>");
             out.println("<tr><td>Product Details</td><td>Image</td><td>Quantity &nbsp</td><td>&nbspUnit Price&nbsp</td><td>&nbspTotal&nbsp</td></tr>");
            ResultSet rs1 ;
int costpi = 0;
for(int i=0;i<song.length;i++)
    {
      Music m=new Music();
      rs1=m.Search(song[i]);
        out.println("<tr><td align=center><h4>"+song[i]+"</h4>");
        if(rs1.next())
        {
            String imid=rs1.getString("image_id");
        out.println("<td valign=center><img src=img/"+imid+".jpg height=75 width=75>");
        out.println("<form name=newform action=updateraheel>");
        out.println("<td><input type=text name=test_text"+i+" id=test_text >&nbsp"
                + Integer.parseInt(rs1.getString("price"))+ "</tr>");
        
      
            costpi += Integer.parseInt(rs1.getString("price"));
        }
     }

out.println("<input type=submit value=updateit>");
out.println("</form>");
 out.println("<tr><td><h4>Your Total cost </h4></td><td>"+ costpi+"</td></tr>");
 out.println("<tr><td colspan=2 align=center><h4>Enter your pass key to buy the above objects</h4></tr>");
 out.println("<form name=passkey action=verifypasskey method=post>");
            out.println("<tr><td><h4>passkey:</h4></td><td><input id=\"passkey\" type=password name=\"passkey\"/></td></tr>");
            out.println("<input type=hidden name=hidden1 value="+costpi+">");
            out.println("<tr><td colspan=2 align=center><input type=submit value=verify></tr>");
            out.println("</table></form></center></body></html>");
        }




        } finally {            
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(buytryN2.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(buytryN2.class.getName()).log(Level.SEVERE, null, ex);
        }
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
