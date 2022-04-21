package case_study.reposition;

import case_study.model.Employee;
import case_study.model.Service;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeRepository {
    List<Employee> selectAllEmployee();
    void insertEmployee(Employee employee) throws SQLException;

}
