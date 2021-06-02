
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 839217
 */
public class arithmeticCalculatorServlet extends HttpServlet {

   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstNumber= request.getParameter("firstNumber");
        String secondNumber= request.getParameter("secondNumber");
      if(firstNumber== null || firstNumber.equals("") || secondNumber== null || secondNumber.equals("")){
        request.setAttribute("result", "--");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        return;
        }
      //initializing variables to use for validation
        int first;
        int second;
        try {
            first = Integer.parseInt(firstNumber);
            second = Integer.parseInt(secondNumber);
        } 
        catch (NumberFormatException e) {
            request.setAttribute("result", "Invalid");
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
           return;
        }
        
        
        first = Integer.parseInt(firstNumber);
        second = Integer.parseInt(secondNumber);
       int result = 0;
       
       String operation = request.getParameter("operation");
       
       if(operation .equals("+")){
           result = first + second;
       }
       else if(operation .equals("-")){
           result = first - second;
       }
       else if(operation .equals("*")){
           result = first * second;
       }
       
       else {
           result = first % second;
       }
       

       request.setAttribute("result", result);
      
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }


}
