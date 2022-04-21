package case_study.controller;

import case_study.model.Service;
import case_study.service.ServiceService;
import case_study.service.impl.ServiceServiceIpml;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ServiceController", urlPatterns = "/service")
public class ServiceController extends HttpServlet {
    ServiceService serviceService = new ServiceServiceIpml();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateService(request, response);
                break;
            default:
                showListService(request, response);

        }


    }

    private void showCreateService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/service/create.jsp");
        requestDispatcher.forward(request, response);
    }

    private void showListService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Service> serviceList = serviceService.selectAllService();
        request.setAttribute("serviceList", serviceList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/service/list.jsp");
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
                insertService(request, response);
                break;

            default:
                showListService(request, response);

        }
    }

    private void insertService(HttpServletRequest request, HttpServletResponse response) throws IOException {
            Integer id = null;
        String serviceName = request.getParameter("serviceName");
        int serviceArea = Integer.parseInt(request.getParameter("serviceArea"));
        double cost = Double.parseDouble(request.getParameter("cost"));
        int serviceMaxPeople = Integer.parseInt(request.getParameter("serviceMaxPeople"));
        int rentTypeId = Integer.parseInt(request.getParameter("rentTypeId"));
        int serviceTypeId = Integer.parseInt(request.getParameter("serviceTypeId"));
        String standardRoom = request.getParameter("standardRoom");
        String descriptionOtherConvenience = request.getParameter("descriptionOtherConvenience");
        double poolArea = Double.parseDouble(request.getParameter("poolArea"));
        int numberOfFloors = Integer.parseInt(request.getParameter("numberOfFloors"));

        Service service = new Service(serviceName,serviceArea, cost, serviceMaxPeople, rentTypeId, serviceTypeId, standardRoom, descriptionOtherConvenience, poolArea, numberOfFloors);

        try {
            serviceService.insertCustomer(service);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        response.sendRedirect("service");

    }
}
