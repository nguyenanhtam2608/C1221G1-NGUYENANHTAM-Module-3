package case_study.service.impl;

import case_study.common.Validate;
import case_study.model.Customer;
import case_study.reposition.CustomerRepository;
import case_study.reposition.impl.CustomerRepositoryImpl;
import case_study.service.CustomerService;


import javax.servlet.http.HttpServletRequest;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> selectAllCustomer() {
        return customerRepository.selectAllCustomer();
    }

    @Override
    public void insertCustomer(Customer customer) throws SQLException {
        customerRepository.insertCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        return customerRepository.deleteCustomer(id);
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return customerRepository.updateCustomer(customer);
    }

    @Override
    public List<Customer> searchName(String name) {
        return customerRepository.searchName(name);
    }
}

