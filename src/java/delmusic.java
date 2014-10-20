/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


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
@WebServlet(name="delmusic", urlPatterns={"/delmusic"})
public class delmusic extends HttpServlet {
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
            out.println("<html><head>");
            out.println("<style>body {background-image: url(chomecopy.jpg);}");
            out.println("h2{font-family: Calligrapher; font-face: Calligrapher;font-weight: bold;color: #753A00;}");
            out.println("h4{font-family: Calligrapher; font-face: Calligrapher;font-weight:bold;color: #753A00;}</style>");
            out.println("<br><br><br><br><br><br><br><br><br><br><br><br>");
            out.println("<center>");
            HttpSession cu = request.getSession(true);
            String cuser = (String)cu.getAttribute("username");
            if(cuser.equals("admin"))
            {
            Connection con = abc.getConnection();
            Statement stat = con.createStatement();
            String sname=request.getParameter("sname");
            ResultSet rs=stat.executeQuery("select * from app.music where name='"+sname+"'");
            if(!rs.next())
            {

                out.println("<script type=text/javascript> window.history.back(); alert(\"Song doesn't exist\");</script></head>");
            }
            out.println("<body>");

            PreparedStatement ps=con.prepareStatement("delete from app.music where name='"+sname+"'");
            ps.executeUpdate();
            con.commit();
            ps.close();
            out.println("<h4>Song Deleted</h4>");
            out.println("<h4>Go to <a href =\"admin.jsp\">HOME</a> Page</h4><br>");
            out.println("<h4><a href =\"logout\">Log Out</a></h4>");
            out.println("</body>");
            out.println("</html>");
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet delmusic</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet delmusic at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
            }
        } catch(Exception e){}
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
