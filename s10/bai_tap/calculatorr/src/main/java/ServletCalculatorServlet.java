import model.Calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletCalculatorServlet", value = "/calculate")
public class ServletCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstOperand = Integer.parseInt(request.getParameter("first-operand"));
        float secondOperand = Integer.parseInt(request.getParameter("second-operand"));
        char operator = request.getParameter("operator").charAt(0);
        float result = 0;
        String mes="";
        try {
            result = Calculator.calculate(firstOperand, secondOperand, operator);

        } catch (Exception exception) {
            mes="Phép chia cho 0 !!!!!";
        }

        request.setAttribute("first", firstOperand);
        request.setAttribute("sencond", secondOperand);
        request.setAttribute("operator", operator);
        request.setAttribute("result", result);
        request.setAttribute("mes", mes);
        request.getRequestDispatcher("display.jsp").forward(request, response);

    }
}
