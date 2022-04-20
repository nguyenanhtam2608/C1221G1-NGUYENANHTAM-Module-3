package case_study.reposition.impl;

import case_study.model.Customer;
import case_study.reposition.BaseRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements case_study.reposition.CustomerRepository {
    private static final String SELECT_ALL_CUSTOMER = "select * from customer";
    private static final String INSERT_CUSTOMER = "insert into customer (customer_type_id ,customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address) values( ?,?,?,?,?,?,?,?);";
    private static final String DELETE_CUSTOMER = "delete from customer where customer_id =?";
    private static final String SELECT_ID_CUSTOMER = "select * from customer where customer_id=?";
    private static final String UPDATE_CUSTOMER = "update customer set customer_type_id = ?, customer_name = ?,  customer_birthday = ? , customer_gender = ?, customer_id_card=?, customer_phone = ?, customer_email=?,customer_address=?";
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Customer> selectAllCustomer() {
        List<Customer> customers = new ArrayList<>();
        // truy vấn từ JAVA đến DB
        try {
            PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement(SELECT_ALL_CUSTOMER);
// Xử lí kết quả ở JAVA sau khi truy vấn
            ResultSet resultSet = preparedStatement.executeQuery();// khi sd truy vấn(select) thì dùng executeQuery còn lại thì dùng executeUpdate;
            while (resultSet.next()) {
                int id = resultSet.getInt("customer_id");// get.. ("")Trong dấu ngoặc kép phải giống trong db
                int type_id = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                int gender = Integer.parseInt(resultSet.getString("customer_gender"));
                int id_card = Integer.parseInt(resultSet.getString("customer_id_card"));
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                customers.add(new Customer(id, type_id, name, birthday, gender, id_card, phone, email, address));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customers;
    }

    @Override
    public Customer findById(int id) {

        // truy vấn từ JAVA đến DB
        try {
            PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement(SELECT_ID_CUSTOMER);
// Xử lí kết quả ở JAVA sau khi truy vấn
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();// khi sd truy vấn(select) thì dùng executeQuery còn lại thì dùng executeUpdate;
            if (resultSet.next()) {
                int type_id = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                int gender = Integer.parseInt(resultSet.getString("customer_gender"));
                int id_card = Integer.parseInt(resultSet.getString("customer_id_card"));
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                return new Customer(id, type_id, name, birthday, gender, id_card, phone, email, address);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }


    @Override
    public void insertCustomer(Customer customer) throws SQLException {
        System.out.println(INSERT_CUSTOMER);
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER);
            preparedStatement.setInt(1, customer.getCustomer_type_id());
            preparedStatement.setString(2, customer.getCustomer_name());
            preparedStatement.setString(3, customer.getCustomer_birthday());
            preparedStatement.setInt(4, customer.getCustomer_gender());
            preparedStatement.setInt(5, customer.getCustomer_id_card());
            preparedStatement.setString(6, customer.getCustomer_phone());
            preparedStatement.setString(7, customer.getCustomer_email());
            preparedStatement.setString(8, customer.getCustomer_address());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }


    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        boolean rowDelete;
        Connection connection = baseRepository.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CUSTOMER);
        preparedStatement.setInt(1, id);
        rowDelete = preparedStatement.executeUpdate() > 0; //có phần tử mới được xóa
        return rowDelete;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        boolean rowUpdate = false;
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER);
            preparedStatement.setInt(1, customer.getCustomer_type_id());
            preparedStatement.setString(2, customer.getCustomer_name());
            preparedStatement.setString(3, customer.getCustomer_birthday());
            preparedStatement.setInt(4, customer.getCustomer_gender());
            preparedStatement.setInt(5, customer.getCustomer_id_card());
            preparedStatement.setString(6, customer.getCustomer_phone());
            preparedStatement.setString(7, customer.getCustomer_email());
            preparedStatement.setString(8, customer.getCustomer_address());

            rowUpdate =preparedStatement.executeUpdate() >0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowUpdate;
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
