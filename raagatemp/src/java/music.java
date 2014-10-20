/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import classes.Music;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.sql.*;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sony
 */
@WebServlet(name="music", urlPatterns={"/music"})
public class music extends HttpServlet {
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
       out.println("h4{font-family: Calligrapher; font-face: Calligrapher;font-weight:bold;color: #753A00;}"
               + "a:link {text-decoration: none; color:#753A00;}"+"a:visited {text-decoration: none; color:#753A00;}"+
"a:hover {text-decoration: underline;}");
out.println("</style>");
out.println("<br><br><br><br><br><br><br><br><br><br><br><br>");
out.println("<center>");


           /* HttpSession cu = request.getSession(true);
            String cuser = (String)cu.getAttribute("username");
            if(cuser.equals("admin"))
            {
*/
            //Connection con = abc.getConnection();
            //Statement stat = con.createStatement();
          
            String sname = request.getParameter("sname");
            String artist = request.getParameter("artist");
            String type = request.getParameter("type");
            String price = request.getParameter("price");
            String imageid = request.getParameter("imageid");
            Music m = new Music();
            
            m.setArtist(artist);
            m.setName(sname);
            m.setPrice(price);
            m.setType(type);
            m.setImage_id(imageid);
            m.addMusic();
           /* PreparedStatement ps=con.prepareStatement("insert into APP.music values(?,?,?,?,?)");
          
            ps.setString(1,sname);
            ps.setString(2,artist);
            ps.setString(3,type);
            ps.setString(4,price);
            ps.setString(5,imageid);
            ps.executeUpdate();
            con.commit();
            ps.close();*/
            out.println("<h4>Song Added</h4><br>");
            }
 /*else
            {

            // TODO output your page here
            //out.println("<html>");
            //out.println("<head>");
            //out.println("<title>Servlet music</title>");
            //out.println("</head>");
            out.println("<body>");
            out.println("<h4><a href = \"newhome.html\">Access Denied</a></h4>");
            //out.println("<h1>Servlet music at " + request.getContextPath () + "</h1>");
           // out.println("</body>");
       

        }
       out.println("<h4>Go to <a href =\"admin.jsp\">HOME</a> Page</h4><br>");
       out.println("<h4><a href =\"logout\">Log Out</a></h4>");
            out.println("</body>");
            out.println("</html>");
        }
         * */
        catch(Exception e){}

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
