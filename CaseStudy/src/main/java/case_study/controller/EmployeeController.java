package case_study.controller;

import case_study.model.Division;
import case_study.model.EducationDegree;
import case_study.model.Employee;
import case_study.model.Position;
import case_study.service.DivisionService;
import case_study.service.EducationDegreeService;
import case_study.service.EmployeeService;
import case_study.service.PositionService;
import case_study.service.impl.DivisionServiceImpl;
import case_study.service.impl.EducationDegreeServiceImpl;
import case_study.service.impl.EmployeeServiceImpl;
import case_study.service.impl.PositionServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "EmployeeController", urlPatterns = "/employee")
public class EmployeeController extends HttpServlet {
    EmployeeService employeeService = new EmployeeServiceImpl();
    PositionService positionService = new PositionServiceImpl();
    EducationDegreeService educationDegreeService = new EducationDegreeServiceImpl();
    DivisionService divisionService = new DivisionServiceImpl();

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
            case "search":
                try {
                    searchEmployeeByNamePositionEmail(request,response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            case "edit":
                showUpdateEmployee(request,response);
                break;
            default:
                showListEmployee(request, response);
        }
    }

    private void showUpdateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = employeeService.findById(id);
        request.setAttribute("employee",employee);
        List<Position> positionList = positionService.selectAllPosition();
        request.setAttribute("positionList", positionList);
        List<EducationDegree> educationDegreeList = educationDegreeService.selectAllEducationDegree();
        request.setAttribute("educationDegreeList", educationDegreeList);
        List<Division> divisionList = divisionService.selectAllDivision();
        request.setAttribute("divisionList", divisionList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/employee/edit.jsp");
        requestDispatcher.forward(request, response);

    }

    private void searchEmployeeByNamePositionEmail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String keywordName = request.getParameter("searchName");
        String keywordPosition = request.getParameter("searchPosition");
        String keywordEmail = request.getParameter("searchEmail");
        System.out.println(keywordName + keywordPosition + keywordEmail);
        List<Employee> employeeList = employeeService.searchByNamePositionEmail(keywordName, keywordPosition, keywordEmail);
        request.setAttribute("employeeList", employeeList);
        List<Position> positionList = positionService.selectAllPosition();
        request.setAttribute("positionList", positionList);
        List<EducationDegree> educationDegreeList = educationDegreeService.selectAllEducationDegree();
        request.setAttribute("educationDegreeList", educationDegreeList);
        List<Division> divisionList = divisionService.selectAllDivision();
        request.setAttribute("divisionList", divisionList);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/employee/list.jsp");
        requestDispatcher.forward(request, response);
    }


    private void showCreateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Position> positionList = positionService.selectAllPosition();
        request.setAttribute("positionList", positionList);
        List<EducationDegree> educationDegreeList = educationDegreeService.selectAllEducationDegree();
        request.setAttribute("educationDegreeList", educationDegreeList);
        List<Division> divisionList = divisionService.selectAllDivision();
        request.setAttribute("divisionList", divisionList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/employee/create.jsp");
        requestDispatcher.forward(request, response);

    }

    private void showListEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employeeList = employeeService.selectAllEmployee();
        request.setAttribute("employeeList", employeeList);
        List<Position> positionList = positionService.selectAllPosition();
        request.setAttribute("positionList", positionList);
        List<EducationDegree> educationDegreeList = educationDegreeService.selectAllEducationDegree();
        request.setAttribute("educationDegreeList", educationDegreeList);
        List<Division> divisionList = divisionService.selectAllDivision();
        request.setAttribute("divisionList", divisionList);
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
            case "delete":
                deleteEmployee(request, response);
                break;
            case "edit":
                updateEmployee(request,response);
break;
            default:
                showListEmployee(request, response);
        }
    }

    private void updateEmployee(HttpServletRequest request, HttpServletResponse response) {
        int idEmployee = Integer.parseInt(request.getParameter("idEmployee"));
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
        Employee employee = new Employee(idEmployee,nameEmployee,birthdayEmployee,idCardEmployee,salaryEmployee,phoneEmployee,emailEmployee,addressEmployee,idPosition,idEducationDegree,idDivision);
        employeeService.updateEmployee(employee);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idEmployee"));
        try {
            employeeService.deleteEmployee(id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
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
