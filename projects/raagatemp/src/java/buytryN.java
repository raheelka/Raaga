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
@WebServlet(name = "buytryN", urlPatterns = {"/buytryN"})
public class buytryN extends HttpServlet {

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
            out.println("<h1>before script<h1>");
            //out.println("<head><script type=\"text/javascript\">function getValue(){var x=document.getElementById('q1').value;var y=document.getElementById('u1').value;var z=document.getElementById('t1').value;alert(\"x=\"+x+\" y=\"+y);q1=parseInt(x,10);up=parseInt(y,10);alert(\"q1=\"+q1+\" y=\"+up);tp=q1*up;var u=tp;document.getElementById('t1').innerHTML=u;}</script></head>");
                          
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
            out.println("<tr><td colspan=2 align=center>");
            out.println("<tr><td>Product Details</td><td>Image</td><td>Quantity</td><td>Unit Price</td><td>Total</td></tr>");
ResultSet rs1 ;
int costpi = 0;
for(int i=0;i<song.length;i++)
    {
    
      //  rs1 = stat.executeQuery("select * from APP.music where name = '"+song[i]+"'");
      Music m=new Music();
      rs1=m.Search(song[i]);
        out.println("<tr><td align=center><h4>"+song[i]+"</h4>");
        if(rs1.next())
        {
            String imid=rs1.getString("image_id");
            String uprice=rs1.getString("price");
            String tprice=uprice;
            
                    
            out.println("<td valign=center><img src=img/"+imid+".jpg height=75 width=75></td>");
            out.println("<td valign=center><input type=\"text\" value=\"\" name=\"quant\" id=\"q1\" size=\"2\" /><br><a href=\"#\" >Update</a></td>");
            out.println("<td valign=center id=\"u1\">"+uprice+"</td>");
            out.println("<td valign=center> <span id=\"t1\">"+tprice+"</span></td></tr>");
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(buytryN.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(buytryN.class.getName()).log(Level.SEVERE, null, ex);
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
