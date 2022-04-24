package case_study.service.impl;

import case_study.model.Employee;
import case_study.reposition.impl.EmployeeRepositoryImpl;
import case_study.service.EmployeeService;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepositoryImpl employeeRepository = new EmployeeRepositoryImpl();
    @Override
    public List<Employee> selectAllEmployee() {
        return employeeRepository.selectAllEmployee();
    }

    @Override
    public void insertEmployee(Employee employee) throws SQLException {
        employeeRepository.insertEmployee(employee);
    }

    @Override
    public boolean deleteEmployee(int id) throws SQLException {
        return employeeRepository.deleteEmployee(id);
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        return employeeRepository.updateEmployee(employee);
    }

    @Override
    public List<Employee> searchByNamePositionEmail(String keywordName, String keywordPosition, String keywordEmail) throws SQLException {
        return employeeRepository.searchByNamePositionEmail(keywordName,keywordPosition,keywordEmail);
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id);
    }

}
