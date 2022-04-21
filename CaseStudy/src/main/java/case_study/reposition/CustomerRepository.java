package case_study.reposition;

import case_study.model.Customer;

import java.sql.SQLException;
import java.util.Currency;
import java.util.List;

public interface CustomerRepository {

    List<Customer> selectAllCustomer();
    Customer findById(int id);

    void insertCustomer(Customer customer) throws SQLException;

    boolean deleteCustomer(int id) throws SQLException;

    boolean updateCustomer(Customer customer);
    List<Customer> searchName(String name);;

}
