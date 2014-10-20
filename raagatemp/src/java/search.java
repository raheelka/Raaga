/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import classes.Music;
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
 * @author Junaid Kazi
 */
@WebServlet(name="search", urlPatterns={"/search"})
public class search extends HttpServlet {
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
           String entered_search=request.getParameter("search");
           int k=0;
           Music m = new Music();
           ResultSet rs = m.Search(entered_search);
           if(rs.next())
           {
           
           String name = rs.getString("name");
           out.println(name);
           
           request.setAttribute("result", rs);
           RequestDispatcher view=request.getRequestDispatcher("searchresult.jsp");
           view.forward(request, response);
           }
           else{out.println("hii");
           }
        }catch(Exception e ){}
    }
    
        /*   out.println("<html>");
            out.println("<head>");
            out.println("<style>body {background-image: url(chomecopy.jpg);}");
 out.println("h2{font-family: Calligrapher; font-face: Calligrapher;font-weight: bold};");
  out.println("a:link {text-decoration: none; color:#753A00;}"
                   + "a:visited {text-decoration: none; color:#753A00;}"
                   + "a:hover {text-decoration: underline;}");
       out.println("h4{font-family: Calligrapher; font-face: Calligrapher;font-weight:bold}</style>");
     
            out.println("<body>");
            out.println("<center>");


        out.println("<form name=checking action=cart>");
        out.println("<table border=\"1\" rows=\"10\" cols=\"3\">");
        out.println("<br><br><br><br><br><br><br><br><br><br><br>");
           while(rs.next())
           {
               if(k%3==0)
               out.println("<tr>");
             
               out.println("<td>");
                // out.println(k+"");
               String imgid=rs.getString("imageid");
               //out.println(imgid);
               String name=rs.getString("name");
              // out.println(name);

             
               //out.println("<h4>"+imgid+"</a>");
              
               out.println("<a href=page"+imgid+".html><img src=img/"+imgid+".jpg height=\"150\" width=\"150\"></a>");

               //out.println("reached here");
                out.println("<input type=checkbox name=checkin id=checkin selected=no value="+name+">");
             
             //   out.println("test");
          
               out.println("</h4>");
           // out.println(imgid);
               out.println("</td>");
               k++;
            if(k%3==0)
           out.println("</tr>");
           
           }
        out.println("</table>");
        out.println("<input type=submit value=\"Add To Cart\">");

        out.println("</form>");
out.println("<a href=newhome.html><h4>Go to home</h4></a>");

              out.println("</center>");
              out.println("</body>");
             out.println("</head>");
              out.println("</html>");
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
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


