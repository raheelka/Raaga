/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import classes.User;
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
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Karan
 */
@WebServlet(name="entry1", urlPatterns={"/entry1"})
public class entry1 extends HttpServlet {
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
            out.println("hello");

            
            User u=new User();
            u.setLoginName(""+(request.getParameter("username")));
            u.setPwd(""+(request.getParameter("pass"))); 
            u.setCCN(""+(request.getParameter("ccn"))); 
            u.setUserName(""+(request.getParameter("name"))); 
            u.setAddress(""+(request.getParameter("add1"))); 
            u.setE_mail(""+(request.getParameter("em"))); 
            u.setMobile_no(""+(request.getParameter("mob"))); 
           // Login l=new Login();
            u.addlogin();
            
            RequestDispatcher view=request.getRequestDispatcher("loginmod1.html");
            view.forward(request, response);

            /*Connection con=abc.getConnection();
            Statement stat=con.createStatement();
            String username=request.getParameter("username");
            //int flag=0;
            out.println(username);
            ResultSet rs=stat.executeQuery("select username from APP.user_details where username='"+username+"'");
            if(!rs.next())
            {
            out.println("inside if");
            PreparedStatement ps=con.prepareStatement("insert into APP.user_details values(?,?,?,?,?,?,?)");
	    ps.setString(1, request.getParameter("username"));
            ps.setString(2, request.getParameter("pass"));
            ps.setString(3,request.getParameter("ccn"));
            ps.setString(4,request.getParameter("name"));
            ps.setString(5,request.getParameter("add1"));
            ps.setString(6,request.getParameter("em"));
            ps.setString(7,request.getParameter("mobn"));
            ps.executeUpdate();
	    con.commit();
	    ps.close();
                response.sendRedirect("loginmod1.html");
            //out.println("<html><h1>Hello</h1>" );
           // out.println(checkout+"</html>");
            }
            else
            {

            out.println("<html>");
            out.println("<head>");
            out.println("<script type=text/javascript> window.history.back(); alert(\"Username already exist\"); document.write(\"this is mine\"); </script>");
            out.println("</head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
   }
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet entry1</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet entry1 at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
            
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


