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

/**
 *
 * @author Karan
 */
@WebServlet(name="login1", urlPatterns={"/login1"})
public class login1_useless extends HttpServlet {
    @Resource(name = "say")
    private DataSource say;
   
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
            //String username=request.getParameter("username");
            //String pass=request.getParameter("pass");
            Connection con=say.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into APP.user_details values(?,?)");

            ps.setString(1,request.getParameter("username"));
            ps.setString(2,request.getParameter("pass"));

            ps.executeUpdate();
            con.commit();
            ps.close();
        //    out.println("done:");
            Statement stat=con.createStatement();
                    ResultSet rs=stat.executeQuery("select * from APP.music");

                    while(rs.next())
                    {
                        String a=rs.getString("name");
                        String b=rs.getString("artist");
                        String c=rs.getString("price");
                        String d=rs.getString("type");
                        out.println(a);
                        out.println(b);
                        out.println(c);
                        out.println(d);

                    }

                   
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet login1</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet login1 at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
        }
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
