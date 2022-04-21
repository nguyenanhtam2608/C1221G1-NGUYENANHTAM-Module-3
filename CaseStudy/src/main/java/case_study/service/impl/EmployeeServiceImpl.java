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
}
