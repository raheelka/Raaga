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
@WebServlet(name="buy", urlPatterns={"/buy"})
public class buy extends HttpServlet {
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
           String cuser= (String)cur.getAttribute("username");
           String s=(String)cur.getAttribute("song");
           String song[]=s.split(",");
           if(cuser==null)
           {
               response.sendRedirect("loginmod.html");
           }
 else
           {
               Connection con=abc.getConnection();
            Statement st=con.createStatement();
            ResultSet rs;
            ResultSet rs2=st.executeQuery("select song from APP.placeorder where username='"+cuser+"'");
            while(rs2.next())
            {
                
            }

                out.println("<html>");
            out.println("<head>");
            out.println("<style>body {background-image: url(img/chomecopy.jpg);}");
out.println("h4{font-family: Calligrapher;font-face: Calligrapher;}</style></head>");
out.println("<br><br><br><br><br><br><br><br><br><br><br><br>");
out.println("<center>");
           // out.println("<body>");
          //  out.println("<center>");
int costpi=0;
out.println("your chart contains <br>");
for(int i=0;i<song.length;i++)
{
    out.println(song[i]+"<br>");
     rs=st.executeQuery("select * from APP.music where name='"+song[i]+"'");
     if(rs.next())
     {
     costpi+=Integer.parseInt(rs.getString("price"));
}
               }
               out.println("<br> your total cost is ");
out.println(costpi+"");


            out.println("<br>Enter your pass key to buy the above objects");
            out.println("<form name=passkeey action=verifypasskey method=post>");
            out.println("passkey:<input id=\"passkey\" type=text name=\"passkey\"/><br>");
            out.println("<input type=hidden name=hidden1 value="+costpi+">");

            out.println("<input type=submit value=verify>");
            out.println("</form>");
            
           /*String pass=request.getParameter("passkey");
            Connection con=pqr.getConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from bank where username='"+cuser+"' and passkey='"+pass+"'");
            if(rs.next())
            {
              out.println("YEs");
            }
 else

               {
                    out.println("Get lost");
               }
            */
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet buy</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet buy at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
 out.println("</center>");
              out.println("</body>");
             out.println("</head>");
              out.println("</html>");

 }} catch(Exception e){}
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
