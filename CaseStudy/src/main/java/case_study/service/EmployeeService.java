package case_study.service;

import case_study.model.Customer;
import case_study.model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeService {
    List<Employee> selectAllEmployee();

    void insertEmployee(Employee employee) throws SQLException;

    boolean deleteEmployee(int id) throws SQLException;

    boolean updateEmployee(Employee employee);

    public List<Employee> searchByNamePositionEmail(String keywordName, String keywordPosition, String keywordEmail) throws SQLException;

    Employee findById(int id);

}
