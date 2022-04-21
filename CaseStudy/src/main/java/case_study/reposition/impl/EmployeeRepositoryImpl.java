package case_study.reposition.impl;

import case_study.model.Employee;
import case_study.reposition.BaseRepository;
import case_study.reposition.EmployeeRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
        private static final String INSERTEMPLOYEE =" insert into employee ( employee_name, employee_birthday, employee_id_card, employee_salary, employee_phone, employee_email, employee_address, position_id, education_degree_id, division_id) values (?,?,?,?,?,?,?,?,?,?)";
    BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Employee> selectAllEmployee() {
        List<Employee> employeeList= new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select * from employee");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("employee_id");
                String name = resultSet.getString("employee_name");
                String birthdate = resultSet.getString("employee_birthday");
                int employeeIdCard = resultSet.getInt("employee_id_card");
                double employeeSalary = resultSet.getDouble("employee_salary");
                double employeePhone = resultSet.getDouble("employee_phone");
                String employeeEmail = resultSet.getString("employee_email");
                String employeeAddress = resultSet.getString("employee_address");
                int positionId = resultSet.getInt("position_id");
                int educationDegreeId = resultSet.getInt("education_degree_id");
                int divisionId = resultSet.getInt("division_id");
                employeeList.add(new Employee(id,name,birthdate,employeeIdCard,employeeSalary,employeePhone,employeeEmail,employeeAddress,positionId,educationDegreeId,divisionId));

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return employeeList;
    }

    @Override
    public void insertEmployee(Employee employee) throws SQLException {
        PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement(INSERTEMPLOYEE);
        preparedStatement.setString(1,employee.getNameEmployee());
        preparedStatement.setString(2,employee.getBirthdayEmployee());
        preparedStatement.setInt(3,employee.getIdCardEmployee());
        preparedStatement.setDouble(4,employee.getSalaryEmployee());
        preparedStatement.setDouble(5,employee.getPhoneEmployee());
        preparedStatement.setString(6,employee.getEmailEmployee());
        preparedStatement.setString(7,employee.getAddressEmployee());
        preparedStatement.setInt(8,employee.getIdPosition());
        preparedStatement.setInt(9,employee.getIdEducationDegree());
        preparedStatement.setInt(10,employee.getIdDivision());
        preparedStatement.executeUpdate();


    }
}
