package case_study.controller;

import case_study.model.Customer;
import case_study.service.CustomerService;

import case_study.service.impl.CustomerServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerController", urlPatterns = "/customer")
public class CustomerController extends HttpServlet {
    CustomerService customerService = new CustomerServiceImpl();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");// gửi action qua cho server
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateCustomer(request, response);
                break;
            case "delete":
                showDeleteCustomer(request, response);
                break;
            case "edit":
                showUpdateCustomer(request, response);
            default:
                showListCustomer(request, response);

        }

    }

    private void showUpdateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        Customer customer = customerService.findById(id);
        request.setAttribute("customer", customer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/edit.jsp");
        dispatcher.forward(request, response);

    }

    private void showCreateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/customer/create.jsp");
        requestDispatcher.forward(request, response);
    }


    private void showDeleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.findById(id);
        request.setAttribute("customer", customer);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/customer/delete.jsp");
        requestDispatcher.forward(request, response);

    }

    private void showListCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = customerService.selectAllCustomer();
        request.setAttribute("listCustomer", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/list.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                insertCustomer(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            case "edit":
                updateCustomer(request, response);


        }
    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) {
        int customer_type_id = Integer.parseInt(request.getParameter("customer_type_id"));
        String customer_name = request.getParameter("customer_name");
        String customer_birthday = request.getParameter("customer_birth_day");
        int customer_gender = Integer.parseInt(request.getParameter("customer_gender"));
        int customer_id_card = Integer.parseInt(request.getParameter("customer_id_card"));
        String customer_phone = request.getParameter("customer_phone");
        String customer_email = request.getParameter("customer_email");
        String customer_address = request.getParameter("customer_address");
        Customer customer = new Customer(customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address);
        customerService.updateCustomer(customer);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        Integer idCustomer = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.findById(idCustomer);
        RequestDispatcher dispatcher;
        if (customer == null) {
            dispatcher = request.getRequestDispatcher("view/error.jsp");
        } else {
            try {
                customerService.deleteCustomer(idCustomer);
                response.sendRedirect("/customer");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private void insertCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        int customer_type_id = Integer.parseInt(request.getParameter("customer_type_id"));
        String customer_name = request.getParameter("customer_name");
        String customer_birthday = request.getParameter("customer_birth_day");
        int customer_gender = Integer.parseInt(request.getParameter("customer_gender"));
        int customer_id_card = Integer.parseInt(request.getParameter("customer_id_card"));
        String customer_phone = request.getParameter("customer_phone");
        String customer_email = request.getParameter("customer_email");
        String customer_address = request.getParameter("customer_address");
        Customer customer = new Customer(customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address);
        try {
            customerService.insertCustomer(customer);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        response.sendRedirect("customer");


    }
}
