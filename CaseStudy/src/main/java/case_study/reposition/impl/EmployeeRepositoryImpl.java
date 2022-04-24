package case_study.reposition.impl;

import case_study.model.Customer;
import case_study.model.Employee;
import case_study.reposition.BaseRepository;
import case_study.reposition.EmployeeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static final String INSERTEMPLOYEE = " insert into employee ( employee_name, employee_birthday, employee_id_card, employee_salary, employee_phone, employee_email, employee_address, position_id, education_degree_id, division_id) values (?,?,?,?,?,?,?,?,?,?)";
    private static final String DELETEEMPLOYEE = "delete from employee where employee_id=?";
    private static final String SELECT_ID_EMPLOYEE = "select * from employee where employee_id =?";
    private static final String UPDATE_EMPLOYEE = " update employee set employee_name = ?,  employee_birthday = ? , employee_id_card = ?, employee_salary=?, employee_phone = ?, employee_email=?,employee_address=?,position_id =?,education_degree_id=?, division_id = ? where employee_id=?";
    BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Employee> selectAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select * from employee");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
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
                employeeList.add(new Employee(id, name, birthdate, employeeIdCard, employeeSalary, employeePhone, employeeEmail, employeeAddress, positionId, educationDegreeId, divisionId));

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return employeeList;
    }

    @Override
    public void insertEmployee(Employee employee) throws SQLException {
        PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement(INSERTEMPLOYEE);
        preparedStatement.setString(1, employee.getNameEmployee());
        preparedStatement.setString(2, employee.getBirthdayEmployee());
        preparedStatement.setInt(3, employee.getIdCardEmployee());
        preparedStatement.setDouble(4, employee.getSalaryEmployee());
        preparedStatement.setDouble(5, employee.getPhoneEmployee());
        preparedStatement.setString(6, employee.getEmailEmployee());
        preparedStatement.setString(7, employee.getAddressEmployee());
        preparedStatement.setInt(8, employee.getIdPosition());
        preparedStatement.setInt(9, employee.getIdEducationDegree());
        preparedStatement.setInt(10, employee.getIdDivision());
        preparedStatement.executeUpdate();


    }

    @Override
    public boolean deleteEmployee(int id) throws SQLException {
        boolean rowDelete;
        Connection connection = baseRepository.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETEEMPLOYEE);

        preparedStatement.setInt(1, id);
        rowDelete = preparedStatement.executeUpdate() > 0; //có phần tử mới được xóa
        return rowDelete;
    }

    @Override
    public boolean updateEmployee(Employee employee) {

        boolean rowUpdate = false;
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE);
            preparedStatement.setString(1, employee.getNameEmployee());
            preparedStatement.setString(2, employee.getBirthdayEmployee());
            preparedStatement.setInt(3, employee.getIdCardEmployee());
            preparedStatement.setDouble(4, employee.getSalaryEmployee());
            preparedStatement.setDouble(5, employee.getPhoneEmployee());
            preparedStatement.setString(6, employee.getEmailEmployee());
            preparedStatement.setString(7, employee.getAddressEmployee());
            preparedStatement.setInt(8, employee.getIdPosition());
            preparedStatement.setInt(9, employee.getIdEducationDegree());
            preparedStatement.setInt(10, employee.getIdDivision());
            preparedStatement.setInt(11, employee.getIdEmployee());


            rowUpdate = preparedStatement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowUpdate;
    }

    @Override
    public List<Employee> searchByNamePositionEmail(String keywordName, String keywordPosition, String keywordEmail) throws SQLException {
        // using try-with-resources to avoid closing resources (boiler plate code)
        List<Employee> employeeList = new ArrayList<>();
        // Step 1: Establishing a Connection
        Connection connection = baseRepository.getConnection();

        // Step 2:Create a statement using connection object
        PreparedStatement preparedStatement = connection.
                prepareStatement("select * from employee  where employee_name like ? and cast(position_id as char ) like ? and employee_email like ?");
        {
            preparedStatement.setString(1, "%" + keywordName + "%");
            preparedStatement.setString(2, keywordPosition);
            preparedStatement.setString(3, "%" + keywordEmail + "%");
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (resultSet.next()) {
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
                employeeList.add(new Employee(id, name, birthdate, employeeIdCard, employeeSalary, employeePhone, employeeEmail, employeeAddress, positionId, educationDegreeId, divisionId));
            }

            return employeeList;
        }
    }

    @Override
    public Employee findById(int id) {
        // truy vấn từ JAVA đến DB
        try {
            PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement(SELECT_ID_EMPLOYEE);
// Xử lí kết quả ở JAVA sau khi truy vấn
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();// khi sd truy vấn(select) thì dùng executeQuery còn lại thì dùng executeUpdate;
            if (resultSet.next()) {
                int idE = resultSet.getInt("employee_id");
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
                return new Employee(idE, name, birthdate, employeeIdCard, employeeSalary, employeePhone, employeeEmail, employeeAddress, positionId, educationDegreeId, divisionId);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;

    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
