package case_study.service;

import case_study.model.Customer;
import case_study.model.Service;

import java.sql.SQLException;
import java.util.List;

public interface ServiceService {
    List<Service> selectAllService();
    void insertCustomer(Service service) throws SQLException;


}
