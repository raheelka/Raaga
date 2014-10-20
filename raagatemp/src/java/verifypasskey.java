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
 * @author Karan
 */
@WebServlet(name="verifypasskey", urlPatterns={"/verifypasskey"})
public class verifypasskey extends HttpServlet {
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
 out.println("h2{font-family: Calligrapher; font-face: Calligrapher;font-weight: bold;color:#753A00;}");
       out.println("h4{font-family: Calligrapher; font-face: Calligrapher;font-weight:bold;color:#753A00;}");
           out.println("a:link {text-decoration: none; color:#753A00;}"
                   + "a:visited {text-decoration: none; color:#753A00;}"
                   + "a:hover {text-decoration: underline;}</style></head>");
       out.println("<br><br><br><br><br><br><br><br><br><br>");
            out.println("<body><center>");
             HttpSession cur=request.getSession(true);
           String cuser= (String)cur.getAttribute("username");
           String s=(String)cur.getAttribute("song");
           //String song[]=s.split(",");
           if(cuser==null)
             {
               response.sendRedirect("login.html");
             }
        else
             {
                String pass=request.getParameter("passkey");
                Connection con=abc.getConnection();
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select * from APP.bank where username='"+cuser+"' and passkey='"+pass+"'");


                PreparedStatement ps=con.prepareStatement("delete from APP.placeorder where username='"+cuser+"'");
                ps.executeUpdate();
                con.commit();
                int totalcost=0;
           // ResultSet rs2=st.executeQuery("select bal from APP.bank where username='"+cuser+"'");

                 int balance=0;

                 if(rs.next())
                    {
                        out.println("<h2>Passkey Accepted</h2>");
                        balance=Integer.parseInt(rs.getString("bal"));
                       // out.println("earlier balance"+balance);
                        totalcost=Integer.parseInt(request.getParameter("hidden1"));
                        balance=balance-totalcost;
                        //out.println("balance now is "+balance);
                        
                        if (balance<0)
                           {
                            response.sendRedirect("insuff.html");
                           }
                        else
                            {
                               // out.println("before update");
                               String bals= balance+"";
                                ps=con.prepareStatement("update APP.bank set bal='"+ bals+"' where username='"+cuser+"'");
                                ps.executeUpdate();
                                con.commit();
                                out.println("<h2>Thanks For Buying</h2><br>");
                                out.println("<h2>Have A Nice Day</h2><br>");
                               // out.println("after update");
                                /*ps=con.prepareStatement("delete from APP.placeorder where username='"+cuser+"'");
                                    ps.executeUpdate();
                                con.commit();
                                */
                            ps.close();
                            }
                        }
                        else
                            {
                                out.println("<h4>Passkey Invaild</h4>");
                            }
                         }
 
            
           // out.println("<html>");
           // out.println("<head>");
            //out.println("<title>Servlet verifypasskey</title>");
           // out.println("</head>");
           // out.println("<body>");
       
     out.println("<h4><a href =\"newhome.html\">Homepage</a>&nbsp &nbsp <a href =\"logout\">Logout</a></h4>");
  
            //out.println("<h1>Servlet verifypasskey at " + request.getContextPath () + "</h1>");
            out.println("</center></body>");
            out.println("</html>");
            
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
