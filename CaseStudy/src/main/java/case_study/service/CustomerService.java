package case_study.service;

import case_study.model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
    public List<Customer> selectAllCustomer();
    public void insertCustomer(Customer customer) throws SQLException;
    public boolean deleteCustomer(int id) throws SQLException;
    Customer findById(int id);
    boolean updateCustomer(Customer customer);
}
