/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 839217
 */
public class ageCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Capture the age parameter from the post request(the form)
        String age= request.getParameter("enteredAge");
        
        
        //empty parameter check
        if(age== null || age.equals("")){
        request.setAttribute("message", "You must give your current age.");
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
        }
        
        
        //initializing a age variable to use for validation
        int inputAge;
        //invalid parameter type check
        try{inputAge=Integer.parseInt(age);}
        catch(NumberFormatException e){
        request.setAttribute("message", "You must enter a number.");
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;}
        int nextBirthdayAge=Integer.parseInt(age)+1;
        request.setAttribute("result","Your age next birthday will be "+ nextBirthdayAge);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
      
    }
}
