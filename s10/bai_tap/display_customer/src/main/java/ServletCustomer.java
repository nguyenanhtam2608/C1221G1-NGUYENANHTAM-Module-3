import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletCustomer", value = "/customer")



public class ServletCustomer extends HttpServlet {
    static List<Customer> listCustomer = new ArrayList<Customer>();

    static {
        Customer customer1 = new Customer("Nat", "26-08-2002", "Quảng Nam", "https://nld.mediacdn.vn/291774122806476800/2021/7/26/hien-ho3-3914-1544517135-4718-1576571294-16272617895681377367777.jpg");
        Customer customer2 = new Customer("Nat", "26-08-2002", "Quảng Nam", "https://nld.mediacdn.vn/291774122806476800/2021/7/26/hien-ho3-3914-1544517135-4718-1576571294-16272617895681377367777.jpg");
        Customer customer3 = new Customer("Nat", "26-08-2002", "Quảng Nam", "https://nld.mediacdn.vn/291774122806476800/2021/7/26/hien-ho3-3914-1544517135-4718-1576571294-16272617895681377367777.jpg");
        Customer customer4 = new Customer("Nat", "26-08-2002", "Quảng Nam", "https://nld.mediacdn.vn/291774122806476800/2021/7/26/hien-ho3-3914-1544517135-4718-1576571294-16272617895681377367777.jpg");
        listCustomer.add(customer1);
        listCustomer.add(customer2);
        listCustomer.add(customer3);
        listCustomer.add(customer4);

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customer", listCustomer);
        request.getRequestDispatcher("/display.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
