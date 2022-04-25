package case_study.service;

import case_study.model.Customer;


import java.sql.SQLException;
import java.util.List;


public interface CustomerService{
    List<Customer> selectAllCustomer();

    void insertCustomer(Customer customer) throws SQLException;

    boolean deleteCustomer(int id) throws SQLException;

    Customer findById(int id);

    boolean updateCustomer(Customer customer);

    List<Customer> searchName(String name);


}
