
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
      
        
        
        
        int first = Integer.parseInt(firstNumber);
        int second = Integer.parseInt(secondNumber);
       int result;
       
       String operation = request.getParameter("operation");
       
        // chec the opearion and do the calculations
        switch (operation) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            default:
                result = first % second;
                break;
        }
       
      // send back the results
       request.setAttribute("result", result);
      
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }


}
