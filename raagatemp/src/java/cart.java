/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

/**
 *
 * @author Karan
 */
@WebServlet(name="cart", urlPatterns={"/cart"})
public class cart extends HttpServlet {
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
            HttpSession cur=request.getSession(true);
            String cuser=(String)cur.getAttribute("username");
           

            if(cuser==null)
                response.sendRedirect("loginmod.html");

            else
            {
out.println("<html><head>");
out.println("<style>body {background-image: url(chomecopy.jpg);}");
 out.println("h2{font-family: Calligrapher; font-face: Calligrapher;font-weight: bold;color: #753A00;}");
       out.println("h4{font-family: Calligrapher; font-face: Calligrapher;font-weight:bold;color: #753A00;}</style>");
out.println("<br><br><br><br><br><br><br><br><br><br><br><br>");
out.println("<center>");

            String select[]=request.getParameterValues("checkin");
            out.println("<h2>YOUR CART CONTAINS: <br>");
            for(int i=0;i<select.length;i++)
            {
                if (select[i] != null)
                out.println(select[i]+"<br>");
            }
            String song=new String();
            for(int i=0;i<select.length;i++)
            {
                song+=""+select[i]+",";
            }
            Connection con=abc.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into APP.placeorder values(?,?)");

            ps.setString(1,cuser);
            ps.setString(2,song);

            ps.executeUpdate();
            con.commit();
            ps.close();
            //HttpSession cur=request.getSession();
            //cur.setAttribute("song",song);
            out.println("confirm order ??");
            out.println("<form name=form1 action=buytry >");
            out.println("<input type=submit value=buy></h4>");
            out.println("</form>");



            
           // out.println("<html>");
            //out.println("<head>");
            //out.println("<title>Servlet cart</title>");
            //out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet cart at " + request.getContextPath () + "</h1>");
            
            out.println("<form name=form2 action=buy.html>");
            out.println("<input type=submit value=\"buy more\">");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
            
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
