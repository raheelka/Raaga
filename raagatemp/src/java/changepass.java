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
import javax.sql.DataSource;
import java.sql.*;
import javax.servlet.http.HttpSession;
/**
 *
 * @author sony
 */
@WebServlet(name="changepass", urlPatterns={"/changepass"})
public class changepass extends HttpServlet {
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
            Connection con=abc.getConnection();
            Statement stat=con.createStatement();
            HttpSession cur=request.getSession(true);
            String cuser=(String)cur.getAttribute("username");
            //out.println(cuser);
            if(cuser==null)
            {
                response.sendRedirect("loginmod.html");
            }
 else
            {
                String opass=request.getParameter("opass");
                ResultSet rs=stat.executeQuery("select password from APP.user_details where username='"+cuser+"' and password='"+opass+"'");
                if(!rs.next())
                {


                    out.println("<html>"
                            + "<head>"
                            + "<script type=text/javascript> "
                            + "alert(\"password doesnt match\");"
                            + "window.history.back();"
                            + "</script>"
                            + "</head>"
                            + "</html>");
                }
 else{
                String npass=request.getParameter("npass");
                //Connection con=abc.getConnection();
                PreparedStatement ps=con.prepareStatement("update APP.user_details set password='"+npass+"'where username='"+cuser+"' and password='"+opass+"'");
               ps.executeUpdate();
               con.commit();
               ps.close();
                out.println("password changed");
 }

            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet changepass</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet changepass at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
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
