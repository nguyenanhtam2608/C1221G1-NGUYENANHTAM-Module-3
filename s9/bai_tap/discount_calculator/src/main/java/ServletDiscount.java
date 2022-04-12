import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletDiscount", urlPatterns = "/discount")
public class ServletDiscount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount"));

        float discount_amount = (float) (price * discount * 0.01);
        float result = price - discount_amount;
        request.setAttribute("price", price);
        request.setAttribute("discount", discount);
        request.setAttribute("discount_a", discount_amount);
        request.setAttribute("result", result);
        request.getRequestDispatcher("/result.jsp").forward(request, response);




//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("<h1>Price: " + price + "</h1>");
//        writer.println("<h1>Discount Percent: " + discount + "%</h1>");
//        writer.println("<h1>Discount Amount: " + discount_amount + "</h1>");
//        writer.println("<h1>Result: " + result + "</h1>");
//
//
//        writer.println("</html>");
    }
}
