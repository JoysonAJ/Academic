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
import java.util.Arrays;
import java.util.Comparator;



/**
 *
 * @author JOYSON
 */
@WebServlet(urlPatterns = {"/largest_nth_servlet"})
public class largest_nth_servlet extends HttpServlet {

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
            out.println("<title>Servlet largest_nth_servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String value = request.getParameter("numbersArray");

            int largeNth = Integer.parseInt(request.getParameter("numberN"));

            String[] valueArray = value.split(",");

            int arryaLength = valueArray.length;

            Integer[] numberArray = new Integer[arryaLength];

            for(int i=0;i<arryaLength;i++){
                numberArray[i]= (Integer) Integer.parseInt(valueArray[i]);
            }

            Arrays.sort(numberArray,Comparator.reverseOrder());

            int nw = 0;
            for (int i = 0; i < numberArray.length - 1; i++) {
            if (numberArray[i] != numberArray[i + 1])
                numberArray[nw++] = numberArray[i];
        }

        if (nw > largeNth) {
            System.out.println( numberArray[largeNth - 1]);
            out.println("<h2> The Nth Value is equal to"+numberArray[largeNth - 1]+" </h2>");
        }else
        out.println("<h2> Invalid N number </h2>");

            out.println("</body>");
            out.println("</html>");
        }
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
