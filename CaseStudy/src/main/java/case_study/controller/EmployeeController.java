package case_study.controller;

import case_study.model.Employee;
import case_study.service.EmployeeService;
import case_study.service.impl.EmployeeServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "EmployeeController", urlPatterns = "/employee")
public class EmployeeController extends HttpServlet {
    EmployeeService employeeService = new EmployeeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateEmployee(request, response);
                break;
            default:
                showListEmployee(request, response);
        }
    }

    private void showCreateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/employee/create.jsp");
        requestDispatcher.forward(request, response);
    }

    private void showListEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employeeList = employeeService.selectAllEmployee();
        request.setAttribute("employeeList", employeeList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/employee/list.jsp");
        requestDispatcher.forward(request, response);

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
                insertEmployee(request, response);
                break;
            default:
                showListEmployee(request, response);
        }
    }

    private void insertEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String nameEmployee = request.getParameter("nameEmployee");
        String birthdayEmployee = request.getParameter("birthdayEmployee");
        int idCardEmployee = Integer.parseInt(request.getParameter("idCardEmployee"));
        double salaryEmployee = Double.parseDouble(request.getParameter("salaryEmployee"));
        double phoneEmployee = Double.parseDouble(request.getParameter("phoneEmployee"));
        String emailEmployee = request.getParameter("emailEmployee");
        String addressEmployee = request.getParameter("addressEmployee");
        int idPosition = Integer.parseInt(request.getParameter("idPosition"));
        int idEducationDegree = Integer.parseInt(request.getParameter("idEducationDegree"));
        int idDivision = Integer.parseInt(request.getParameter("idDivision"));
        Employee employee = new Employee(nameEmployee, birthdayEmployee, idCardEmployee, salaryEmployee, phoneEmployee, emailEmployee, addressEmployee, idPosition, idEducationDegree, idDivision);

        try {
            employeeService.insertEmployee(employee);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        response.sendRedirect("employee");

    }
}
