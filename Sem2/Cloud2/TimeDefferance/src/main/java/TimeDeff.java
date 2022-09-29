/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author JOYSON
 */
@WebServlet(urlPatterns = {"/TimeDeff"})
public class TimeDeff extends HttpServlet {

    private Object timeInput2;
    private Object timeInput1;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TimeDeff</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>The Date Time Deffrance</h1>");
            
            String time1 = request.getParameter("First");
            String time2 = request.getParameter("Second");
            
            String[] timeArray1 = time1.split(":");
            String[] timeArray2 = time2.split(":");
            
            Boolean Hous = AnsTime(Integer.parseInt(timeArray1[0]), Integer.parseInt(timeArray2[0]), 24);
            Boolean min = AnsTime(Integer.parseInt(timeArray1[1]), Integer.parseInt(timeArray2[1]), 60);
            Boolean secds = AnsTime(Integer.parseInt(timeArray1[2]), Integer.parseInt(timeArray2[2]), 60);
            
            if ((Hous == true) && (min == true) && (secds == true)) {

                int hrs = 00, ms = 00, scs = 00;
    
                hrs = Integer.parseInt(timeArray2[0]) - Integer.parseInt(timeArray1[0]);
    
                if (hrs < 0)
                    hrs += 24;
    
                ms = Integer.parseInt(timeArray2[1]) - Integer.parseInt(timeArray1[1]);
    
                if (ms < 0) {
                    ms += 60;
                    hrs--;
                }
    
                scs = Integer.parseInt(timeArray2[2]) - Integer.parseInt(timeArray1[2]);
    
                if (scs < 0) {
                    scs += 60;
                    ms--;
                }
                out.println("<h2>"); 
                out.println("Time Defferance is equal ="+hrs + ":" + (long)ms + ":" + (long)scs);
                out.println("</h2>");
            } else 
                out.println("<h2> Time with in the range");
            

            out.println("</body>");
            out.println("</html>");
        }
    }

    public Boolean AnsTime(int Time1, int Time2, int Condition) {

        if (Time1 < Condition && Time2 < Condition)
            return true;
        return false;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
